package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type ByteSize = Double

type ClientToken = String

type ConnectionId = String

type ConnectionIdList = js.Array[ConnectionId]

type ConnectionList = js.Array[Connection]

type DateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOY
  - typings.awsSdk.awsSdkStrings.UNDEPLOY
  - java.lang.String
*/
type DeploymentAction = _DeploymentAction | String

type DeploymentId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DeploymentState = _DeploymentState | String

type ExtensionDescription = String

type ExtensionDetailsList = js.Array[ExtensionDetails]

type ExtensionName = String

type ExtensionNamespace = String

type ExtensionVersion = String

type ExtensionVersionDetailsList = js.Array[ExtensionVersionDetails]

type ExtensionVersionSchema = String

type GameDescription = String

type GameKey = String

type GameName = String

type GameSdkVersion = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type GameState = _GameState | String

type GameSummaryList = js.Array[GameSummary]

type GameTerminationProtection = Boolean

type GeneratedCodeJobDescription = String

type GeneratedCodeJobDetailsList = js.Array[GeneratedCodeJobDetails]

type GeneratedCodeJobId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type GeneratedCodeJobState = _GeneratedCodeJobState | String

type Language = String

type LogGroupName = String

type MaxResults = Double

type Message = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.REMOVE
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type Operation = _Operation | String

type Path = String

type PlayerId = String

type RawGameConfigurationData = Buffer | js.typedarray.Uint8Array | Blob | String

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.INVALID_ROLE_FAILURE
  - typings.awsSdk.awsSdkStrings.UNSPECIFIED_FAILURE
  - java.lang.String
*/
type ResultCode = _ResultCode | String

type RoleARN = String

type S3PresignedUrl = String

type SectionList = js.Array[SectionName]

type SectionModificationList = js.Array[SectionModification]

type SectionName = String

type Sections = StringDictionary[Section]

type SnapshotDescription = String

type SnapshotId = String

type SnapshotSummaryList = js.Array[SnapshotSummary]

type StageDeploymentList = js.Array[StageDeploymentSummary]

type StageDescription = String

type StageName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type StageState = _StageState | String

type StageSummaryList = js.Array[StageSummary]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetPlatform = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-08-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
