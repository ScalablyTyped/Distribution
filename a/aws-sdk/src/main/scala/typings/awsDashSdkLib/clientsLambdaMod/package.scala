package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLambdaMod {
  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type AdditionalVersionWeights = org.scalablytyped.runtime.StringDictionary[Weight]
  type Alias = java.lang.String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = scala.Double
  type BlobStream = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompatibleRuntimes = js.Array[Runtime]
  type Description = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LATEST
    - awsDashSdkLib.awsDashSdkLibStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = _EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Event
    - awsDashSdkLib.awsDashSdkLibStrings.RequestResponse
    - awsDashSdkLib.awsDashSdkLibStrings.DryRun
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
  type LayerVersionNumber = scala.Double
  type LayerVersionsList = js.Array[LayerVersionsListItem]
  type LayersList = js.Array[LayersListItem]
  type LayersReferenceList = js.Array[Layer]
  type LicenseInfo = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.Tail
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type Long = scala.Double
  type MasterRegion = java.lang.String
  type MaxLayerListItems = scala.Double
  type MaxListItems = scala.Double
  type MemorySize = scala.Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type OrganizationId = java.lang.String
  type Principal = java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = scala.Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs4DOT3
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs6DOT10
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs8DOT10
    - awsDashSdkLib.awsDashSdkLibStrings.java8
    - awsDashSdkLib.awsDashSdkLibStrings.python2DOT7
    - awsDashSdkLib.awsDashSdkLibStrings.python3DOT6
    - awsDashSdkLib.awsDashSdkLibStrings.python3DOT7
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore1DOT0
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT0
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT1
    - awsDashSdkLib.awsDashSdkLibStrings.`nodejs4DOT3-edge`
    - awsDashSdkLib.awsDashSdkLibStrings.go1DOTx
    - awsDashSdkLib.awsDashSdkLibStrings.ruby2DOT5
    - awsDashSdkLib.awsDashSdkLibStrings.provided
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
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type Timeout = scala.Double
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.PassThrough
    - java.lang.String
  */
  type TracingMode = _TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-11`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-03-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
