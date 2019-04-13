package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSignerMod {
  type BucketName = java.lang.String
  type Category = awsDashSdkLib.awsDashSdkLibStrings.AWSIoT | java.lang.String
  type CertificateArn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CompletedAt = stdLib.Date
  type CreatedAt = stdLib.Date
  type DisplayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RSA
    - awsDashSdkLib.awsDashSdkLibStrings.ECDSA
    - java.lang.String
  */
  type EncryptionAlgorithm = _EncryptionAlgorithm | java.lang.String
  type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SHA1
    - awsDashSdkLib.awsDashSdkLibStrings.SHA256
    - java.lang.String
  */
  type HashAlgorithm = _HashAlgorithm | java.lang.String
  type HashAlgorithms = js.Array[HashAlgorithm]
  type ImageFormat = awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type ImageFormats = js.Array[ImageFormat]
  type JobId = java.lang.String
  type Key = java.lang.String
  type MaxResults = scala.Double
  type MaxSizeInMB = scala.Double
  type NextToken = java.lang.String
  type PlatformId = java.lang.String
  type Prefix = java.lang.String
  type ProfileName = java.lang.String
  type RequestedBy = java.lang.String
  type SigningJobs = js.Array[SigningJob]
  type SigningParameterKey = java.lang.String
  type SigningParameterValue = java.lang.String
  type SigningParameters = org.scalablytyped.runtime.StringDictionary[SigningParameterValue]
  type SigningPlatforms = js.Array[SigningPlatform]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Canceled
    - java.lang.String
  */
  type SigningProfileStatus = _SigningProfileStatus | java.lang.String
  type SigningProfiles = js.Array[SigningProfile]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type SigningStatus = _SigningStatus | java.lang.String
  type StatusReason = java.lang.String
  type String = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-08-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type bool = scala.Boolean
  type key = java.lang.String
}
