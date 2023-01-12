package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRImportJobRequest extends StObject {
  
  /**
    * The AWS-generated ID of the Data Store.
    */
  var DatastoreId: typings.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The AWS-generated job ID.
    */
  var JobId: typings.awsSdk.clientsHealthlakeMod.JobId
}
object DescribeFHIRImportJobRequest {
  
  inline def apply(DatastoreId: DatastoreId, JobId: JobId): DescribeFHIRImportJobRequest = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFHIRImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
