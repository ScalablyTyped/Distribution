package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionTargetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom action target to delete.
    */
  var ActionTargetArn: NonEmptyString
}
object DeleteActionTargetRequest {
  
  inline def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionTargetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteActionTargetRequest] (val x: Self) extends AnyVal {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
