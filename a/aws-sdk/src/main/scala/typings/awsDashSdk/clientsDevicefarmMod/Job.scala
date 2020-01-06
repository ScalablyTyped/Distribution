package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * The job's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The job's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  /**
    * When the job was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * The device (phone or tablet).
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * Represents the total (metered or unmetered) minutes used by the job.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  /**
    * The ARN of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A message about the job's result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The job's name.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The job's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  /**
    * The job's start time.
    */
  var started: js.UndefOr[DateTime] = js.native
  /**
    * The job's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  /**
    * The job's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.native
  /**
    * The job's type. Allowed values include the following:   BUILTIN_FUZZ   BUILTIN_EXPLORER. For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
  /**
    * This value is set to true if video capture is enabled. Otherwise, it is set to false.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.native
  /**
    * The endpoint for streaming device video.
    */
  var videoEndpoint: js.UndefOr[String] = js.native
}

object Job {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    counters: Counters = null,
    created: DateTime = null,
    device: Device = null,
    deviceMinutes: DeviceMinutes = null,
    instanceArn: AmazonResourceName = null,
    message: Message = null,
    name: Name = null,
    result: ExecutionResult = null,
    started: DateTime = null,
    status: ExecutionStatus = null,
    stopped: DateTime = null,
    `type`: TestType = null,
    videoCapture: js.UndefOr[scala.Boolean] = js.undefined,
    videoEndpoint: String = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes.asInstanceOf[js.Any])
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(videoCapture)) __obj.updateDynamic("videoCapture")(videoCapture.asInstanceOf[js.Any])
    if (videoEndpoint != null) __obj.updateDynamic("videoEndpoint")(videoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

