package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessGatewayWithCertificateRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
  
  /**
    * The ID of the certificate to associate with the wireless gateway.
    */
  var IotCertificateId: typings.awsSdk.clientsIotwirelessMod.IotCertificateId
}
object AssociateWirelessGatewayWithCertificateRequest {
  
  inline def apply(Id: WirelessGatewayId, IotCertificateId: IotCertificateId): AssociateWirelessGatewayWithCertificateRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IotCertificateId = IotCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessGatewayWithCertificateRequest]
  }
  
  extension [Self <: AssociateWirelessGatewayWithCertificateRequest](x: Self) {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIotCertificateId(value: IotCertificateId): Self = StObject.set(x, "IotCertificateId", value.asInstanceOf[js.Any])
  }
}
