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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBatchSegmentJobResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchSegmentJob(value: BatchSegmentJob): Self = StObject.set(x, "batchSegmentJob", value.asInstanceOf[js.Any])
    
    inline def setBatchSegmentJobUndefined: Self = StObject.set(x, "batchSegmentJob", js.undefined)
  }
}
