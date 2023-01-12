package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanningStatistics extends StObject {
  
  /**
    * An estimate of the data that was scanned in bytes.
    */
  var EstimatedDataToScanBytes: js.UndefOr[NumberOfBytes] = js.undefined
  
  /**
    * The time that it took to process the request.
    */
  var PlanningTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined
  
  /**
    * The time the request was in queue to be processed.
    */
  var QueueTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined
  
  /**
    * The number of work units generated.
    */
  var WorkUnitsGeneratedCount: js.UndefOr[NumberOfItems] = js.undefined
}
object PlanningStatistics {
  
  inline def apply(): PlanningStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanningStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanningStatistics] (val x: Self) extends AnyVal {
    
    inline def setEstimatedDataToScanBytes(value: NumberOfBytes): Self = StObject.set(x, "EstimatedDataToScanBytes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedDataToScanBytesUndefined: Self = StObject.set(x, "EstimatedDataToScanBytes", js.undefined)
    
    inline def setPlanningTimeMillis(value: NumberOfMilliseconds): Self = StObject.set(x, "PlanningTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setPlanningTimeMillisUndefined: Self = StObject.set(x, "PlanningTimeMillis", js.undefined)
    
    inline def setQueueTimeMillis(value: NumberOfMilliseconds): Self = StObject.set(x, "QueueTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setQueueTimeMillisUndefined: Self = StObject.set(x, "QueueTimeMillis", js.undefined)
    
    inline def setWorkUnitsGeneratedCount(value: NumberOfItems): Self = StObject.set(x, "WorkUnitsGeneratedCount", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitsGeneratedCountUndefined: Self = StObject.set(x, "WorkUnitsGeneratedCount", js.undefined)
  }
}
