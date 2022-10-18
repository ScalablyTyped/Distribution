package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The ARN of the Glue resource for which to retrieve the resource policy. If not supplied, the Data Catalog resource policy is returned. Use GetResourcePolicies to view all existing resource policies. For more information see Specifying Glue Resource ARNs. 
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
}
object GetResourcePolicyRequest {
  
  inline def apply(): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  extension [Self <: GetResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
