package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataIngestionJobRequest extends StObject {
  
  /**
    * The job ID of the data ingestion job. 
    */
  var JobId: IngestionJobId
}
object DescribeDataIngestionJobRequest {
  
  inline def apply(JobId: IngestionJobId): DescribeDataIngestionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataIngestionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDataIngestionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: IngestionJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
