package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleRunRequest extends js.Object {
  /**
    * The ARN of the app to schedule a run.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.undefined
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.undefined
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest
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
    val __obj = js.Dynamic.literal(projectArn = projectArn, test = test)
    if (appArn != null) __obj.updateDynamic("appArn")(appArn)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (devicePoolArn != null) __obj.updateDynamic("devicePoolArn")(devicePoolArn)
    if (deviceSelectionConfiguration != null) __obj.updateDynamic("deviceSelectionConfiguration")(deviceSelectionConfiguration)
    if (executionConfiguration != null) __obj.updateDynamic("executionConfiguration")(executionConfiguration)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ScheduleRunRequest]
  }
}

