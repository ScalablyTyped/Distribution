package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Entity resource that is associated with the resource policy.
    */
  var ResourceArn: ResourceARN
}
object DeleteResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceARN): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
