package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTextractMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type BlockList = js.Array[Block]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEY_VALUE_SET
    - typings.awsDashSdk.awsDashSdkStrings.PAGE
    - typings.awsDashSdk.awsDashSdkStrings.LINE
    - typings.awsDashSdk.awsDashSdkStrings.WORD
    - typings.awsDashSdk.awsDashSdkStrings.TABLE
    - typings.awsDashSdk.awsDashSdkStrings.CELL
    - typings.awsDashSdk.awsDashSdkStrings.SELECTION_ELEMENT
    - java.lang.String
  */
  type BlockType = _BlockType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = _ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEY
    - typings.awsDashSdk.awsDashSdkStrings.VALUE
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypes = js.Array[EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TABLES
    - typings.awsDashSdk.awsDashSdkStrings.FORMS
    - java.lang.String
  */
  type FeatureType = _FeatureType | java.lang.String
  type FeatureTypes = js.Array[FeatureType]
  type Float = Double
  type FlowDefinitionArn = java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type IdList = js.Array[NonEmptyString]
  type ImageBlob = Buffer | Uint8Array | Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[UInteger]
  type PaginationToken = java.lang.String
  type Percent = Double
  type Polygon = js.Array[Point]
  type RelationshipList = js.Array[Relationship]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VALUE
    - typings.awsDashSdk.awsDashSdkStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = _RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SELECTED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_SELECTED
    - java.lang.String
  */
  type SelectionStatus = _SelectionStatus | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = Double
  type Warnings = js.Array[Warning]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-06-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
