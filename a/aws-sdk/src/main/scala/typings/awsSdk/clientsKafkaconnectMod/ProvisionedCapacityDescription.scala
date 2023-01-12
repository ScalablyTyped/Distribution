package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedCapacityDescription extends StObject {
  
  /**
    * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
    */
  var mcuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of workers that are allocated to the connector.
    */
  var workerCount: js.UndefOr[integer] = js.undefined
}
object ProvisionedCapacityDescription {
  
  inline def apply(): ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedCapacityDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedCapacityDescription] (val x: Self) extends AnyVal {
    
    inline def setMcuCount(value: integer): Self = StObject.set(x, "mcuCount", value.asInstanceOf[js.Any])
    
    inline def setMcuCountUndefined: Self = StObject.set(x, "mcuCount", js.undefined)
    
    inline def setWorkerCount(value: integer): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
  }
}
