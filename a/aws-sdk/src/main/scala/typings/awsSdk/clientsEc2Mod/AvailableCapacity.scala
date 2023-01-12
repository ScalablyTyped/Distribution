package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableCapacity extends StObject {
  
  /**
    * The number of instances that can be launched onto the Dedicated Host depending on the host's available capacity. For Dedicated Hosts that support multiple instance types, this parameter represents the number of instances for each instance size that is supported on the host.
    */
  var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.undefined
  
  /**
    * The number of vCPUs available for launching instances onto the Dedicated Host.
    */
  var AvailableVCpus: js.UndefOr[Integer] = js.undefined
}
object AvailableCapacity {
  
  inline def apply(): AvailableCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableCapacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableCapacity] (val x: Self) extends AnyVal {
    
    inline def setAvailableInstanceCapacity(value: AvailableInstanceCapacityList): Self = StObject.set(x, "AvailableInstanceCapacity", value.asInstanceOf[js.Any])
    
    inline def setAvailableInstanceCapacityUndefined: Self = StObject.set(x, "AvailableInstanceCapacity", js.undefined)
    
    inline def setAvailableInstanceCapacityVarargs(value: InstanceCapacity*): Self = StObject.set(x, "AvailableInstanceCapacity", js.Array(value*))
    
    inline def setAvailableVCpus(value: Integer): Self = StObject.set(x, "AvailableVCpus", value.asInstanceOf[js.Any])
    
    inline def setAvailableVCpusUndefined: Self = StObject.set(x, "AvailableVCpus", js.undefined)
  }
}
