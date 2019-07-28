package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationOutputRequest extends js.Object {
  /**
    * Name of the application to which you want to add the output configuration.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Version of the application to which you want to add the output configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * An array of objects, each describing one output configuration. In the output configuration, you specify the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
    */
  var Output: typings.awsDashSdk.clientsKinesisanalyticsMod.Output
}

object AddApplicationOutputRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    Output: Output
  ): AddApplicationOutputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, Output = Output)
  
    __obj.asInstanceOf[AddApplicationOutputRequest]
  }
}

