package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMacieMod {
  type AWSAccountId = java.lang.String
  type BucketName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = java.lang.String
  type ExceptionMessage = java.lang.String
  type FailedS3Resources = js.Array[FailedS3Resource]
  type MaxResults = scala.Double
  type MemberAccounts = js.Array[MemberAccount]
  type NextToken = java.lang.String
  type Prefix = java.lang.String
  type S3ContinuousClassificationType = awsDashSdkLib.awsDashSdkLibStrings.FULL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type S3OneTimeClassificationType = _S3OneTimeClassificationType | java.lang.String
  type S3Resources = js.Array[S3Resource]
  type S3ResourcesClassification = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-12-19`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
