package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The policy document to set; formatted in JSON.
    */
  var Policy: ResourcePolicyJson
  
  /**
    * The Amazon Resource Name (ARN) of the Entity resource you want to associate with a resource policy. 
    */
  var ResourceArn: ResourceARN
}
object PutResourcePolicyRequest {
  
  inline def apply(Policy: ResourcePolicyJson, ResourceArn: ResourceARN): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResourcePolicyJson): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
