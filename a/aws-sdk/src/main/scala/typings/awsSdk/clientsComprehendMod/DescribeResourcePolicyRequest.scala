package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the policy to describe.
    */
  var ResourceArn: ComprehendModelArn
}
object DescribeResourcePolicyRequest {
  
  inline def apply(ResourceArn: ComprehendModelArn): DescribeResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePolicyRequest]
  }
  
  extension [Self <: DescribeResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ComprehendModelArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
