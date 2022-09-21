package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcConnectorResponse extends StObject {
  
  /**
    * A description of the App Runner VPC connector that you specified in this request.
    */
  var VpcConnector: typings.awsSdk.apprunnerMod.VpcConnector
}
object DescribeVpcConnectorResponse {
  
  inline def apply(VpcConnector: VpcConnector): DescribeVpcConnectorResponse = {
    val __obj = js.Dynamic.literal(VpcConnector = VpcConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcConnectorResponse]
  }
  
  extension [Self <: DescribeVpcConnectorResponse](x: Self) {
    
    inline def setVpcConnector(value: VpcConnector): Self = StObject.set(x, "VpcConnector", value.asInstanceOf[js.Any])
  }
}
