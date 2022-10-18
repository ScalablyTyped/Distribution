package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCapacity extends StObject {
  
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.undefined
}
object InstanceCapacity {
  
  inline def apply(): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCapacity]
  }
  
  extension [Self <: InstanceCapacity](x: Self) {
    
    inline def setAvailableCapacity(value: Integer): Self = StObject.set(x, "AvailableCapacity", value.asInstanceOf[js.Any])
    
    inline def setAvailableCapacityUndefined: Self = StObject.set(x, "AvailableCapacity", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setTotalCapacity(value: Integer): Self = StObject.set(x, "TotalCapacity", value.asInstanceOf[js.Any])
    
    inline def setTotalCapacityUndefined: Self = StObject.set(x, "TotalCapacity", js.undefined)
  }
}
