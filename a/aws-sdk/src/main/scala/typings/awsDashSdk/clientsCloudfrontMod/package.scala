package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.URLEncoded
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudfrontMod {
  type AliasICPRecordals = js.Array[AliasICPRecordal]
  type AliasList = js.Array[String]
  type AwsAccountNumberList = js.Array[String]
  type CacheBehaviorList = js.Array[CacheBehavior]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.cloudfront
    - typings.awsDashSdk.awsDashSdkStrings.iam
    - typings.awsDashSdk.awsDashSdkStrings.acm
    - java.lang.String
  */
  type CertificateSource = _CertificateSource | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CommentType = String
  type ContentTypeProfileList = js.Array[ContentTypeProfile]
  type CookieNameList = js.Array[String]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EncryptionEntityList = js.Array[EncryptionEntity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`viewer-request`
    - typings.awsDashSdk.awsDashSdkStrings.`viewer-response`
    - typings.awsDashSdk.awsDashSdkStrings.`origin-request`
    - typings.awsDashSdk.awsDashSdkStrings.`origin-response`
    - java.lang.String
  */
  type EventType = _EventType | String
  type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[String]
  type Format = URLEncoded | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.blacklist
    - typings.awsDashSdk.awsDashSdkStrings.whitelist
    - typings.awsDashSdk.awsDashSdkStrings.none
    - java.lang.String
  */
  type GeoRestrictionType = _GeoRestrictionType | String
  type HeaderList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.http1DOT1
    - typings.awsDashSdk.awsDashSdkStrings.http2
    - java.lang.String
  */
  type HttpVersion = _HttpVersion | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.APPROVED
    - typings.awsDashSdk.awsDashSdkStrings.SUSPENDED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type ICPRecordalStatus = _ICPRecordalStatus | String
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none
    - typings.awsDashSdk.awsDashSdkStrings.whitelist
    - typings.awsDashSdk.awsDashSdkStrings.all
    - java.lang.String
  */
  type ItemSelection = _ItemSelection | String
  type KeyPairIdList = js.Array[String]
  type LambdaFunctionARN = String
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GET
    - typings.awsDashSdk.awsDashSdkStrings.HEAD
    - typings.awsDashSdk.awsDashSdkStrings.POST
    - typings.awsDashSdk.awsDashSdkStrings.PUT
    - typings.awsDashSdk.awsDashSdkStrings.PATCH
    - typings.awsDashSdk.awsDashSdkStrings.OPTIONS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type Method = _Method | String
  type MethodsList = js.Array[Method]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSLv3
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1_2016
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1DOT1_2016
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1DOT2_2018
    - java.lang.String
  */
  type MinimumProtocolVersion = _MinimumProtocolVersion | String
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginGroupList = js.Array[OriginGroup]
  type OriginGroupMemberList = js.Array[OriginGroupMember]
  type OriginList = js.Array[Origin]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`http-only`
    - typings.awsDashSdk.awsDashSdkStrings.`match-viewer`
    - typings.awsDashSdk.awsDashSdkStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicy = _OriginProtocolPolicy | String
  type PathList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PriceClass_100
    - typings.awsDashSdk.awsDashSdkStrings.PriceClass_200
    - typings.awsDashSdk.awsDashSdkStrings.PriceClass_All
    - java.lang.String
  */
  type PriceClass = _PriceClass | String
  type PublicKeySummaryList = js.Array[PublicKeySummary]
  type QueryArgProfileList = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[String]
  type ResourceARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`sni-only`
    - typings.awsDashSdk.awsDashSdkStrings.vip
    - java.lang.String
  */
  type SSLSupportMethod = _SSLSupportMethod | String
  type SignerList = js.Array[_Signer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSLv3
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1DOT1
    - typings.awsDashSdk.awsDashSdkStrings.TLSv1DOT2
    - java.lang.String
  */
  type SslProtocol = _SslProtocol | String
  type SslProtocolsList = js.Array[SslProtocol]
  type StatusCodeList = js.Array[integer]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`allow-all`
    - typings.awsDashSdk.awsDashSdkStrings.`https-only`
    - typings.awsDashSdk.awsDashSdkStrings.`redirect-to-https`
    - java.lang.String
  */
  type ViewerProtocolPolicy = _ViewerProtocolPolicy | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-05-12`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-11-11`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-05-31`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-10-21`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-06`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-04-17`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-07-27`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-09-17`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-01-13`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-01-28`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-08-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-08-20`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-09-07`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-09-29`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-25`
    - typings.awsDashSdk.awsDashSdkStrings.`2017-03-25`
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-30`
    - typings.awsDashSdk.awsDashSdkStrings.`2018-06-18`
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-05`
    - typings.awsDashSdk.awsDashSdkStrings.`2019-03-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type integer = Double
  type long = Double
  type timestamp = Date
}
