package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSignerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.AWSIoT
  import typings.awsDashSdk.awsDashSdkStrings.JSON
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type BucketName = java.lang.String
  type Category = AWSIoT | java.lang.String
  type CertificateArn = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CompletedAt = Date
  type CreatedAt = Date
  type DisplayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSA
    - typings.awsDashSdk.awsDashSdkStrings.ECDSA
    - java.lang.String
  */
  type EncryptionAlgorithm = _EncryptionAlgorithm | java.lang.String
  type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SHA1
    - typings.awsDashSdk.awsDashSdkStrings.SHA256
    - java.lang.String
  */
  type HashAlgorithm = _HashAlgorithm | java.lang.String
  type HashAlgorithms = js.Array[HashAlgorithm]
  type ImageFormat = JSON | java.lang.String
  type ImageFormats = js.Array[ImageFormat]
  type JobId = java.lang.String
  type Key = java.lang.String
  type MaxResults = Double
  type MaxSizeInMB = Double
  type NextToken = java.lang.String
  type PlatformId = java.lang.String
  type Prefix = java.lang.String
  type ProfileName = java.lang.String
  type RequestedBy = java.lang.String
  type SigningJobs = js.Array[SigningJob]
  type SigningParameterKey = java.lang.String
  type SigningParameterValue = java.lang.String
  type SigningParameters = StringDictionary[SigningParameterValue]
  type SigningPlatforms = js.Array[SigningPlatform]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Canceled
    - java.lang.String
  */
  type SigningProfileStatus = _SigningProfileStatus | java.lang.String
  type SigningProfiles = js.Array[SigningProfile]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - java.lang.String
  */
  type SigningStatus = _SigningStatus | java.lang.String
  type StatusReason = java.lang.String
  type String = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-08-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type bool = Boolean
  type key = java.lang.String
}
