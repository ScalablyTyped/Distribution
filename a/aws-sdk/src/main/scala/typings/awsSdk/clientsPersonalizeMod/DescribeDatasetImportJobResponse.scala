package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetImportJobResponse extends StObject {
  
  /**
    * Information about the dataset import job, including the status. The status is one of the following values:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var datasetImportJob: js.UndefOr[DatasetImportJob] = js.undefined
}
object DescribeDatasetImportJobResponse {
  
  inline def apply(): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
  
  extension [Self <: DescribeDatasetImportJobResponse](x: Self) {
    
    inline def setDatasetImportJob(value: DatasetImportJob): Self = StObject.set(x, "datasetImportJob", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobUndefined: Self = StObject.set(x, "datasetImportJob", js.undefined)
  }
}
