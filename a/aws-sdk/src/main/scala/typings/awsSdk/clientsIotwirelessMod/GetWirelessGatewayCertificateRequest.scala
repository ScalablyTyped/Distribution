package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayCertificateRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: WirelessGatewayId
}
object GetWirelessGatewayCertificateRequest {
  
  inline def apply(Id: WirelessGatewayId): GetWirelessGatewayCertificateRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
