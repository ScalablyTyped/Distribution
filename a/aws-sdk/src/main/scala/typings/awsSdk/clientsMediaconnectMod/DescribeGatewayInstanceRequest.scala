package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayInstanceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
    */
  var GatewayInstanceArn: string
}
object DescribeGatewayInstanceRequest {
  
  inline def apply(GatewayInstanceArn: string): DescribeGatewayInstanceRequest = {
    val __obj = js.Dynamic.literal(GatewayInstanceArn = GatewayInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setGatewayInstanceArn(value: string): Self = StObject.set(x, "GatewayInstanceArn", value.asInstanceOf[js.Any])
  }
}
