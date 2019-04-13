package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudfrontMod {
  type AliasList = js.Array[java.lang.String]
  type AwsAccountNumberList = js.Array[java.lang.String]
  type CacheBehaviorList = js.Array[CacheBehavior]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.cloudfront
    - awsDashSdkLib.awsDashSdkLibStrings.iam
    - awsDashSdkLib.awsDashSdkLibStrings.acm
    - java.lang.String
  */
  type CertificateSource = _CertificateSource | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type ContentTypeProfileList = js.Array[ContentTypeProfile]
  type CookieNameList = js.Array[java.lang.String]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EncryptionEntityList = js.Array[EncryptionEntity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`viewer-request`
    - awsDashSdkLib.awsDashSdkLibStrings.`viewer-response`
    - awsDashSdkLib.awsDashSdkLibStrings.`origin-request`
    - awsDashSdkLib.awsDashSdkLibStrings.`origin-response`
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[java.lang.String]
  type Format = awsDashSdkLib.awsDashSdkLibStrings.URLEncoded | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.blacklist
    - awsDashSdkLib.awsDashSdkLibStrings.whitelist
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - java.lang.String
  */
  type GeoRestrictionType = _GeoRestrictionType | java.lang.String
  type HeaderList = js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.http1DOT1
    - awsDashSdkLib.awsDashSdkLibStrings.http2
    - java.lang.String
  */
  type HttpVersion = _HttpVersion | java.lang.String
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.whitelist
    - awsDashSdkLib.awsDashSdkLibStrings.all
    - java.lang.String
  */
  type ItemSelection = _ItemSelection | java.lang.String
  type KeyPairIdList = js.Array[java.lang.String]
  type LambdaFunctionARN = java.lang.String
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GET
    - awsDashSdkLib.awsDashSdkLibStrings.HEAD
    - awsDashSdkLib.awsDashSdkLibStrings.POST
    - awsDashSdkLib.awsDashSdkLibStrings.PUT
    - awsDashSdkLib.awsDashSdkLibStrings.PATCH
    - awsDashSdkLib.awsDashSdkLibStrings.OPTIONS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type Method = _Method | java.lang.String
  type MethodsList = js.Array[Method]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SSLv3
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1_2016
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT1_2016
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT2_2018
    - java.lang.String
  */
  type MinimumProtocolVersion = _MinimumProtocolVersion | java.lang.String
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginGroupList = js.Array[OriginGroup]
  type OriginGroupMemberList = js.Array[OriginGroupMember]
  type OriginList = js.Array[Origin]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`http-only`
    - awsDashSdkLib.awsDashSdkLibStrings.`match-viewer`
    - awsDashSdkLib.awsDashSdkLibStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicy = _OriginProtocolPolicy | java.lang.String
  type PathList = js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PriceClass_100
    - awsDashSdkLib.awsDashSdkLibStrings.PriceClass_200
    - awsDashSdkLib.awsDashSdkLibStrings.PriceClass_All
    - java.lang.String
  */
  type PriceClass = _PriceClass | java.lang.String
  type PublicKeySummaryList = js.Array[PublicKeySummary]
  type QueryArgProfileList = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[java.lang.String]
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`sni-only`
    - awsDashSdkLib.awsDashSdkLibStrings.vip
    - java.lang.String
  */
  type SSLSupportMethod = _SSLSupportMethod | java.lang.String
  type SignerList = js.Array[_Signer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SSLv3
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT1
    - awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT2
    - java.lang.String
  */
  type SslProtocol = _SslProtocol | java.lang.String
  type SslProtocolsList = js.Array[SslProtocol]
  type StatusCodeList = js.Array[integer]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`allow-all`
    - awsDashSdkLib.awsDashSdkLibStrings.`https-only`
    - awsDashSdkLib.awsDashSdkLibStrings.`redirect-to-https`
    - java.lang.String
  */
  type ViewerProtocolPolicy = _ViewerProtocolPolicy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-05-12`
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-11-11`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-05-31`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-10-21`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-06`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-17`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-07-27`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-09-17`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-01-13`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-01-28`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-08-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-08-20`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-09-07`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-09-29`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-25`
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-03-25`
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-30`
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-06-18`
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-05`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type integer = scala.Double
  type long = scala.Double
  type timestamp = stdLib.Date
}
