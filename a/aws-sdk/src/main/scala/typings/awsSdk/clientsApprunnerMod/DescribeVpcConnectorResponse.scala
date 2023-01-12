package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcConnectorResponse extends StObject {
  
  /**
    * A description of the App Runner VPC connector that you specified in this request.
    */
  var VpcConnector: typings.awsSdk.clientsApprunnerMod.VpcConnector
}
object DescribeVpcConnectorResponse {
  
  inline def apply(VpcConnector: VpcConnector): DescribeVpcConnectorResponse = {
    val __obj = js.Dynamic.literal(VpcConnector = VpcConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcConnector(value: VpcConnector): Self = StObject.set(x, "VpcConnector", value.asInstanceOf[js.Any])
  }
}
