package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRotationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation to retrieve information about.
    */
  var RotationId: SsmContactsArn
}
object GetRotationRequest {
  
  inline def apply(RotationId: SsmContactsArn): GetRotationRequest = {
    val __obj = js.Dynamic.literal(RotationId = RotationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRotationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRotationRequest] (val x: Self) extends AnyVal {
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
  }
}
