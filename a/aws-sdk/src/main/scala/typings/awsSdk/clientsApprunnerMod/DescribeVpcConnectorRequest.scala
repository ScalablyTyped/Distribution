package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcConnectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for. The ARN must be a full VPC connector ARN.
    */
  var VpcConnectorArn: AppRunnerResourceArn
}
object DescribeVpcConnectorRequest {
  
  inline def apply(VpcConnectorArn: AppRunnerResourceArn): DescribeVpcConnectorRequest = {
    val __obj = js.Dynamic.literal(VpcConnectorArn = VpcConnectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setVpcConnectorArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcConnectorArn", value.asInstanceOf[js.Any])
  }
}
