package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMacieMod {
  import typings.awsDashSdk.awsDashSdkStrings.FULL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AWSAccountId = String
  type BucketName = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = String
  type ExceptionMessage = String
  type FailedS3Resources = js.Array[FailedS3Resource]
  type MaxResults = Double
  type MemberAccounts = js.Array[MemberAccount]
  type NextToken = String
  type Prefix = String
  type S3ContinuousClassificationType = FULL | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type S3OneTimeClassificationType = _S3OneTimeClassificationType | String
  type S3Resources = js.Array[S3Resource]
  type S3ResourcesClassification = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-12-19`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
