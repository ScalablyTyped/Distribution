package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterComputeInput extends StObject {
  
  /**
    * The path to the TLS certificate on your compute resource. The path and certificate are not validated by Amazon GameLift.
    */
  var CertificatePath: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A descriptive label that is associated with the compute resource registered to your fleet.
    */
  var ComputeName: typings.awsSdk.clientsGameliftMod.ComputeName
  
  /**
    * The DNS name of the compute resource. Amazon GameLift requires the DNS name or IP address to manage your compute resource.
    */
  var DnsName: js.UndefOr[DnsNameInput] = js.undefined
  
  /**
    * A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The IP address of the compute resource. Amazon GameLift requires the DNS name or IP address to manage your compute resource.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsGameliftMod.IpAddress] = js.undefined
  
  /**
    * The name of the custom location you added to the fleet you are registering this compute resource to.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object RegisterComputeInput {
  
  inline def apply(ComputeName: ComputeName, FleetId: FleetIdOrArn): RegisterComputeInput = {
    val __obj = js.Dynamic.literal(ComputeName = ComputeName.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterComputeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterComputeInput] (val x: Self) extends AnyVal {
    
    inline def setCertificatePath(value: NonZeroAndMaxString): Self = StObject.set(x, "CertificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "CertificatePath", js.undefined)
    
    inline def setComputeName(value: ComputeName): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setDnsName(value: DnsNameInput): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
