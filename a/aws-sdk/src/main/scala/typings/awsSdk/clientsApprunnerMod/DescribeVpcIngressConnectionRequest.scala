package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcIngressConnectionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner VPC Ingress Connection that you want a description for.
    */
  var VpcIngressConnectionArn: AppRunnerResourceArn
}
object DescribeVpcIngressConnectionRequest {
  
  inline def apply(VpcIngressConnectionArn: AppRunnerResourceArn): DescribeVpcIngressConnectionRequest = {
    val __obj = js.Dynamic.literal(VpcIngressConnectionArn = VpcIngressConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcIngressConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcIngressConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
  }
}
