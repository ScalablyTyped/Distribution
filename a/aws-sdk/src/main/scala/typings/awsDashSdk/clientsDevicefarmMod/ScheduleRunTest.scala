package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleRunTest extends js.Object {
  /**
    * The test's filter.
    */
  var filter: js.UndefOr[Filter] = js.undefined
  /**
    * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by name-value pairs of strings. For all tests:   app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to disable it.   For Calabash tests:   profile: A cucumber profile, for example, "my_profile_name".   tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for example, "@smoke" or "@smoke,~@wip".   For Appium tests (all types):   appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and "default".   “latest” will run the latest Appium version supported by Device Farm (1.9.1).   For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior is to run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.   This behavior is subject to change.     For Fuzz tests (Android only):   event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.   throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.   seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.   For Explorer tests:   username: A username to use if the Explorer encounters a login form. If not supplied, no username will be inserted.   password: A password to use if the Explorer encounters a login form. If not supplied, no password will be inserted.   For Instrumentation:   filter: A test filter string. Examples:   Running a single test case: "com.android.abc.Test1"   Running a single test: "com.android.abc.Test1#smoke"   Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"     For XCTest and XCTestUI:   filter: A test filter string. Examples:   Running a single test class: "LoginTests"   Running a multiple test classes: "LoginTests,SmokeTests"   Running a single test: "LoginTests/testValid"   Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"     For UIAutomator:   filter: A test filter string. Examples:   Running a single test case: "com.android.abc.Test1"   Running a single test: "com.android.abc.Test1#smoke"   Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"    
    */
  var parameters: js.UndefOr[TestParameters] = js.undefined
  /**
    * The ARN of the uploaded test that will be run.
    */
  var testPackageArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The ARN of the YAML-formatted test specification.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The test's type. Must be one of the following values:   BUILTIN_FUZZ: The built-in fuzz type.   BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT: The Appium Java JUnit type.   APPIUM_JAVA_TESTNG: The Appium Java TestNG type.   APPIUM_PYTHON: The Appium Python type.   APPIUM_NODE: The Appium Node.js type.   APPIUM_RUBY: The Appium Ruby type.   APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.   APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.   APPIUM_WEB_PYTHON: The Appium Python type for web apps.   APPIUM_WEB_NODE: The Appium Node.js type for web apps.   APPIUM_WEB_RUBY: The Appium Ruby type for web apps.   CALABASH: The Calabash type.   INSTRUMENTATION: The Instrumentation type.   UIAUTOMATION: The uiautomation type.   UIAUTOMATOR: The uiautomator type.   XCTEST: The Xcode test type.   XCTEST_UI: The Xcode UI test type.  
    */
  var `type`: TestType
}

object ScheduleRunTest {
  @scala.inline
  def apply(
    `type`: TestType,
    filter: Filter = null,
    parameters: TestParameters = null,
    testPackageArn: AmazonResourceName = null,
    testSpecArn: AmazonResourceName = null
  ): ScheduleRunTest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (testPackageArn != null) __obj.updateDynamic("testPackageArn")(testPackageArn)
    if (testSpecArn != null) __obj.updateDynamic("testSpecArn")(testSpecArn)
    __obj.asInstanceOf[ScheduleRunTest]
  }
}

