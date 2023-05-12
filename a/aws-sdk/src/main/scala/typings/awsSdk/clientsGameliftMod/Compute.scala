package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compute extends StObject {
  
  /**
    * The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across locations.
    */
  var ComputeArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeArn] = js.undefined
  
  /**
    * A descriptive label that is associated with the compute resource registered to your fleet.
    */
  var ComputeName: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeName] = js.undefined
  
  /**
    * Current status of the compute. A compute must have an ACTIVE status to host game sessions.
    */
  var ComputeStatus: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeStatus] = js.undefined
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The DNS name of the compute resource. Amazon GameLift requires the DNS name or IP address to manage your compute resource.
    */
  var DnsName: js.UndefOr[typings.awsSdk.clientsGameliftMod.DnsName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that the compute is registered to.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * The endpoint connection details of the Amazon GameLift SDK endpoint that your game server connects to.
    */
  var GameLiftServiceSdkEndpoint: js.UndefOr[GameLiftServiceSdkEndpointOutput] = js.undefined
  
  /**
    * The IP address of the compute resource. Amazon GameLift requires the DNS name or IP address to manage your compute resource.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsGameliftMod.IpAddress] = js.undefined
  
  /**
    * The name of the custom location you added to the fleet that this compute resource resides in.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * The type of operating system on your compute resource.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsGameliftMod.OperatingSystem] = js.undefined
  
  /**
    * The compute type that the fleet uses. A fleet can use Anywhere compute resources that you own, or use managed Amazon EC2 instances.
    */
  var Type: js.UndefOr[EC2InstanceType] = js.undefined
}
object Compute {
  
  inline def apply(): Compute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compute] (val x: Self) extends AnyVal {
    
    inline def setComputeArn(value: ComputeArn): Self = StObject.set(x, "ComputeArn", value.asInstanceOf[js.Any])
    
    inline def setComputeArnUndefined: Self = StObject.set(x, "ComputeArn", js.undefined)
    
    inline def setComputeName(value: ComputeName): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setComputeNameUndefined: Self = StObject.set(x, "ComputeName", js.undefined)
    
    inline def setComputeStatus(value: ComputeStatus): Self = StObject.set(x, "ComputeStatus", value.asInstanceOf[js.Any])
    
    inline def setComputeStatusUndefined: Self = StObject.set(x, "ComputeStatus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDnsName(value: DnsName): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setGameLiftServiceSdkEndpoint(value: GameLiftServiceSdkEndpointOutput): Self = StObject.set(x, "GameLiftServiceSdkEndpoint", value.asInstanceOf[js.Any])
    
    inline def setGameLiftServiceSdkEndpointUndefined: Self = StObject.set(x, "GameLiftServiceSdkEndpoint", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setType(value: EC2InstanceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
