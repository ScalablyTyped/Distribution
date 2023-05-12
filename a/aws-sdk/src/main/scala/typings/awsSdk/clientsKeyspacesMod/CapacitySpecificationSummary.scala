package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacitySpecificationSummary extends StObject {
  
  /**
    * The timestamp of the last operation that changed the provisioned throughput capacity of a table.
    */
  var lastUpdateToPayPerRequestTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The throughput capacity specified for read operations defined in read capacity units (RCUs).
    */
  var readCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
  
  /**
    * The read/write throughput capacity mode for a table. The options are:    throughputMode:PAY_PER_REQUEST and     throughputMode:PROVISIONED - Provisioned capacity mode requires readCapacityUnits and writeCapacityUnits as input.    The default is throughput_mode:PAY_PER_REQUEST. For more information, see Read/write capacity modes in the Amazon Keyspaces Developer Guide.
    */
  var throughputMode: ThroughputMode
  
  /**
    * The throughput capacity specified for write operations defined in write capacity units (WCUs).
    */
  var writeCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
}
object CapacitySpecificationSummary {
  
  inline def apply(throughputMode: ThroughputMode): CapacitySpecificationSummary = {
    val __obj = js.Dynamic.literal(throughputMode = throughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacitySpecificationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacitySpecificationSummary] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateToPayPerRequestTimestamp(value: js.Date): Self = StObject.set(x, "lastUpdateToPayPerRequestTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateToPayPerRequestTimestampUndefined: Self = StObject.set(x, "lastUpdateToPayPerRequestTimestamp", js.undefined)
    
    inline def setReadCapacityUnits(value: CapacityUnits): Self = StObject.set(x, "readCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "readCapacityUnits", js.undefined)
    
    inline def setThroughputMode(value: ThroughputMode): Self = StObject.set(x, "throughputMode", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnits(value: CapacityUnits): Self = StObject.set(x, "writeCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "writeCapacityUnits", js.undefined)
  }
}
