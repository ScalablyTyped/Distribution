package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRotationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation to delete.
    */
  var RotationId: SsmContactsArn
}
object DeleteRotationRequest {
  
  inline def apply(RotationId: SsmContactsArn): DeleteRotationRequest = {
    val __obj = js.Dynamic.literal(RotationId = RotationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRotationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRotationRequest] (val x: Self) extends AnyVal {
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
  }
}
