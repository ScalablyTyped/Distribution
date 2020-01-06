package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends js.Object {
  /**
    * The test's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The test's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  /**
    * When the test was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * Represents the total (metered or unmetered) minutes used by the test.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  /**
    * A message about the test's result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The test's name.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The test's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  /**
    * The test's start time.
    */
  var started: js.UndefOr[DateTime] = js.native
  /**
    * The test's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  /**
    * The test's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.native
  /**
    * The test's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER  For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
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
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

