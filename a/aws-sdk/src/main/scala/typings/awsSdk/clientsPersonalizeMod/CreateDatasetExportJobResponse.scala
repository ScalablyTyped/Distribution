package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetExportJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset export job.
    */
  var datasetExportJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateDatasetExportJobResponse {
  
  inline def apply(): CreateDatasetExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetExportJobResponse]
  }
  
  extension [Self <: CreateDatasetExportJobResponse](x: Self) {
    
    inline def setDatasetExportJobArn(value: Arn): Self = StObject.set(x, "datasetExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetExportJobArnUndefined: Self = StObject.set(x, "datasetExportJobArn", js.undefined)
  }
}
