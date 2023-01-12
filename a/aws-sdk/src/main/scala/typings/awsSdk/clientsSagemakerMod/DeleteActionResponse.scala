package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the action.
    */
  var ActionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ActionArn] = js.undefined
}
object DeleteActionResponse {
  
  inline def apply(): DeleteActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteActionResponse] (val x: Self) extends AnyVal {
    
    inline def setActionArn(value: ActionArn): Self = StObject.set(x, "ActionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "ActionArn", js.undefined)
  }
}
