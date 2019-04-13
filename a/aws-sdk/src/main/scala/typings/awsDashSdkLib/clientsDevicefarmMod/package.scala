package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDevicefarmMod {
  type AWSAccountNumber = java.lang.String
  type AccountsCleanup = scala.Boolean
  type AmazonResourceName = java.lang.String
  type AmazonResourceNames = js.Array[AmazonResourceName]
  type AndroidPaths = js.Array[String]
  type AppPackagesCleanup = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SCREENSHOT
    - awsDashSdkLib.awsDashSdkLibStrings.FILE
    - awsDashSdkLib.awsDashSdkLibStrings.LOG
    - java.lang.String
  */
  type ArtifactCategory = _ArtifactCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.SCREENSHOT
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.MESSAGE_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.RESULT_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.WEBKIT_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.INSTRUMENTATION_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.EXERCISER_MONKEY_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH_JSON_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH_PRETTY_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH_STANDARD_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH_JAVA_XML_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATION_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_SERVER_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_XML_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_PYTHON_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_PYTHON_XML_OUTPUT
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLORER_EVENT_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLORER_SUMMARY_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION_CRASH_REPORT
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_ARTIFACT
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_ARTIFACT_LOG
    - awsDashSdkLib.awsDashSdkLibStrings.TESTSPEC_OUTPUT
    - java.lang.String
  */
  type ArtifactType = _ArtifactType | java.lang.String
  type Artifacts = js.Array[Artifact]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.METERED
    - awsDashSdkLib.awsDashSdkLibStrings.UNMETERED
    - java.lang.String
  */
  type BillingMethod = _BillingMethod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ContentType = java.lang.String
  type CurrencyCode = awsDashSdkLib.awsDashSdkLibStrings.USD | java.lang.String
  type DateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ARN
    - awsDashSdkLib.awsDashSdkLibStrings.PLATFORM
    - awsDashSdkLib.awsDashSdkLibStrings.FORM_FACTOR
    - awsDashSdkLib.awsDashSdkLibStrings.MANUFACTURER
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS_ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_DEBUG_ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_VERSION
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ARN
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_LABELS
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.OS_VERSION
    - awsDashSdkLib.awsDashSdkLibStrings.MODEL
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABILITY
    - java.lang.String
  */
  type DeviceAttribute = _DeviceAttribute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_NOT_AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.BUSY
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.HIGHLY_AVAILABLE
    - java.lang.String
  */
  type DeviceAvailability = _DeviceAvailability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ARN
    - awsDashSdkLib.awsDashSdkLibStrings.PLATFORM
    - awsDashSdkLib.awsDashSdkLibStrings.OS_VERSION
    - awsDashSdkLib.awsDashSdkLibStrings.MODEL
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABILITY
    - awsDashSdkLib.awsDashSdkLibStrings.FORM_FACTOR
    - awsDashSdkLib.awsDashSdkLibStrings.MANUFACTURER
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS_ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_DEBUG_ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ARN
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_LABELS
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_TYPE
    - java.lang.String
  */
  type DeviceFilterAttribute = _DeviceFilterAttribute | java.lang.String
  type DeviceFilterValues = js.Array[String]
  type DeviceFilters = js.Array[DeviceFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PHONE
    - awsDashSdkLib.awsDashSdkLibStrings.TABLET
    - java.lang.String
  */
  type DeviceFormFactor = _DeviceFormFactor | java.lang.String
  type DeviceHostPaths = js.Array[String]
  type DeviceInstances = js.Array[DeviceInstance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ANDROID
    - awsDashSdkLib.awsDashSdkLibStrings.IOS
    - java.lang.String
  */
  type DevicePlatform = _DevicePlatform | java.lang.String
  type DevicePoolCompatibilityResults = js.Array[DevicePoolCompatibilityResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURATED
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type DevicePoolType = _DevicePoolType | java.lang.String
  type DevicePools = js.Array[DevicePool]
  type Devices = js.Array[Device]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.PASSED
    - awsDashSdkLib.awsDashSdkLibStrings.WARNED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SKIPPED
    - awsDashSdkLib.awsDashSdkLibStrings.ERRORED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type ExecutionResult = _ExecutionResult | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PARSING_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.VPC_ENDPOINT_SETUP_FAILED
    - java.lang.String
  */
  type ExecutionResultCode = _ExecutionResultCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_CONCURRENCY
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DEVICE
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESSING
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULING
    - awsDashSdkLib.awsDashSdkLibStrings.PREPARING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type Filter = java.lang.String
  type HostAddress = java.lang.String
  type IncompatibilityMessages = js.Array[IncompatibilityMessage]
  type InstanceLabels = js.Array[String]
  type InstanceProfiles = js.Array[InstanceProfile]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_USE
    - awsDashSdkLib.awsDashSdkLibStrings.PREPARING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.NO_VIDEO
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_ONLY
    - java.lang.String
  */
  type InteractionMode = _InteractionMode | java.lang.String
  type IosPaths = js.Array[String]
  type JobTimeoutMinutes = scala.Double
  type Jobs = js.Array[Job]
  type Long = scala.Double
  type MaxSlotMap = org.scalablytyped.runtime.StringDictionary[Integer]
  type Message = java.lang.String
  type Metadata = java.lang.String
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURATED
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type NetworkProfileType = _NetworkProfileType | java.lang.String
  type NetworkProfiles = js.Array[NetworkProfile]
  type OfferingIdentifier = java.lang.String
  type OfferingPromotionIdentifier = java.lang.String
  type OfferingPromotions = js.Array[OfferingPromotion]
  type OfferingStatusMap = org.scalablytyped.runtime.StringDictionary[OfferingStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PURCHASE
    - awsDashSdkLib.awsDashSdkLibStrings.RENEW
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM
    - java.lang.String
  */
  type OfferingTransactionType = _OfferingTransactionType | java.lang.String
  type OfferingTransactions = js.Array[OfferingTransaction]
  type OfferingType = awsDashSdkLib.awsDashSdkLibStrings.RECURRING | java.lang.String
  type Offerings = js.Array[Offering]
  type PackageIds = js.Array[String]
  type PaginationToken = java.lang.String
  type PercentInteger = scala.Double
  type Problems = js.Array[Problem]
  type Projects = js.Array[Project]
  type PurchasedDevicesMap = org.scalablytyped.runtime.StringDictionary[Integer]
  type RecurringChargeFrequency = awsDashSdkLib.awsDashSdkLibStrings.MONTHLY | java.lang.String
  type RecurringCharges = js.Array[RecurringCharge]
  type RemoteAccessSessions = js.Array[RemoteAccessSession]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN_OR_EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN_OR_EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_IN
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINS
    - java.lang.String
  */
  type RuleOperator = _RuleOperator | java.lang.String
  type Rules = js.Array[Rule]
  type Runs = js.Array[Run]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CPU
    - awsDashSdkLib.awsDashSdkLibStrings.MEMORY
    - awsDashSdkLib.awsDashSdkLibStrings.THREADS
    - awsDashSdkLib.awsDashSdkLibStrings.RX_RATE
    - awsDashSdkLib.awsDashSdkLibStrings.TX_RATE
    - awsDashSdkLib.awsDashSdkLibStrings.RX
    - awsDashSdkLib.awsDashSdkLibStrings.TX
    - awsDashSdkLib.awsDashSdkLibStrings.NATIVE_FRAMES
    - awsDashSdkLib.awsDashSdkLibStrings.NATIVE_FPS
    - awsDashSdkLib.awsDashSdkLibStrings.NATIVE_MIN_DRAWTIME
    - awsDashSdkLib.awsDashSdkLibStrings.NATIVE_AVG_DRAWTIME
    - awsDashSdkLib.awsDashSdkLibStrings.NATIVE_MAX_DRAWTIME
    - awsDashSdkLib.awsDashSdkLibStrings.OPENGL_FRAMES
    - awsDashSdkLib.awsDashSdkLibStrings.OPENGL_FPS
    - awsDashSdkLib.awsDashSdkLibStrings.OPENGL_MIN_DRAWTIME
    - awsDashSdkLib.awsDashSdkLibStrings.OPENGL_AVG_DRAWTIME
    - awsDashSdkLib.awsDashSdkLibStrings.OPENGL_MAX_DRAWTIME
    - java.lang.String
  */
  type SampleType = _SampleType | java.lang.String
  type Samples = js.Array[Sample]
  type ServiceDnsName = java.lang.String
  type SkipAppResign = scala.Boolean
  type SshPublicKey = java.lang.String
  type String = java.lang.String
  type Suites = js.Array[Suite]
  type TestParameters = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BUILTIN_FUZZ
    - awsDashSdkLib.awsDashSdkLibStrings.BUILTIN_EXPLORER
    - awsDashSdkLib.awsDashSdkLibStrings.WEB_PERFORMANCE_PROFILE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_JUNIT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_TESTNG
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_PYTHON
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_NODE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_RUBY
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_JUNIT
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_TESTNG
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_PYTHON
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_NODE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_RUBY
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH
    - awsDashSdkLib.awsDashSdkLibStrings.INSTRUMENTATION
    - awsDashSdkLib.awsDashSdkLibStrings.UIAUTOMATION
    - awsDashSdkLib.awsDashSdkLibStrings.UIAUTOMATOR
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST_UI
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS_RECORD
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS_REPLAY
    - java.lang.String
  */
  type TestType = _TestType | java.lang.String
  type Tests = js.Array[Test]
  type TransactionIdentifier = java.lang.String
  type URL = java.lang.String
  type UniqueProblems = js.Array[UniqueProblem]
  type UniqueProblemsByExecutionResultMap = org.scalablytyped.runtime.StringDictionary[UniqueProblems]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURATED
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type UploadCategory = _UploadCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESSING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = _UploadStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ANDROID_APP
    - awsDashSdkLib.awsDashSdkLibStrings.IOS_APP
    - awsDashSdkLib.awsDashSdkLibStrings.WEB_APP
    - awsDashSdkLib.awsDashSdkLibStrings.EXTERNAL_DATA
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_JUNIT_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_TESTNG_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_PYTHON_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_NODE_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_RUBY_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_PYTHON_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_NODE_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_RUBY_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.CALABASH_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTRUMENTATION_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.UIAUTOMATION_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.UIAUTOMATOR_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST_UI_TEST_PACKAGE
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_JUNIT_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_JAVA_TESTNG_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_PYTHON_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_NODE_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_RUBY_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_PYTHON_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_NODE_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.APPIUM_WEB_RUBY_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.INSTRUMENTATION_TEST_SPEC
    - awsDashSdkLib.awsDashSdkLibStrings.XCTEST_UI_TEST_SPEC
    - java.lang.String
  */
  type UploadType = _UploadType | java.lang.String
  type Uploads = js.Array[Upload]
  type VPCEConfigurationDescription = java.lang.String
  type VPCEConfigurationName = java.lang.String
  type VPCEConfigurations = js.Array[VPCEConfiguration]
  type VPCEServiceName = java.lang.String
  type VideoCapture = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-06-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
