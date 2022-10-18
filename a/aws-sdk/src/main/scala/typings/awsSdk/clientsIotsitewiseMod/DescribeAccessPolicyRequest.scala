package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID
}
object DescribeAccessPolicyRequest {
  
  inline def apply(accessPolicyId: ID): DescribeAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPolicyRequest]
  }
  
  extension [Self <: DescribeAccessPolicyRequest](x: Self) {
    
    inline def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
  }
}
