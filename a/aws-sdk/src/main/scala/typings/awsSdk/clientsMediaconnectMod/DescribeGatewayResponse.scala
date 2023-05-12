package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayResponse extends StObject {
  
  var Gateway: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Gateway] = js.undefined
}
object DescribeGatewayResponse {
  
  inline def apply(): DescribeGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setGateway(value: Gateway): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
  }
}
