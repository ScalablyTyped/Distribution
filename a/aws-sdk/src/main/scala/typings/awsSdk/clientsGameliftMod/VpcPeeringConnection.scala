package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnection extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift fleet resource for this connection. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed by Amazon GameLift and does not appear in your Amazon Web Services account. 
    */
  var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created. 
    */
  var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the Amazon Web Services Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStatus] = js.undefined
  
  /**
    * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering connection events, and is used when deleting a connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object VpcPeeringConnection {
  
  inline def apply(): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcPeeringConnection] (val x: Self) extends AnyVal {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setGameLiftVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameLiftVpcId", value.asInstanceOf[js.Any])
    
    inline def setGameLiftVpcIdUndefined: Self = StObject.set(x, "GameLiftVpcId", js.undefined)
    
    inline def setIpV4CidrBlock(value: NonZeroAndMaxString): Self = StObject.set(x, "IpV4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpV4CidrBlockUndefined: Self = StObject.set(x, "IpV4CidrBlock", js.undefined)
    
    inline def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcIdUndefined: Self = StObject.set(x, "PeerVpcId", js.undefined)
    
    inline def setStatus(value: VpcPeeringConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: NonZeroAndMaxString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
