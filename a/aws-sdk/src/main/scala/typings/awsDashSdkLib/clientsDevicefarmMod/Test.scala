package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  /**
    * The test's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The test's result counters.
    */
  var counters: js.UndefOr[Counters] = js.undefined
  /**
    * When the test was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  /**
    * Represents the total (metered or unmetered) minutes used by the test.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  /**
    * A message about the test's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The test's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The test's result. Allowed values include:   PENDING: A pending condition.   PASSED: A passing condition.   WARNED: A warning condition.   FAILED: A failed condition.   SKIPPED: A skipped condition.   ERRORED: An error condition.   STOPPED: A stopped condition.  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  /**
    * The test's start time.
    */
  var started: js.UndefOr[DateTime] = js.undefined
  /**
    * The test's status. Allowed values include:   PENDING: A pending status.   PENDING_CONCURRENCY: A pending concurrency status.   PENDING_DEVICE: A pending device status.   PROCESSING: A processing status.   SCHEDULING: A scheduling status.   PREPARING: A preparing status.   RUNNING: A running status.   COMPLETED: A completed status.   STOPPING: A stopping status.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  /**
    * The test's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.undefined
  /**
    * The test's type. Must be one of the following values:   BUILTIN_FUZZ: The built-in fuzz type.   BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT: The Appium Java JUnit type.   APPIUM_JAVA_TESTNG: The Appium Java TestNG type.   APPIUM_PYTHON: The Appium Python type.   APPIUM_NODE: The Appium Node.js type.   APPIUM_RUBY: The Appium Ruby type.   APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.   APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.   APPIUM_WEB_PYTHON: The Appium Python type for web apps.   APPIUM_WEB_NODE: The Appium Node.js type for web apps.   APPIUM_WEB_RUBY: The Appium Ruby type for web apps.   CALABASH: The Calabash type.   INSTRUMENTATION: The Instrumentation type.   UIAUTOMATION: The uiautomation type.   UIAUTOMATOR: The uiautomator type.   XCTEST: The XCode test type.   XCTEST_UI: The XCode UI test type.  
    */
  var `type`: js.UndefOr[TestType] = js.undefined
}

object Test {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    counters: Counters = null,
    created: DateTime = null,
    deviceMinutes: DeviceMinutes = null,
    message: Message = null,
    name: Name = null,
    result: ExecutionResult = null,
    started: DateTime = null,
    status: ExecutionStatus = null,
    stopped: DateTime = null,
    `type`: TestType = null
  ): Test = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (counters != null) __obj.updateDynamic("counters")(counters)
    if (created != null) __obj.updateDynamic("created")(created)
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

