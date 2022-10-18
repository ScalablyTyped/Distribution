package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchSegmentJobResponse extends StObject {
  
  /**
    * Information on the specified batch segment job.
    */
  var batchSegmentJob: js.UndefOr[BatchSegmentJob] = js.undefined
}
object DescribeBatchSegmentJobResponse {
  
  inline def apply(): DescribeBatchSegmentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchSegmentJobResponse]
  }
  
  extension [Self <: DescribeBatchSegmentJobResponse](x: Self) {
    
    inline def setBatchSegmentJob(value: BatchSegmentJob): Self = StObject.set(x, "batchSegmentJob", value.asInstanceOf[js.Any])
    
    inline def setBatchSegmentJobUndefined: Self = StObject.set(x, "batchSegmentJob", js.undefined)
  }
}
