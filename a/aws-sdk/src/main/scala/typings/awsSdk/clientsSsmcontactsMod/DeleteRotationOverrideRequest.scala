package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRotationOverrideRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rotation that was overridden.
    */
  var RotationId: SsmContactsArn
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation override to delete.
    */
  var RotationOverrideId: Uuid
}
object DeleteRotationOverrideRequest {
  
  inline def apply(RotationId: SsmContactsArn, RotationOverrideId: Uuid): DeleteRotationOverrideRequest = {
    val __obj = js.Dynamic.literal(RotationId = RotationId.asInstanceOf[js.Any], RotationOverrideId = RotationOverrideId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRotationOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRotationOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
    
    inline def setRotationOverrideId(value: Uuid): Self = StObject.set(x, "RotationOverrideId", value.asInstanceOf[js.Any])
  }
}
