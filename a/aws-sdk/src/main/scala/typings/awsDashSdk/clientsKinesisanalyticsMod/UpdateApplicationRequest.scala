package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationRequest extends js.Object {
  /**
    * Name of the Amazon Kinesis Analytics application to update.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Describes application updates.
    */
  var ApplicationUpdate: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationUpdate
  /**
    * The current application version ID. You can use the DescribeApplication operation to get this value.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    ApplicationUpdate: ApplicationUpdate,
    CurrentApplicationVersionId: ApplicationVersionId
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, ApplicationUpdate = ApplicationUpdate, CurrentApplicationVersionId = CurrentApplicationVersionId)
  
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

