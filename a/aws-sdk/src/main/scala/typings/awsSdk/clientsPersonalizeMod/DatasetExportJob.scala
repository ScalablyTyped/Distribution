package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetExportJob extends StObject {
  
  /**
    * The creation date and time (in Unix time) of the dataset export job.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset to export.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset export job.
    */
  var datasetExportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * If a dataset export job fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The data to export, based on how you imported the data. You can choose to export BULK data that you imported using a dataset import job, PUT data that you imported incrementally (using the console, PutEvents, PutUsers and PutItems operations), or ALL for both types. The default value is PUT. 
    */
  var ingestionMode: js.UndefOr[IngestionMode] = js.undefined
  
  /**
    * The name of the export job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The path to the Amazon S3 bucket where the job's output is stored. For example:  s3://bucket-name/folder-name/ 
    */
  var jobOutput: js.UndefOr[DatasetExportJobOutput] = js.undefined
  
  /**
    * The date and time (in Unix time) the status of the dataset export job was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that has permissions to add data to your output Amazon S3 bucket.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the dataset export job. A dataset export job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object DatasetExportJob {
  
  inline def apply(): DatasetExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetExportJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetExportJob] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    inline def setDatasetExportJobArn(value: Arn): Self = StObject.set(x, "datasetExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetExportJobArnUndefined: Self = StObject.set(x, "datasetExportJobArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setIngestionMode(value: IngestionMode): Self = StObject.set(x, "ingestionMode", value.asInstanceOf[js.Any])
    
    inline def setIngestionModeUndefined: Self = StObject.set(x, "ingestionMode", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setJobOutput(value: DatasetExportJobOutput): Self = StObject.set(x, "jobOutput", value.asInstanceOf[js.Any])
    
    inline def setJobOutputUndefined: Self = StObject.set(x, "jobOutput", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
