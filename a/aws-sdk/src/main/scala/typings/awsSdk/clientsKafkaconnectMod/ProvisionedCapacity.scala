package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedCapacity extends StObject {
  
  /**
    * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
    */
  var mcuCount: integerMin1Max8
  
  /**
    * The number of workers that are allocated to the connector.
    */
  var workerCount: integerMin1Max10
}
object ProvisionedCapacity {
  
  inline def apply(mcuCount: integerMin1Max8, workerCount: integerMin1Max10): ProvisionedCapacity = {
    val __obj = js.Dynamic.literal(mcuCount = mcuCount.asInstanceOf[js.Any], workerCount = workerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedCapacity]
  }
  
  extension [Self <: ProvisionedCapacity](x: Self) {
    
    inline def setMcuCount(value: integerMin1Max8): Self = StObject.set(x, "mcuCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCount(value: integerMin1Max10): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
  }
}
