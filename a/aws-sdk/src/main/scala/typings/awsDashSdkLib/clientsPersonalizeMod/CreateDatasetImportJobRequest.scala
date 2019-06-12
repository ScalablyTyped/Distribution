package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: DataSource
  /**
    * The ARN of the dataset that receives the imported data.
    */
  var datasetArn: Arn
  /**
    * The name for the dataset import job.
    */
  var jobName: Name
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: RoleArn
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(dataSource: DataSource, datasetArn: Arn, jobName: Name, roleArn: RoleArn): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource, datasetArn = datasetArn, jobName = jobName, roleArn = roleArn)
  
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
}

