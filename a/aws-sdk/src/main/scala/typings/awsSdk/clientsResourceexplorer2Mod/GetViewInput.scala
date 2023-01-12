package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetViewInput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view that you want information about.
    */
  var ViewArn: GetViewInputViewArnString
}
object GetViewInput {
  
  inline def apply(ViewArn: GetViewInputViewArnString): GetViewInput = {
    val __obj = js.Dynamic.literal(ViewArn = ViewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetViewInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetViewInput] (val x: Self) extends AnyVal {
    
    inline def setViewArn(value: GetViewInputViewArnString): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
  }
}
