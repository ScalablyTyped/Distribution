package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteResourceShareCreatedFromPolicyRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the resource share to promote.
    */
  var resourceShareArn: String
}
object PromoteResourceShareCreatedFromPolicyRequest {
  
  inline def apply(resourceShareArn: String): PromoteResourceShareCreatedFromPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromoteResourceShareCreatedFromPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
