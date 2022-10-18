package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityDescription extends StObject {
  
  /**
    * Describes the connector's auto scaling capacity.
    */
  var autoScaling: js.UndefOr[AutoScalingDescription] = js.undefined
  
  /**
    * Describes a connector's provisioned capacity.
    */
  var provisionedCapacity: js.UndefOr[ProvisionedCapacityDescription] = js.undefined
}
object CapacityDescription {
  
  inline def apply(): CapacityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityDescription]
  }
  
  extension [Self <: CapacityDescription](x: Self) {
    
    inline def setAutoScaling(value: AutoScalingDescription): Self = StObject.set(x, "autoScaling", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingUndefined: Self = StObject.set(x, "autoScaling", js.undefined)
    
    inline def setProvisionedCapacity(value: ProvisionedCapacityDescription): Self = StObject.set(x, "provisionedCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedCapacityUndefined: Self = StObject.set(x, "provisionedCapacity", js.undefined)
  }
}
