package typings.awsSdk.clientsMacieMod

import typings.awsSdk.awsSdkStrings.FULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountId = String

type BucketName = String

type ErrorCode = String

type ExceptionMessage = String

type FailedS3Resources = js.Array[FailedS3Resource]

type MaxResults = Double

type MemberAccounts = js.Array[MemberAccount]

type NextToken = String

type Prefix = String

type S3ContinuousClassificationType = FULL | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type S3OneTimeClassificationType = _S3OneTimeClassificationType | String

type S3Resources = js.Array[S3Resource]

type S3ResourcesClassification = js.Array[S3ResourceClassification]

type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-12-19`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
