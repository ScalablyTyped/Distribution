package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLambdaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ALL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type AdditionalVersionWeights = StringDictionary[Weight]
  type Alias = java.lang.String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = Double
  type BisectBatchOnFunctionError = scala.Boolean
  type BlobStream = Buffer | Uint8Array | Blob | java.lang.String | Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CompatibleRuntimes = js.Array[Runtime]
  type Description = java.lang.String
  type DestinationArn = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EnvironmentVariables = StringDictionary[EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRIM_HORIZON
    - typings.awsDashSdk.awsDashSdkStrings.LATEST
    - typings.awsDashSdk.awsDashSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = _EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionEventInvokeConfigList = js.Array[FunctionEventInvokeConfig]
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = Double
  type Integer = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Event_
    - typings.awsDashSdk.awsDashSdkStrings.RequestResponse
    - typings.awsDashSdk.awsDashSdkStrings.DryRun
    - java.lang.String
  */
  type InvocationType = _InvocationType | java.lang.String
  type KMSKeyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Successful_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - java.lang.String
  */
  type LastUpdateStatus = _LastUpdateStatus | java.lang.String
  type LastUpdateStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EniLimitExceeded_
    - typings.awsDashSdk.awsDashSdkStrings.InsufficientRolePermissions
    - typings.awsDashSdk.awsDashSdkStrings.InvalidConfiguration
    - typings.awsDashSdk.awsDashSdkStrings.InternalError
    - java.lang.String
  */
  type LastUpdateStatusReasonCode = _LastUpdateStatusReasonCode | java.lang.String
  type LayerArn = java.lang.String
  type LayerList = js.Array[LayerVersionArn]
  type LayerName = java.lang.String
  type LayerPermissionAllowedAction = java.lang.String
  type LayerPermissionAllowedPrincipal = java.lang.String
  type LayerVersionArn = java.lang.String
  type LayerVersionNumber = Double
  type LayerVersionsList = js.Array[LayerVersionsListItem]
  type LayersList = js.Array[LayersListItem]
  type LayersReferenceList = js.Array[Layer]
  type LicenseInfo = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Tail
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type Long = Double
  type MasterRegion = java.lang.String
  type MaxFunctionEventInvokeConfigListItems = Double
  type MaxLayerListItems = Double
  type MaxListItems = Double
  type MaxProvisionedConcurrencyConfigListItems = Double
  type MaximumBatchingWindowInSeconds = Double
  type MaximumEventAgeInSeconds = Double
  type MaximumRecordAgeInSeconds = Double
  type MaximumRetryAttempts = Double
  type MaximumRetryAttemptsEventSourceMapping = Double
  type MemorySize = Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type NonNegativeInteger = Double
  type OrganizationId = java.lang.String
  type ParallelizationFactor = Double
  type PositiveInteger = Double
  type Principal = java.lang.String
  type ProvisionedConcurrencyConfigList = js.Array[ProvisionedConcurrencyConfigListItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ProvisionedConcurrencyStatusEnum = _ProvisionedConcurrencyStatusEnum | java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.nodejs
    - typings.awsDashSdk.awsDashSdkStrings.nodejs4Dot3
    - typings.awsDashSdk.awsDashSdkStrings.nodejs6Dot10
    - typings.awsDashSdk.awsDashSdkStrings.nodejs8Dot10
    - typings.awsDashSdk.awsDashSdkStrings.nodejs10Dotx
    - typings.awsDashSdk.awsDashSdkStrings.nodejs12Dotx
    - typings.awsDashSdk.awsDashSdkStrings.java8
    - typings.awsDashSdk.awsDashSdkStrings.java11
    - typings.awsDashSdk.awsDashSdkStrings.python2Dot7
    - typings.awsDashSdk.awsDashSdkStrings.python3Dot6
    - typings.awsDashSdk.awsDashSdkStrings.python3Dot7
    - typings.awsDashSdk.awsDashSdkStrings.python3Dot8
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore1Dot0
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore2Dot0
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore2Dot1
    - typings.awsDashSdk.awsDashSdkStrings.`nodejs4Dot3-edge`
    - typings.awsDashSdk.awsDashSdkStrings.go1Dotx
    - typings.awsDashSdk.awsDashSdkStrings.ruby2Dot5
    - typings.awsDashSdk.awsDashSdkStrings.provided
    - java.lang.String
  */
  type Runtime = _Runtime | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SensitiveString = java.lang.String
  type SourceOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Inactive_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type State = _State | java.lang.String
  type StateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Idle_
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Restoring_
    - typings.awsDashSdk.awsDashSdkStrings.EniLimitExceeded_
    - typings.awsDashSdk.awsDashSdkStrings.InsufficientRolePermissions
    - typings.awsDashSdk.awsDashSdkStrings.InvalidConfiguration
    - typings.awsDashSdk.awsDashSdkStrings.InternalError
    - typings.awsDashSdk.awsDashSdkStrings.SubnetOutOfIPAddresses
    - java.lang.String
  */
  type StateReasonCode = _StateReasonCode | java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = StringDictionary[TagValue]
  type Timeout = Double
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.PassThrough_
    - java.lang.String
  */
  type TracingMode = _TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = Double
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-11`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-03-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
