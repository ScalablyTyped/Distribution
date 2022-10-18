package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteRackPhysicalPropertiesInput extends StObject {
  
  /**
    * The type of fiber that you will use to attach the Outpost to your network. 
    */
  var FiberOpticCableType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.FiberOpticCableType] = js.undefined
  
  /**
    * The maximum rack weight that this site can support. NO_LIMIT is over 2000lbs. 
    */
  var MaximumSupportedWeightLbs: js.UndefOr[typings.awsSdk.clientsOutpostsMod.MaximumSupportedWeightLbs] = js.undefined
  
  /**
    * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements for racks, see Network in the Amazon Web Services Outposts User Guide.     OPTIC_10GBASE_SR: 10GBASE-SR    OPTIC_10GBASE_IR: 10GBASE-IR    OPTIC_10GBASE_LR: 10GBASE-LR    OPTIC_40GBASE_SR: 40GBASE-SR    OPTIC_40GBASE_ESR: 40GBASE-ESR    OPTIC_40GBASE_IR4_LR4L: 40GBASE-IR (LR4L)    OPTIC_40GBASE_LR4: 40GBASE-LR4    OPTIC_100GBASE_SR4: 100GBASE-SR4    OPTIC_100GBASE_CWDM4: 100GBASE-CWDM4    OPTIC_100GBASE_LR4: 100GBASE-LR4    OPTIC_100G_PSM4_MSA: 100G PSM4 MSA    OPTIC_1000BASE_LX: 1000Base-LX    OPTIC_1000BASE_SX : 1000Base-SX  
    */
  var OpticalStandard: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OpticalStandard] = js.undefined
  
  /**
    * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the correlation between PowerPhase and PowerConnector.    Single-phase AC feed    L6-30P – (common in US); 30A; single phase    IEC309 (blue) – P+N+E, 6hr; 32 A; single phase     Three-phase AC feed    AH530P7W (red) – 3P+N+E, 7hr; 30A; three phase    AH532P6W (red) – 3P+N+E, 6hr; 32A; three phase    
    */
  var PowerConnector: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerConnector] = js.undefined
  
  /**
    * The power draw, in kVA, available at the hardware placement position for the rack.
    */
  var PowerDrawKva: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerDrawKva] = js.undefined
  
  /**
    * Indicates whether the power feed comes above or below the rack. 
    */
  var PowerFeedDrop: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerFeedDrop] = js.undefined
  
  /**
    * The power option that you can provide for hardware.    Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz   Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz  
    */
  var PowerPhase: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PowerPhase] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site. 
    */
  var SiteId: typings.awsSdk.clientsOutpostsMod.SiteId
  
  /**
    * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network device that you intend to use to connect the rack to your network. Note the correlation between UplinkGbps and UplinkCount.    1Gbps - Uplinks available: 1, 2, 4, 6, 8   10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16   40 and 100 Gbps- Uplinks available: 1, 2, 4  
    */
  var UplinkCount: js.UndefOr[typings.awsSdk.clientsOutpostsMod.UplinkCount] = js.undefined
  
  /**
    * The uplink speed the rack should support for the connection to the Region. 
    */
  var UplinkGbps: js.UndefOr[typings.awsSdk.clientsOutpostsMod.UplinkGbps] = js.undefined
}
object UpdateSiteRackPhysicalPropertiesInput {
  
  inline def apply(SiteId: SiteId): UpdateSiteRackPhysicalPropertiesInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteRackPhysicalPropertiesInput]
  }
  
  extension [Self <: UpdateSiteRackPhysicalPropertiesInput](x: Self) {
    
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
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setUplinkCount(value: UplinkCount): Self = StObject.set(x, "UplinkCount", value.asInstanceOf[js.Any])
    
    inline def setUplinkCountUndefined: Self = StObject.set(x, "UplinkCount", js.undefined)
    
    inline def setUplinkGbps(value: UplinkGbps): Self = StObject.set(x, "UplinkGbps", value.asInstanceOf[js.Any])
    
    inline def setUplinkGbpsUndefined: Self = StObject.set(x, "UplinkGbps", js.undefined)
  }
}
