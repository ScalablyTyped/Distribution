package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: DataSource
  
  /**
    * The ARN of the dataset that receives the imported data.
    */
  var datasetArn: Arn
  
  /**
    * Specify how to add the new records to an existing dataset. The default import mode is FULL. If you haven't imported bulk records into the dataset previously, you can only specify FULL.   Specify FULL to overwrite all existing bulk data in your dataset. Data you imported individually is not replaced.   Specify INCREMENTAL to append the new records to the existing data in your dataset. Amazon Personalize replaces any record with the same ID with the new one.  
    */
  var importMode: js.UndefOr[ImportMode] = js.undefined
  
  /**
    * The name for the dataset import job.
    */
  var jobName: Name
  
  /**
    * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
    */
  var publishAttributionMetricsToS3: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: RoleArn
  
  /**
    * A list of tags to apply to the dataset import job.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateDatasetImportJobRequest {
  
  inline def apply(dataSource: DataSource, datasetArn: Arn, jobName: Name, roleArn: RoleArn): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], datasetArn = datasetArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setImportMode(value: ImportMode): Self = StObject.set(x, "importMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "importMode", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setPublishAttributionMetricsToS3(value: Boolean): Self = StObject.set(x, "publishAttributionMetricsToS3", value.asInstanceOf[js.Any])
    
    inline def setPublishAttributionMetricsToS3Undefined: Self = StObject.set(x, "publishAttributionMetricsToS3", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
