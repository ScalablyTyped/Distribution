package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that contains the data to export.
    */
  var datasetArn: Arn
  
  /**
    * The data to export, based on how you imported the data. You can choose to export only BULK data that you imported using a dataset import job, only PUT data that you imported incrementally (using the console, PutEvents, PutUsers and PutItems operations), or ALL for both types. The default value is PUT. 
    */
  var ingestionMode: js.UndefOr[IngestionMode] = js.undefined
  
  /**
    * The name for the dataset export job.
    */
  var jobName: Name
  
  /**
    * The path to the Amazon S3 bucket where the job's output is stored.
    */
  var jobOutput: DatasetExportJobOutput
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that has permissions to add data to your output Amazon S3 bucket.
    */
  var roleArn: RoleArn
  
  /**
    * A list of tags to apply to the dataset export job.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateDatasetExportJobRequest {
  
  inline def apply(datasetArn: Arn, jobName: Name, jobOutput: DatasetExportJobOutput, roleArn: RoleArn): CreateDatasetExportJobRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobOutput = jobOutput.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setIngestionMode(value: IngestionMode): Self = StObject.set(x, "ingestionMode", value.asInstanceOf[js.Any])
    
    inline def setIngestionModeUndefined: Self = StObject.set(x, "ingestionMode", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobOutput(value: DatasetExportJobOutput): Self = StObject.set(x, "jobOutput", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
