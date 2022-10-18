package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /**
    * Information about the auto scaling parameters for the connector.
    */
  var autoScaling: js.UndefOr[AutoScaling] = js.undefined
  
  /**
    * Details about a fixed capacity allocated to a connector.
    */
  var provisionedCapacity: js.UndefOr[ProvisionedCapacity] = js.undefined
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  extension [Self <: Capacity](x: Self) {
    
    inline def setAutoScaling(value: AutoScaling): Self = StObject.set(x, "autoScaling", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingUndefined: Self = StObject.set(x, "autoScaling", js.undefined)
    
    inline def setProvisionedCapacity(value: ProvisionedCapacity): Self = StObject.set(x, "provisionedCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedCapacityUndefined: Self = StObject.set(x, "provisionedCapacity", js.undefined)
  }
}
