package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EKS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ACMCertArn = String

type Base64Encoded = String

type ClientToken = String

type ClusterId = String

type ConfigurationList = js.Array[Configuration]

type ContainerProviderType = EKS | String

type CredentialType = String

type Date = js.Date

type EndpointArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
  - java.lang.String
*/
type EndpointState = _EndpointState | String

type EndpointStates = js.Array[EndpointState]

type EndpointType = String

type EndpointTypes = js.Array[EndpointType]

type Endpoints = js.Array[Endpoint]

type EntryPointArgument = String

type EntryPointArguments = js.Array[EntryPointArgument]

type EntryPointPath = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.USER_ERROR
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.CLUSTER_UNAVAILABLE
  - java.lang.String
*/
type FailureReason = _FailureReason | String

type IAMRoleArn = String

type JavaInteger = Double

type JobArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.CANCEL_PENDING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JobRunStates = js.Array[JobRunState]

type JobRuns = js.Array[JobRun]

type JobTemplateArn = String

type JobTemplates = js.Array[JobTemplate]

type KmsKeyArn = String

type KubernetesNamespace = String

type LogContext = String

type LogGroupName = String

type NextToken = String

type ParametricIAMRoleArn = String

type ParametricReleaseLabel = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PersistentAppUI = _PersistentAppUI | String

type ReleaseLabel = String

type RequestIdentityUserArn = String

type ResourceIdString = String

type ResourceNameString = String

type RsiArn = String

type SensitivePropertiesMap = StringDictionary[String1024]

type SparkSqlParameters = String

type SparkSubmitParameters = String

type String1024 = String

type String128 = String

type String2048 = String

type String256 = String

type StringEmpty256 = String

type SubnetIds = js.Array[String256]

type TagKeyList = js.Array[String128]

type TagMap = StringDictionary[StringEmpty256]

type TemplateParameter = String

type TemplateParameterConfigurationMap = StringDictionary[TemplateParameterConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.STRING
  - java.lang.String
*/
type TemplateParameterDataType = _TemplateParameterDataType | String

type TemplateParameterInputMap = StringDictionary[String1024]

type TemplateParameterName = String

type Token = String

type UriString = String

type VirtualClusterArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.ARRESTED
  - java.lang.String
*/
type VirtualClusterState = _VirtualClusterState | String

type VirtualClusterStates = js.Array[VirtualClusterState]

type VirtualClusters = js.Array[VirtualCluster]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-10-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
