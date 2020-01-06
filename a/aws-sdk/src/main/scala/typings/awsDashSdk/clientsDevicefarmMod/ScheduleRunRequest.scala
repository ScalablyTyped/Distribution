package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunRequest extends js.Object {
  /**
    * The ARN of an application package to run tests against, created with CreateUpload. See ListUploads.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.native
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The filter criteria used to dynamically select a set of devices for a test run and the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.native
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.native
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest = js.native
}

object ScheduleRunRequest {
  @scala.inline
  def apply(
    projectArn: AmazonResourceName,
    test: ScheduleRunTest,
    appArn: AmazonResourceName = null,
    configuration: ScheduleRunConfiguration = null,
    devicePoolArn: AmazonResourceName = null,
    deviceSelectionConfiguration: DeviceSelectionConfiguration = null,
    executionConfiguration: ExecutionConfiguration = null,
    name: Name = null
  ): ScheduleRunRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (appArn != null) __obj.updateDynamic("appArn")(appArn.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (devicePoolArn != null) __obj.updateDynamic("devicePoolArn")(devicePoolArn.asInstanceOf[js.Any])
    if (deviceSelectionConfiguration != null) __obj.updateDynamic("deviceSelectionConfiguration")(deviceSelectionConfiguration.asInstanceOf[js.Any])
    if (executionConfiguration != null) __obj.updateDynamic("executionConfiguration")(executionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunRequest]
  }
}

