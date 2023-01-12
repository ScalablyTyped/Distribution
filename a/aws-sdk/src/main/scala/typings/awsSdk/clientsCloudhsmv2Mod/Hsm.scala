package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hsm extends StObject {
  
  /**
    * The Availability Zone that contains the HSM.
    */
  var AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined
  
  /**
    * The identifier (ID) of the cluster that contains the HSM.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.ClusterId] = js.undefined
  
  /**
    * The identifier (ID) of the HSM's elastic network interface (ENI).
    */
  var EniId: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.EniId] = js.undefined
  
  /**
    * The IP address of the HSM's elastic network interface (ENI).
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The HSM's identifier (ID).
    */
  var HsmId: typings.awsSdk.clientsCloudhsmv2Mod.HsmId
  
  /**
    * The HSM's state.
    */
  var State: js.UndefOr[HsmState] = js.undefined
  
  /**
    * A description of the HSM's state.
    */
  var StateMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet that contains the HSM's elastic network interface (ENI).
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.SubnetId] = js.undefined
}
object Hsm {
  
  inline def apply(HsmId: HsmId): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hsm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hsm] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: ExternalAz): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setEniId(value: EniId): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    inline def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    inline def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    inline def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    inline def setHsmId(value: HsmId): Self = StObject.set(x, "HsmId", value.asInstanceOf[js.Any])
    
    inline def setState(value: HsmState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
