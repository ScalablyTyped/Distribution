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
  type BlobStream = Buffer | Uint8Array | Blob | java.lang.String | Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CompatibleRuntimes = js.Array[Runtime]
  type Description = java.lang.String
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
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = Double
  type Integer = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Event
    - typings.awsDashSdk.awsDashSdkStrings.RequestResponse
    - typings.awsDashSdk.awsDashSdkStrings.DryRun
    - java.lang.String
  */
  type InvocationType = _InvocationType | java.lang.String
  type KMSKeyArn = java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.None
    - typings.awsDashSdk.awsDashSdkStrings.Tail
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type Long = Double
  type MasterRegion = java.lang.String
  type MaxLayerListItems = Double
  type MaxListItems = Double
  type MemorySize = Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type OrganizationId = java.lang.String
  type Principal = java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.nodejs
    - typings.awsDashSdk.awsDashSdkStrings.nodejs4DOT3
    - typings.awsDashSdk.awsDashSdkStrings.nodejs6DOT10
    - typings.awsDashSdk.awsDashSdkStrings.nodejs8DOT10
    - typings.awsDashSdk.awsDashSdkStrings.nodejs10DOTx
    - typings.awsDashSdk.awsDashSdkStrings.java8
    - typings.awsDashSdk.awsDashSdkStrings.python2DOT7
    - typings.awsDashSdk.awsDashSdkStrings.python3DOT6
    - typings.awsDashSdk.awsDashSdkStrings.python3DOT7
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore1DOT0
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore2DOT0
    - typings.awsDashSdk.awsDashSdkStrings.dotnetcore2DOT1
    - typings.awsDashSdk.awsDashSdkStrings.`nodejs4DOT3-edge`
    - typings.awsDashSdk.awsDashSdkStrings.go1DOTx
    - typings.awsDashSdk.awsDashSdkStrings.ruby2DOT5
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
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.PassThrough
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
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
