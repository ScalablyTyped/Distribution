package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacitySpecification extends StObject {
  
  /**
    * The throughput capacity specified for read operations defined in read capacity units (RCUs).
    */
  var readCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
  
  /**
    * The read/write throughput capacity mode for a table. The options are: • throughputMode:PAY_PER_REQUEST and  • throughputMode:PROVISIONED - Provisioned capacity mode requires readCapacityUnits and writeCapacityUnits as input. The default is throughput_mode:PAY_PER_REQUEST. For more information, see Read/write capacity modes in the Amazon Keyspaces Developer Guide.
    */
  var throughputMode: ThroughputMode
  
  /**
    * The throughput capacity specified for write operations defined in write capacity units (WCUs).
    */
  var writeCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
}
object CapacitySpecification {
  
  inline def apply(throughputMode: ThroughputMode): CapacitySpecification = {
    val __obj = js.Dynamic.literal(throughputMode = throughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacitySpecification]
  }
  
  extension [Self <: CapacitySpecification](x: Self) {
    
    inline def setReadCapacityUnits(value: CapacityUnits): Self = StObject.set(x, "readCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "readCapacityUnits", js.undefined)
    
    inline def setThroughputMode(value: ThroughputMode): Self = StObject.set(x, "throughputMode", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnits(value: CapacityUnits): Self = StObject.set(x, "writeCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "writeCapacityUnits", js.undefined)
  }
}
