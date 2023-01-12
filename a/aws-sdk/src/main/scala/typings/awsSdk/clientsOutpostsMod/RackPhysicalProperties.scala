package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RackPhysicalProperties extends StObject {
  
  /**
    * The type of fiber used to attach the Outpost to the network. 
    */
  var FiberOpticCableType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.FiberOpticCableType] = js.undefined
  
  /**
    * The maximum rack weight that this site can support. NO_LIMIT is over 2000 lbs (907 kg). 
    */
  var MaximumSupportedWeightLbs: js.UndefOr[typings.awsSdk.clientsOutpostsMod.MaximumSupportedWeightLbs] = js.undefined
  
  /**
    * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements for racks, see Network in the Amazon Web Services Outposts User Guide. 
    */
  var OpticalStandard: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OpticalStandard] = js.undefined
  
  /**
    * The power connector for the hardware. 
    */
  var PowerConnector: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerConnector] = js.undefined
  
  /**
    * The power draw available at the hardware placement position for the rack. 
    */
  var PowerDrawKva: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerDrawKva] = js.undefined
  
  /**
    * The position of the power feed.
    */
  var PowerFeedDrop: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerFeedDrop] = js.undefined
  
  /**
    * The power option that you can provide for hardware.
    */
  var PowerPhase: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerPhase] = js.undefined
  
  /**
    * The number of uplinks each Outpost network device.
    */
  var UplinkCount: js.UndefOr[typings.awsSdk.clientsOutpostsMod.UplinkCount] = js.undefined
  
  /**
    * The uplink speed the rack supports for the connection to the Region. 
    */
  var UplinkGbps: js.UndefOr[typings.awsSdk.clientsOutpostsMod.UplinkGbps] = js.undefined
}
object RackPhysicalProperties {
  
  inline def apply(): RackPhysicalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RackPhysicalProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RackPhysicalProperties] (val x: Self) extends AnyVal {
    
    inline def setFiberOpticCableType(value: FiberOpticCableType): Self = StObject.set(x, "FiberOpticCableType", value.asInstanceOf[js.Any])
    
    inline def setFiberOpticCableTypeUndefined: Self = StObject.set(x, "FiberOpticCableType", js.undefined)
    
    inline def setMaximumSupportedWeightLbs(value: MaximumSupportedWeightLbs): Self = StObject.set(x, "MaximumSupportedWeightLbs", value.asInstanceOf[js.Any])
    
    inline def setMaximumSupportedWeightLbsUndefined: Self = StObject.set(x, "MaximumSupportedWeightLbs", js.undefined)
    
    inline def setOpticalStandard(value: OpticalStandard): Self = StObject.set(x, "OpticalStandard", value.asInstanceOf[js.Any])
    
    inline def setOpticalStandardUndefined: Self = StObject.set(x, "OpticalStandard", js.undefined)
    
    inline def setPowerConnector(value: PowerConnector): Self = StObject.set(x, "PowerConnector", value.asInstanceOf[js.Any])
    
    inline def setPowerConnectorUndefined: Self = StObject.set(x, "PowerConnector", js.undefined)
    
    inline def setPowerDrawKva(value: PowerDrawKva): Self = StObject.set(x, "PowerDrawKva", value.asInstanceOf[js.Any])
    
    inline def setPowerDrawKvaUndefined: Self = StObject.set(x, "PowerDrawKva", js.undefined)
    
    inline def setPowerFeedDrop(value: PowerFeedDrop): Self = StObject.set(x, "PowerFeedDrop", value.asInstanceOf[js.Any])
    
    inline def setPowerFeedDropUndefined: Self = StObject.set(x, "PowerFeedDrop", js.undefined)
    
    inline def setPowerPhase(value: PowerPhase): Self = StObject.set(x, "PowerPhase", value.asInstanceOf[js.Any])
    
    inline def setPowerPhaseUndefined: Self = StObject.set(x, "PowerPhase", js.undefined)
    
    inline def setUplinkCount(value: UplinkCount): Self = StObject.set(x, "UplinkCount", value.asInstanceOf[js.Any])
    
    inline def setUplinkCountUndefined: Self = StObject.set(x, "UplinkCount", js.undefined)
    
    inline def setUplinkGbps(value: UplinkGbps): Self = StObject.set(x, "UplinkGbps", value.asInstanceOf[js.Any])
    
    inline def setUplinkGbpsUndefined: Self = StObject.set(x, "UplinkGbps", js.undefined)
  }
}
