package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationInputRequest extends js.Object {
  /**
    * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Current version of your Amazon Kinesis Analytics application. You can use the DescribeApplication operation to find the current application version.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * The Input to add.
    */
  var Input: typings.awsDashSdk.clientsKinesisanalyticsMod.Input
}

object AddApplicationInputRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, Input: Input): AddApplicationInputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, Input = Input)
  
    __obj.asInstanceOf[AddApplicationInputRequest]
  }
}

