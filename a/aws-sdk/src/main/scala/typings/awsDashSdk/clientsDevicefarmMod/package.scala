package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDevicefarmMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.MONTHLY
  import typings.awsDashSdk.awsDashSdkStrings.RECURRING
  import typings.awsDashSdk.awsDashSdkStrings.USD
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AWSAccountNumber = java.lang.String
  type AccountsCleanup = scala.Boolean
  type AmazonResourceName = java.lang.String
  type AmazonResourceNames = js.Array[AmazonResourceName]
  type AndroidPaths = js.Array[String]
  type AppPackagesCleanup = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SCREENSHOT
    - typings.awsDashSdk.awsDashSdkStrings.FILE
    - typings.awsDashSdk.awsDashSdkStrings.LOG
    - java.lang.String
  */
  type ArtifactCategory = _ArtifactCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.SCREENSHOT
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_LOG
    - typings.awsDashSdk.awsDashSdkStrings.MESSAGE_LOG
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_LOG
    - typings.awsDashSdk.awsDashSdkStrings.RESULT_LOG
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_LOG
    - typings.awsDashSdk.awsDashSdkStrings.WEBKIT_LOG
    - typings.awsDashSdk.awsDashSdkStrings.INSTRUMENTATION_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.EXERCISER_MONKEY_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH_JSON_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH_PRETTY_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH_STANDARD_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH_JAVA_XML_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATION_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_SERVER_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_XML_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_PYTHON_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_PYTHON_XML_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.EXPLORER_EVENT_LOG
    - typings.awsDashSdk.awsDashSdkStrings.EXPLORER_SUMMARY_LOG
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION_CRASH_REPORT
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST_LOG
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_ARTIFACT
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_ARTIFACT_LOG
    - typings.awsDashSdk.awsDashSdkStrings.TESTSPEC_OUTPUT
    - java.lang.String
  */
  type ArtifactType = _ArtifactType | java.lang.String
  type Artifacts = js.Array[Artifact]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.METERED
    - typings.awsDashSdk.awsDashSdkStrings.UNMETERED
    - java.lang.String
  */
  type BillingMethod = _BillingMethod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ContentType = java.lang.String
  type CurrencyCode = USD | java.lang.String
  type DateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ARN
    - typings.awsDashSdk.awsDashSdkStrings.PLATFORM
    - typings.awsDashSdk.awsDashSdkStrings.FORM_FACTOR
    - typings.awsDashSdk.awsDashSdkStrings.MANUFACTURER
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_ACCESS_ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_DEBUG_ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_VERSION
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_LABELS
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.OS_VERSION
    - typings.awsDashSdk.awsDashSdkStrings.MODEL
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABILITY
    - java.lang.String
  */
  type DeviceAttribute = _DeviceAttribute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TEMPORARY_NOT_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.BUSY
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.HIGHLY_AVAILABLE
    - java.lang.String
  */
  type DeviceAvailability = _DeviceAvailability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ARN
    - typings.awsDashSdk.awsDashSdkStrings.PLATFORM
    - typings.awsDashSdk.awsDashSdkStrings.OS_VERSION
    - typings.awsDashSdk.awsDashSdkStrings.MODEL
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABILITY
    - typings.awsDashSdk.awsDashSdkStrings.FORM_FACTOR
    - typings.awsDashSdk.awsDashSdkStrings.MANUFACTURER
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_ACCESS_ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_DEBUG_ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_LABELS
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_TYPE
    - java.lang.String
  */
  type DeviceFilterAttribute = _DeviceFilterAttribute | java.lang.String
  type DeviceFilterValues = js.Array[String]
  type DeviceFilters = js.Array[DeviceFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PHONE
    - typings.awsDashSdk.awsDashSdkStrings.TABLET
    - java.lang.String
  */
  type DeviceFormFactor = _DeviceFormFactor | java.lang.String
  type DeviceHostPaths = js.Array[String]
  type DeviceInstances = js.Array[DeviceInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ANDROID
    - typings.awsDashSdk.awsDashSdkStrings.IOS
    - java.lang.String
  */
  type DevicePlatform = _DevicePlatform | java.lang.String
  type DevicePoolCompatibilityResults = js.Array[DevicePoolCompatibilityResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURATED
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type DevicePoolType = _DevicePoolType | java.lang.String
  type DevicePools = js.Array[DevicePool]
  type Devices = js.Array[Device]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.PASSED
    - typings.awsDashSdk.awsDashSdkStrings.WARNED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SKIPPED
    - typings.awsDashSdk.awsDashSdkStrings.ERRORED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type ExecutionResult = _ExecutionResult | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PARSING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.VPC_ENDPOINT_SETUP_FAILED
    - java.lang.String
  */
  type ExecutionResultCode = _ExecutionResultCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_CONCURRENCY
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_DEVICE
    - typings.awsDashSdk.awsDashSdkStrings.PROCESSING
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULING
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type Filter = java.lang.String
  type HostAddress = java.lang.String
  type IncompatibilityMessages = js.Array[IncompatibilityMessage]
  type InstanceLabels = js.Array[String]
  type InstanceProfiles = js.Array[InstanceProfile]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_USE
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.NO_VIDEO
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_ONLY
    - java.lang.String
  */
  type InteractionMode = _InteractionMode | java.lang.String
  type IosPaths = js.Array[String]
  type JobTimeoutMinutes = scala.Double
  type Jobs = js.Array[Job]
  type Long = scala.Double
  type MaxSlotMap = StringDictionary[Integer]
  type Message = java.lang.String
  type Metadata = java.lang.String
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURATED
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type NetworkProfileType = _NetworkProfileType | java.lang.String
  type NetworkProfiles = js.Array[NetworkProfile]
  type OfferingIdentifier = java.lang.String
  type OfferingPromotionIdentifier = java.lang.String
  type OfferingPromotions = js.Array[OfferingPromotion]
  type OfferingStatusMap = StringDictionary[OfferingStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PURCHASE
    - typings.awsDashSdk.awsDashSdkStrings.RENEW
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - java.lang.String
  */
  type OfferingTransactionType = _OfferingTransactionType | java.lang.String
  type OfferingTransactions = js.Array[OfferingTransaction]
  type OfferingType = RECURRING | java.lang.String
  type Offerings = js.Array[Offering]
  type PackageIds = js.Array[String]
  type PaginationToken = java.lang.String
  type PercentInteger = scala.Double
  type Problems = js.Array[Problem]
  type Projects = js.Array[Project]
  type PurchasedDevicesMap = StringDictionary[Integer]
  type RecurringChargeFrequency = MONTHLY | java.lang.String
  type RecurringCharges = js.Array[RecurringCharge]
  type RemoteAccessSessions = js.Array[RemoteAccessSession]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN_OR_EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN_OR_EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.NOT_IN
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS
    - java.lang.String
  */
  type RuleOperator = _RuleOperator | java.lang.String
  type Rules = js.Array[Rule]
  type Runs = js.Array[Run]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CPU
    - typings.awsDashSdk.awsDashSdkStrings.MEMORY
    - typings.awsDashSdk.awsDashSdkStrings.THREADS
    - typings.awsDashSdk.awsDashSdkStrings.RX_RATE
    - typings.awsDashSdk.awsDashSdkStrings.TX_RATE
    - typings.awsDashSdk.awsDashSdkStrings.RX
    - typings.awsDashSdk.awsDashSdkStrings.TX
    - typings.awsDashSdk.awsDashSdkStrings.NATIVE_FRAMES
    - typings.awsDashSdk.awsDashSdkStrings.NATIVE_FPS
    - typings.awsDashSdk.awsDashSdkStrings.NATIVE_MIN_DRAWTIME
    - typings.awsDashSdk.awsDashSdkStrings.NATIVE_AVG_DRAWTIME
    - typings.awsDashSdk.awsDashSdkStrings.NATIVE_MAX_DRAWTIME
    - typings.awsDashSdk.awsDashSdkStrings.OPENGL_FRAMES
    - typings.awsDashSdk.awsDashSdkStrings.OPENGL_FPS
    - typings.awsDashSdk.awsDashSdkStrings.OPENGL_MIN_DRAWTIME
    - typings.awsDashSdk.awsDashSdkStrings.OPENGL_AVG_DRAWTIME
    - typings.awsDashSdk.awsDashSdkStrings.OPENGL_MAX_DRAWTIME
    - java.lang.String
  */
  type SampleType = _SampleType | java.lang.String
  type Samples = js.Array[Sample]
  type ServiceDnsName = java.lang.String
  type SkipAppResign = scala.Boolean
  type SshPublicKey = java.lang.String
  type String = java.lang.String
  type Suites = js.Array[Suite]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TestParameters = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BUILTIN_FUZZ
    - typings.awsDashSdk.awsDashSdkStrings.BUILTIN_EXPLORER
    - typings.awsDashSdk.awsDashSdkStrings.WEB_PERFORMANCE_PROFILE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_JUNIT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_TESTNG
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_PYTHON
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_NODE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_RUBY
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_JUNIT
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_TESTNG
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_PYTHON
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_NODE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_RUBY
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH
    - typings.awsDashSdk.awsDashSdkStrings.INSTRUMENTATION
    - typings.awsDashSdk.awsDashSdkStrings.UIAUTOMATION
    - typings.awsDashSdk.awsDashSdkStrings.UIAUTOMATOR
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST_UI
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_ACCESS_RECORD
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_ACCESS_REPLAY
    - java.lang.String
  */
  type TestType = _TestType | java.lang.String
  type Tests = js.Array[Test]
  type TransactionIdentifier = java.lang.String
  type URL = java.lang.String
  type UniqueProblems = js.Array[UniqueProblem]
  type UniqueProblemsByExecutionResultMap = StringDictionary[UniqueProblems]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURATED
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type UploadCategory = _UploadCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.PROCESSING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = _UploadStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ANDROID_APP
    - typings.awsDashSdk.awsDashSdkStrings.IOS_APP
    - typings.awsDashSdk.awsDashSdkStrings.WEB_APP
    - typings.awsDashSdk.awsDashSdkStrings.EXTERNAL_DATA
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_JUNIT_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_TESTNG_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_PYTHON_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_NODE_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_RUBY_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_PYTHON_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_NODE_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_RUBY_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.CALABASH_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.INSTRUMENTATION_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.UIAUTOMATION_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.UIAUTOMATOR_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST_UI_TEST_PACKAGE
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_JUNIT_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_JAVA_TESTNG_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_PYTHON_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_NODE_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_RUBY_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_PYTHON_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_NODE_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.APPIUM_WEB_RUBY_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.INSTRUMENTATION_TEST_SPEC
    - typings.awsDashSdk.awsDashSdkStrings.XCTEST_UI_TEST_SPEC
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
    - typings.awsDashSdk.awsDashSdkStrings.`2015-06-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
