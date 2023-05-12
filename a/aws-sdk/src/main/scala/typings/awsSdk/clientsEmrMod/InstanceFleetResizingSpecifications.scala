package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetResizingSpecifications extends StObject {
  
  /**
    * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period. 
    */
  var OnDemandResizeSpecification: js.UndefOr[OnDemandResizingSpecification] = js.undefined
  
  /**
    * The resize specification for Spot Instances in the instance fleet, which contains the resize timeout period. 
    */
  var SpotResizeSpecification: js.UndefOr[SpotResizingSpecification] = js.undefined
}
object InstanceFleetResizingSpecifications {
  
  inline def apply(): InstanceFleetResizingSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetResizingSpecifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFleetResizingSpecifications] (val x: Self) extends AnyVal {
    
    inline def setOnDemandResizeSpecification(value: OnDemandResizingSpecification): Self = StObject.set(x, "OnDemandResizeSpecification", value.asInstanceOf[js.Any])
    
    inline def setOnDemandResizeSpecificationUndefined: Self = StObject.set(x, "OnDemandResizeSpecification", js.undefined)
    
    inline def setSpotResizeSpecification(value: SpotResizingSpecification): Self = StObject.set(x, "SpotResizeSpecification", value.asInstanceOf[js.Any])
    
    inline def setSpotResizeSpecificationUndefined: Self = StObject.set(x, "SpotResizeSpecification", js.undefined)
  }
}
