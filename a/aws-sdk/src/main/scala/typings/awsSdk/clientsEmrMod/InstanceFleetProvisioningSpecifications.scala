package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetProvisioningSpecifications extends StObject {
  
  /**
    *  The launch specification for On-Demand Instances in the instance fleet, which determines the allocation strategy.   The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later, excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and later. 
    */
  var OnDemandSpecification: js.UndefOr[OnDemandProvisioningSpecification] = js.undefined
  
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration, provisioning timeout behavior, and allocation strategy.
    */
  var SpotSpecification: js.UndefOr[SpotProvisioningSpecification] = js.undefined
}
object InstanceFleetProvisioningSpecifications {
  
  inline def apply(): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFleetProvisioningSpecifications] (val x: Self) extends AnyVal {
    
    inline def setOnDemandSpecification(value: OnDemandProvisioningSpecification): Self = StObject.set(x, "OnDemandSpecification", value.asInstanceOf[js.Any])
    
    inline def setOnDemandSpecificationUndefined: Self = StObject.set(x, "OnDemandSpecification", js.undefined)
    
    inline def setSpotSpecification(value: SpotProvisioningSpecification): Self = StObject.set(x, "SpotSpecification", value.asInstanceOf[js.Any])
    
    inline def setSpotSpecificationUndefined: Self = StObject.set(x, "SpotSpecification", js.undefined)
  }
}
