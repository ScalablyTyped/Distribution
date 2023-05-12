package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayInstanceResponse extends StObject {
  
  var GatewayInstance: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.GatewayInstance] = js.undefined
}
object DescribeGatewayInstanceResponse {
  
  inline def apply(): DescribeGatewayInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGatewayInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayInstance(value: GatewayInstance): Self = StObject.set(x, "GatewayInstance", value.asInstanceOf[js.Any])
    
    inline def setGatewayInstanceUndefined: Self = StObject.set(x, "GatewayInstance", js.undefined)
  }
}
