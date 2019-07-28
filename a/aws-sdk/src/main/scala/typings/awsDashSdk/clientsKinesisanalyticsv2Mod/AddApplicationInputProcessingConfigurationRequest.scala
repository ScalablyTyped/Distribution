package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
  /**
    * The name of the application to which you want to add the input processing configuration.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * The ID of the input configuration to add the input processing configuration to. You can get a list of the input IDs for an application using the DescribeApplication operation.
    */
  var InputId: Id
  /**
    * The InputProcessingConfiguration to add to the application.
    */
  var InputProcessingConfiguration: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfiguration
}

object AddApplicationInputProcessingConfigurationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    InputId: Id,
    InputProcessingConfiguration: InputProcessingConfiguration
  ): AddApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, InputId = InputId, InputProcessingConfiguration = InputProcessingConfiguration)
  
    __obj.asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
  }
}

