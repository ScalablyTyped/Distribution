package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Entity resource that is associated with the resource policy.
    */
  var ResourceArn: ResourceARN
}
object GetResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceARN): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
