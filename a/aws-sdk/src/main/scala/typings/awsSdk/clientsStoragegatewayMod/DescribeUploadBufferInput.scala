package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUploadBufferInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object DescribeUploadBufferInput {
  
  inline def apply(GatewayARN: GatewayARN): DescribeUploadBufferInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUploadBufferInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUploadBufferInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
