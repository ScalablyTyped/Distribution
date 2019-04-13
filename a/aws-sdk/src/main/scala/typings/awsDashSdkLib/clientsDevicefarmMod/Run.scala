package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends js.Object {
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  /**
    * The total number of completed jobs.
    */
  var completedJobs: js.UndefOr[Integer] = js.undefined
  /**
    * The run's result counters.
    */
  var counters: js.UndefOr[Counters] = js.undefined
  /**
    * When the run was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  /**
    * Output CustomerArtifactPaths object for the test run.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined
  /**
    * Represents the total (metered or unmetered) minutes used by the test run.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  /**
    * The ARN of the device pool for the run.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The results of a device filter used to select the devices for a test run.
    */
  var deviceSelectionResult: js.UndefOr[DeviceSelectionResult] = js.undefined
  /**
    * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
    */
  var eventCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of minutes the job will execute before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * A message about the run's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The run's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The network profile being used for a test run.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
  /**
    * Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
    */
  var parsingResultUrl: js.UndefOr[String] = js.undefined
  /**
    * The run's platform. Allowed values include:   ANDROID: The Android platform.   IOS: The iOS platform.  
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.undefined
  /**
    * The run's result. Allowed values include:   PENDING: A pending condition.   PASSED: A passing condition.   WARNED: A warning condition.   FAILED: A failed condition.   SKIPPED: A skipped condition.   ERRORED: An error condition.   STOPPED: A stopped condition.  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  /**
    * Supporting field for the result field. Set only if result is SKIPPED. PARSING_FAILED if the result is skipped because of test package parsing failure.
    */
  var resultCode: js.UndefOr[ExecutionResultCode] = js.undefined
  /**
    * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.
    */
  var seed: js.UndefOr[Integer] = js.undefined
  /**
    * When set to true, for private devices, Device Farm will not sign your app again. For public devices, Device Farm always signs your apps again and this parameter has no effect. For more information about how Device Farm re-signs your app(s), see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  /**
    * The run's start time.
    */
  var started: js.UndefOr[DateTime] = js.undefined
  /**
    * The run's status. Allowed values include:   PENDING: A pending status.   PENDING_CONCURRENCY: A pending concurrency status.   PENDING_DEVICE: A pending device status.   PROCESSING: A processing status.   SCHEDULING: A scheduling status.   PREPARING: A preparing status.   RUNNING: A running status.   COMPLETED: A completed status.   STOPPING: A stopping status.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  /**
    * The run's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.undefined
  /**
    * The ARN of the YAML-formatted test specification for the run.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The total number of jobs for the run.
    */
  var totalJobs: js.UndefOr[Integer] = js.undefined
  /**
    * The run's type. Must be one of the following values:   BUILTIN_FUZZ: The built-in fuzz type.   BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT: The Appium Java JUnit type.   APPIUM_JAVA_TESTNG: The Appium Java TestNG type.   APPIUM_PYTHON: The Appium Python type.   APPIUM_NODE: The Appium Node.js type.   APPIUM_RUBY: The Appium Ruby type.   APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.   APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.   APPIUM_WEB_PYTHON: The Appium Python type for web apps.   APPIUM_WEB_NODE: The Appium Node.js type for web apps.   APPIUM_WEB_RUBY: The Appium Ruby type for web apps.   CALABASH: The Calabash type.   INSTRUMENTATION: The Instrumentation type.   UIAUTOMATION: The uiautomation type.   UIAUTOMATOR: The uiautomator type.   XCTEST: The XCode test type.   XCTEST_UI: The XCode UI test type.  
    */
  var `type`: js.UndefOr[TestType] = js.undefined
  /**
    * The Device Farm console URL for the recording of the run.
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object Run {
  @scala.inline
  def apply(
    appUpload: AmazonResourceName = null,
    arn: AmazonResourceName = null,
    billingMethod: BillingMethod = null,
    completedJobs: js.UndefOr[Integer] = js.undefined,
    counters: Counters = null,
    created: DateTime = null,
    customerArtifactPaths: CustomerArtifactPaths = null,
    deviceMinutes: DeviceMinutes = null,
    devicePoolArn: AmazonResourceName = null,
    deviceSelectionResult: DeviceSelectionResult = null,
    eventCount: js.UndefOr[Integer] = js.undefined,
    jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    locale: String = null,
    location: Location = null,
    message: Message = null,
    name: Name = null,
    networkProfile: NetworkProfile = null,
    parsingResultUrl: String = null,
    platform: DevicePlatform = null,
    radios: Radios = null,
    result: ExecutionResult = null,
    resultCode: ExecutionResultCode = null,
    seed: js.UndefOr[Integer] = js.undefined,
    skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
    started: DateTime = null,
    status: ExecutionStatus = null,
    stopped: DateTime = null,
    testSpecArn: AmazonResourceName = null,
    totalJobs: js.UndefOr[Integer] = js.undefined,
    `type`: TestType = null,
    webUrl: String = null
  ): Run = {
    val __obj = js.Dynamic.literal()
    if (appUpload != null) __obj.updateDynamic("appUpload")(appUpload)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(completedJobs)) __obj.updateDynamic("completedJobs")(completedJobs)
    if (counters != null) __obj.updateDynamic("counters")(counters)
    if (created != null) __obj.updateDynamic("created")(created)
    if (customerArtifactPaths != null) __obj.updateDynamic("customerArtifactPaths")(customerArtifactPaths)
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes)
    if (devicePoolArn != null) __obj.updateDynamic("devicePoolArn")(devicePoolArn)
    if (deviceSelectionResult != null) __obj.updateDynamic("deviceSelectionResult")(deviceSelectionResult)
    if (!js.isUndefined(eventCount)) __obj.updateDynamic("eventCount")(eventCount)
    if (!js.isUndefined(jobTimeoutMinutes)) __obj.updateDynamic("jobTimeoutMinutes")(jobTimeoutMinutes)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (location != null) __obj.updateDynamic("location")(location)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile)
    if (parsingResultUrl != null) __obj.updateDynamic("parsingResultUrl")(parsingResultUrl)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (radios != null) __obj.updateDynamic("radios")(radios)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (resultCode != null) __obj.updateDynamic("resultCode")(resultCode.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed)
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign)
    if (started != null) __obj.updateDynamic("started")(started)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped)
    if (testSpecArn != null) __obj.updateDynamic("testSpecArn")(testSpecArn)
    if (!js.isUndefined(totalJobs)) __obj.updateDynamic("totalJobs")(totalJobs)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Run]
  }
}

