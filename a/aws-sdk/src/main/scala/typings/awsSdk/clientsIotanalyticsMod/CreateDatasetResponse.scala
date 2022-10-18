package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var datasetArn: js.UndefOr[DatasetArn] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var datasetName: js.UndefOr[DatasetName] = js.undefined
  
  /**
    * How long, in days, dataset contents are kept for the dataset.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object CreateDatasetResponse {
  
  inline def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  extension [Self <: CreateDatasetResponse](x: Self) {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "datasetName", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
