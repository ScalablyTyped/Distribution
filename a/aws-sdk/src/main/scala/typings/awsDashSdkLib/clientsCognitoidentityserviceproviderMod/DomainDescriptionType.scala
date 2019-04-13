package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDescriptionType extends js.Object {
  /**
    * The AWS account ID for the user pool owner.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  /**
    * The ARN of the CloudFront distribution.
    */
  var CloudFrontDistribution: js.UndefOr[StringType] = js.undefined
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
  /**
    * The domain string.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  var S3Bucket: js.UndefOr[S3BucketType] = js.undefined
  /**
    * The domain status.
    */
  var Status: js.UndefOr[DomainStatusType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  /**
    * The app version.
    */
  var Version: js.UndefOr[DomainVersionType] = js.undefined
}

object DomainDescriptionType {
  @scala.inline
  def apply(
    AWSAccountId: AWSAccountIdType = null,
    CloudFrontDistribution: StringType = null,
    CustomDomainConfig: CustomDomainConfigType = null,
    Domain: DomainType = null,
    S3Bucket: S3BucketType = null,
    Status: DomainStatusType = null,
    UserPoolId: UserPoolIdType = null,
    Version: DomainVersionType = null
  ): DomainDescriptionType = {
    val __obj = js.Dynamic.literal()
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId)
    if (CloudFrontDistribution != null) __obj.updateDynamic("CloudFrontDistribution")(CloudFrontDistribution)
    if (CustomDomainConfig != null) __obj.updateDynamic("CustomDomainConfig")(CustomDomainConfig)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[DomainDescriptionType]
  }
}

