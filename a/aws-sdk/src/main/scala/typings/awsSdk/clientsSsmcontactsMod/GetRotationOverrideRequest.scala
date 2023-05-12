package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRotationOverrideRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the overridden rotation to retrieve information about.
    */
  var RotationId: SsmContactsArn
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation override to retrieve information about.
    */
  var RotationOverrideId: Uuid
}
object GetRotationOverrideRequest {
  
  inline def apply(RotationId: SsmContactsArn, RotationOverrideId: Uuid): GetRotationOverrideRequest = {
    val __obj = js.Dynamic.literal(RotationId = RotationId.asInstanceOf[js.Any], RotationOverrideId = RotationOverrideId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRotationOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRotationOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
    
    inline def setRotationOverrideId(value: Uuid): Self = StObject.set(x, "RotationOverrideId", value.asInstanceOf[js.Any])
  }
}
