package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTextractMod {
  type BlockList = js.Array[Block]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_VALUE_SET
    - awsDashSdkLib.awsDashSdkLibStrings.PAGE
    - awsDashSdkLib.awsDashSdkLibStrings.LINE
    - awsDashSdkLib.awsDashSdkLibStrings.WORD
    - awsDashSdkLib.awsDashSdkLibStrings.TABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CELL
    - awsDashSdkLib.awsDashSdkLibStrings.SELECTION_ELEMENT
    - java.lang.String
  */
  type BlockType = _BlockType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypes = js.Array[EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TABLES
    - awsDashSdkLib.awsDashSdkLibStrings.FORMS
    - java.lang.String
  */
  type FeatureType = _FeatureType | java.lang.String
  type FeatureTypes = js.Array[FeatureType]
  type Float = scala.Double
  type IdList = js.Array[NonEmptyString]
  type ImageBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[UInteger]
  type PaginationToken = java.lang.String
  type Percent = scala.Double
  type Polygon = js.Array[Point]
  type RelationshipList = js.Array[Relationship]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = _RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SELECTED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_SELECTED
    - java.lang.String
  */
  type SelectionStatus = _SelectionStatus | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = scala.Double
  type Warnings = js.Array[Warning]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-06-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
