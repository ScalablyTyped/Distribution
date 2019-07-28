package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * The ID of the input configuration from which to delete the input processing configuration. You can get a list of the input IDs for an application by using the DescribeApplication operation.
    */
  var InputId: Id
}

object DeleteApplicationInputProcessingConfigurationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, InputId: Id): DeleteApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, InputId = InputId)
  
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
  }
}

