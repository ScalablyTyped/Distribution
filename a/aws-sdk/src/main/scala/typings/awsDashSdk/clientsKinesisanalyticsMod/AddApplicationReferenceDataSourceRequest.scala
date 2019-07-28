package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationReferenceDataSourceRequest extends js.Object {
  /**
    * Name of an existing application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Version of the application for which you are adding the reference data source. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and the resulting in-application table that is created. You must also provide an IAM role with the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
    */
  var ReferenceDataSource: typings.awsDashSdk.clientsKinesisanalyticsMod.ReferenceDataSource
}

object AddApplicationReferenceDataSourceRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ReferenceDataSource: ReferenceDataSource
  ): AddApplicationReferenceDataSourceRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, ReferenceDataSource = ReferenceDataSource)
  
    __obj.asInstanceOf[AddApplicationReferenceDataSourceRequest]
  }
}

