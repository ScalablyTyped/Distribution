package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicePoolCompatibilityRequest extends js.Object {
  /**
    * The ARN of the app that is associated with the specified device pool.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * An object containing information about the settings for a run.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined
  /**
    * The device pool's ARN.
    */
  var devicePoolArn: AmazonResourceName
  /**
    * Information about the uploaded test to be run against the device pool.
    */
  var test: js.UndefOr[ScheduleRunTest] = js.undefined
  /**
    * The test type for the specified device pool. Allowed values include the following:   BUILTIN_FUZZ: The built-in fuzz type.   BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT: The Appium Java JUnit type.   APPIUM_JAVA_TESTNG: The Appium Java TestNG type.   APPIUM_PYTHON: The Appium Python type.   APPIUM_NODE: The Appium Node.js type.   APPIUM_RUBY: The Appium Ruby type.   APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.   APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.   APPIUM_WEB_PYTHON: The Appium Python type for web apps.   APPIUM_WEB_NODE: The Appium Node.js type for web apps.   APPIUM_WEB_RUBY: The Appium Ruby type for web apps.   CALABASH: The Calabash type.   INSTRUMENTATION: The Instrumentation type.   UIAUTOMATION: The uiautomation type.   UIAUTOMATOR: The uiautomator type.   XCTEST: The Xcode test type.   XCTEST_UI: The Xcode UI test type.  
    */
  var testType: js.UndefOr[TestType] = js.undefined
}

object GetDevicePoolCompatibilityRequest {
  @scala.inline
  def apply(
    devicePoolArn: AmazonResourceName,
    appArn: AmazonResourceName = null,
    configuration: ScheduleRunConfiguration = null,
    test: ScheduleRunTest = null,
    testType: TestType = null
  ): GetDevicePoolCompatibilityRequest = {
    val __obj = js.Dynamic.literal(devicePoolArn = devicePoolArn)
    if (appArn != null) __obj.updateDynamic("appArn")(appArn)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (test != null) __obj.updateDynamic("test")(test)
    if (testType != null) __obj.updateDynamic("testType")(testType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolCompatibilityRequest]
  }
}

