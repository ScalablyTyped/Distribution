package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway that you want to describe.
    */
  var GatewayArn: string
}
object DescribeGatewayRequest {
  
  inline def apply(GatewayArn: string): DescribeGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: string): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
