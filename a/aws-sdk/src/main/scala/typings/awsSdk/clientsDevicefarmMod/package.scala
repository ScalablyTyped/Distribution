package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.MONTHLY
import typings.awsSdk.awsSdkStrings.RECURRING
import typings.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountNumber = java.lang.String

type AccountsCleanup = scala.Boolean

type AmazonResourceName = java.lang.String

type AmazonResourceNames = js.Array[AmazonResourceName]

type AndroidPaths = js.Array[String]

type AppPackagesCleanup = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCREENSHOT
  - typings.awsSdk.awsSdkStrings.FILE
  - typings.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type ArtifactCategory = _ArtifactCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.SCREENSHOT
  - typings.awsSdk.awsSdkStrings.DEVICE_LOG
  - typings.awsSdk.awsSdkStrings.MESSAGE_LOG
  - typings.awsSdk.awsSdkStrings.VIDEO_LOG
  - typings.awsSdk.awsSdkStrings.RESULT_LOG
  - typings.awsSdk.awsSdkStrings.SERVICE_LOG
  - typings.awsSdk.awsSdkStrings.WEBKIT_LOG
  - typings.awsSdk.awsSdkStrings.INSTRUMENTATION_OUTPUT
  - typings.awsSdk.awsSdkStrings.EXERCISER_MONKEY_OUTPUT
  - typings.awsSdk.awsSdkStrings.CALABASH_JSON_OUTPUT
  - typings.awsSdk.awsSdkStrings.CALABASH_PRETTY_OUTPUT
  - typings.awsSdk.awsSdkStrings.CALABASH_STANDARD_OUTPUT
  - typings.awsSdk.awsSdkStrings.CALABASH_JAVA_XML_OUTPUT
  - typings.awsSdk.awsSdkStrings.AUTOMATION_OUTPUT
  - typings.awsSdk.awsSdkStrings.APPIUM_SERVER_OUTPUT
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_OUTPUT
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_XML_OUTPUT
  - typings.awsSdk.awsSdkStrings.APPIUM_PYTHON_OUTPUT
  - typings.awsSdk.awsSdkStrings.APPIUM_PYTHON_XML_OUTPUT
  - typings.awsSdk.awsSdkStrings.EXPLORER_EVENT_LOG
  - typings.awsSdk.awsSdkStrings.EXPLORER_SUMMARY_LOG
  - typings.awsSdk.awsSdkStrings.APPLICATION_CRASH_REPORT
  - typings.awsSdk.awsSdkStrings.XCTEST_LOG
  - typings.awsSdk.awsSdkStrings.VIDEO
  - typings.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT
  - typings.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT_LOG
  - typings.awsSdk.awsSdkStrings.TESTSPEC_OUTPUT
  - java.lang.String
*/
type ArtifactType = _ArtifactType | java.lang.String

type Artifacts = js.Array[Artifact]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.METERED
  - typings.awsSdk.awsSdkStrings.UNMETERED
  - java.lang.String
*/
type BillingMethod = _BillingMethod | java.lang.String

type Boolean = scala.Boolean

type ClientId = java.lang.String

type ContentType = java.lang.String

type CurrencyCode = USD | java.lang.String

type DateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARN
  - typings.awsSdk.awsSdkStrings.PLATFORM
  - typings.awsSdk.awsSdkStrings.FORM_FACTOR
  - typings.awsSdk.awsSdkStrings.MANUFACTURER
  - typings.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
  - typings.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
  - typings.awsSdk.awsSdkStrings.APPIUM_VERSION
  - typings.awsSdk.awsSdkStrings.INSTANCE_ARN
  - typings.awsSdk.awsSdkStrings.INSTANCE_LABELS
  - typings.awsSdk.awsSdkStrings.FLEET_TYPE
  - typings.awsSdk.awsSdkStrings.OS_VERSION
  - typings.awsSdk.awsSdkStrings.MODEL
  - typings.awsSdk.awsSdkStrings.AVAILABILITY
  - java.lang.String
*/
type DeviceAttribute = _DeviceAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE
  - typings.awsSdk.awsSdkStrings.BUSY
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE
  - java.lang.String
*/
type DeviceAvailability = _DeviceAvailability | java.lang.String

type DeviceFarmArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARN
  - typings.awsSdk.awsSdkStrings.PLATFORM
  - typings.awsSdk.awsSdkStrings.OS_VERSION
  - typings.awsSdk.awsSdkStrings.MODEL
  - typings.awsSdk.awsSdkStrings.AVAILABILITY
  - typings.awsSdk.awsSdkStrings.FORM_FACTOR
  - typings.awsSdk.awsSdkStrings.MANUFACTURER
  - typings.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
  - typings.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
  - typings.awsSdk.awsSdkStrings.INSTANCE_ARN
  - typings.awsSdk.awsSdkStrings.INSTANCE_LABELS
  - typings.awsSdk.awsSdkStrings.FLEET_TYPE
  - java.lang.String
*/
type DeviceFilterAttribute = _DeviceFilterAttribute | java.lang.String

type DeviceFilterValues = js.Array[String]

type DeviceFilters = js.Array[DeviceFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PHONE
  - typings.awsSdk.awsSdkStrings.TABLET
  - java.lang.String
*/
type DeviceFormFactor = _DeviceFormFactor | java.lang.String

type DeviceHostPaths = js.Array[String]

type DeviceInstances = js.Array[DeviceInstance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANDROID
  - typings.awsSdk.awsSdkStrings.IOS
  - java.lang.String
*/
type DevicePlatform = _DevicePlatform | java.lang.String

type DevicePoolCompatibilityResults = js.Array[DevicePoolCompatibilityResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CURATED
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type DevicePoolType = _DevicePoolType | java.lang.String

type DevicePools = js.Array[DevicePool]

type Devices = js.Array[Device]

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PASSED
  - typings.awsSdk.awsSdkStrings.WARNED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.ERRORED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type ExecutionResult = _ExecutionResult | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PARSING_FAILED
  - typings.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED
  - java.lang.String
*/
type ExecutionResultCode = _ExecutionResultCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PENDING_CONCURRENCY
  - typings.awsSdk.awsSdkStrings.PENDING_DEVICE
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.SCHEDULING
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | java.lang.String

type Filter = java.lang.String

type HostAddress = java.lang.String

type IncompatibilityMessages = js.Array[IncompatibilityMessage]

type InstanceLabels = js.Array[String]

type InstanceProfiles = js.Array[InstanceProfile]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_USE
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERACTIVE
  - typings.awsSdk.awsSdkStrings.NO_VIDEO
  - typings.awsSdk.awsSdkStrings.VIDEO_ONLY
  - java.lang.String
*/
type InteractionMode = _InteractionMode | java.lang.String

type IosPaths = js.Array[String]

type JobTimeoutMinutes = scala.Double

type Jobs = js.Array[Job]

type Long = scala.Double

type MaxPageSize = scala.Double

type MaxSlotMap = StringDictionary[Integer]

type Message = java.lang.String

type Metadata = java.lang.String

type Name = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CURATED
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type NetworkProfileType = _NetworkProfileType | java.lang.String

type NetworkProfiles = js.Array[NetworkProfile]

type NonEmptyString = java.lang.String

type OfferingIdentifier = java.lang.String

type OfferingPromotionIdentifier = java.lang.String

type OfferingPromotions = js.Array[OfferingPromotion]

type OfferingStatusMap = StringDictionary[OfferingStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PURCHASE
  - typings.awsSdk.awsSdkStrings.RENEW
  - typings.awsSdk.awsSdkStrings.SYSTEM
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

type ResourceDescription = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUALS
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUALS
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.NOT_IN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type RuleOperator = _RuleOperator | java.lang.String

type Rules = js.Array[Rule]

type Runs = js.Array[Run]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPU
  - typings.awsSdk.awsSdkStrings.MEMORY
  - typings.awsSdk.awsSdkStrings.THREADS
  - typings.awsSdk.awsSdkStrings.RX_RATE
  - typings.awsSdk.awsSdkStrings.TX_RATE
  - typings.awsSdk.awsSdkStrings.RX
  - typings.awsSdk.awsSdkStrings.TX
  - typings.awsSdk.awsSdkStrings.NATIVE_FRAMES
  - typings.awsSdk.awsSdkStrings.NATIVE_FPS
  - typings.awsSdk.awsSdkStrings.NATIVE_MIN_DRAWTIME
  - typings.awsSdk.awsSdkStrings.NATIVE_AVG_DRAWTIME
  - typings.awsSdk.awsSdkStrings.NATIVE_MAX_DRAWTIME
  - typings.awsSdk.awsSdkStrings.OPENGL_FRAMES
  - typings.awsSdk.awsSdkStrings.OPENGL_FPS
  - typings.awsSdk.awsSdkStrings.OPENGL_MIN_DRAWTIME
  - typings.awsSdk.awsSdkStrings.OPENGL_AVG_DRAWTIME
  - typings.awsSdk.awsSdkStrings.OPENGL_MAX_DRAWTIME
  - java.lang.String
*/
type SampleType = _SampleType | java.lang.String

type Samples = js.Array[Sample]

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[NonEmptyString]

type SensitiveString = java.lang.String

type SensitiveURL = java.lang.String

type ServiceDnsName = java.lang.String

type SkipAppResign = scala.Boolean

type SshPublicKey = java.lang.String

type String = java.lang.String

type SubnetId = java.lang.String

type SubnetIds = js.Array[NonEmptyString]

type Suites = js.Array[Suite]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TestGridProjects = js.Array[TestGridProject]

type TestGridSessionActions = js.Array[TestGridSessionAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VIDEO
  - typings.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type TestGridSessionArtifactCategory = _TestGridSessionArtifactCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.VIDEO
  - typings.awsSdk.awsSdkStrings.SELENIUM_LOG
  - java.lang.String
*/
type TestGridSessionArtifactType = _TestGridSessionArtifactType | java.lang.String

type TestGridSessionArtifacts = js.Array[TestGridSessionArtifact]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CLOSED
  - typings.awsSdk.awsSdkStrings.ERRORED
  - java.lang.String
*/
type TestGridSessionStatus = _TestGridSessionStatus | java.lang.String

type TestGridSessions = js.Array[TestGridSession]

type TestGridUrlExpiresInSecondsInput = scala.Double

type TestParameters = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILTIN_FUZZ
  - typings.awsSdk.awsSdkStrings.BUILTIN_EXPLORER
  - typings.awsSdk.awsSdkStrings.WEB_PERFORMANCE_PROFILE
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG
  - typings.awsSdk.awsSdkStrings.APPIUM_PYTHON
  - typings.awsSdk.awsSdkStrings.APPIUM_NODE
  - typings.awsSdk.awsSdkStrings.APPIUM_RUBY
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_NODE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY
  - typings.awsSdk.awsSdkStrings.CALABASH
  - typings.awsSdk.awsSdkStrings.INSTRUMENTATION
  - typings.awsSdk.awsSdkStrings.UIAUTOMATION
  - typings.awsSdk.awsSdkStrings.UIAUTOMATOR
  - typings.awsSdk.awsSdkStrings.XCTEST
  - typings.awsSdk.awsSdkStrings.XCTEST_UI
  - typings.awsSdk.awsSdkStrings.REMOTE_ACCESS_RECORD
  - typings.awsSdk.awsSdkStrings.REMOTE_ACCESS_REPLAY
  - java.lang.String
*/
type TestType = _TestType | java.lang.String

type Tests = js.Array[Test]

type TransactionIdentifier = java.lang.String

type URL = java.lang.String

type UniqueProblems = js.Array[UniqueProblem]

type UniqueProblemsByExecutionResultMap = StringDictionary[UniqueProblems]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CURATED
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type UploadCategory = _UploadCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UploadStatus = _UploadStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANDROID_APP
  - typings.awsSdk.awsSdkStrings.IOS_APP
  - typings.awsSdk.awsSdkStrings.WEB_APP
  - typings.awsSdk.awsSdkStrings.EXTERNAL_DATA
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.CALABASH_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.UIAUTOMATION_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.UIAUTOMATOR_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.XCTEST_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.XCTEST_UI_TEST_PACKAGE
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_SPEC
  - typings.awsSdk.awsSdkStrings.XCTEST_UI_TEST_SPEC
  - java.lang.String
*/
type UploadType = _UploadType | java.lang.String

type Uploads = js.Array[Upload]

type VPCEConfigurationDescription = java.lang.String

type VPCEConfigurationName = java.lang.String

type VPCEConfigurations = js.Array[VPCEConfiguration]

type VPCEServiceName = java.lang.String

type VideoCapture = scala.Boolean

type VpcSecurityGroupIds = js.Array[SecurityGroupId]

type VpcSubnetIds = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-06-23`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
