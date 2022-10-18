package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the action.
    */
  var ActionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ActionArn] = js.undefined
}
object CreateActionResponse {
  
  inline def apply(): CreateActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateActionResponse]
  }
  
  extension [Self <: CreateActionResponse](x: Self) {
    
    inline def setActionArn(value: ActionArn): Self = StObject.set(x, "ActionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "ActionArn", js.undefined)
  }
}
