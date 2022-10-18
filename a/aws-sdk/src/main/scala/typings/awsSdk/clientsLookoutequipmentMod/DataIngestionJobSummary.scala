package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIngestionJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset used in the data ingestion job. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * The name of the dataset used for the data ingestion job. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    *  Specifies information for the input data for the data inference job, including data Amazon S3 location parameters. 
    */
  var IngestionInputConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestionInputConfiguration] = js.undefined
  
  /**
    * Indicates the job ID of the data ingestion job. 
    */
  var JobId: js.UndefOr[IngestionJobId] = js.undefined
  
  /**
    * Indicates the status of the data ingestion job. 
    */
  var Status: js.UndefOr[IngestionJobStatus] = js.undefined
}
object DataIngestionJobSummary {
  
  inline def apply(): DataIngestionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataIngestionJobSummary]
  }
  
  extension [Self <: DataIngestionJobSummary](x: Self) {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setIngestionInputConfiguration(value: IngestionInputConfiguration): Self = StObject.set(x, "IngestionInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIngestionInputConfigurationUndefined: Self = StObject.set(x, "IngestionInputConfiguration", js.undefined)
    
    inline def setJobId(value: IngestionJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setStatus(value: IngestionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
