package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceSettingsRequest extends js.Object {
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * Integrates AWS Organizations with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.OrganizationConfiguration] = js.undefined
  /**
    * ARN of the Amazon S3 bucket where License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.undefined
  /**
    * ARN of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
}

object UpdateServiceSettingsRequest {
  @scala.inline
  def apply(
    EnableCrossAccountsDiscovery: js.UndefOr[scala.Boolean] = js.undefined,
    OrganizationConfiguration: OrganizationConfiguration = null,
    S3BucketArn: String = null,
    SnsTopicArn: String = null
  ): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableCrossAccountsDiscovery)) __obj.updateDynamic("EnableCrossAccountsDiscovery")(EnableCrossAccountsDiscovery)
    if (OrganizationConfiguration != null) __obj.updateDynamic("OrganizationConfiguration")(OrganizationConfiguration)
    if (S3BucketArn != null) __obj.updateDynamic("S3BucketArn")(S3BucketArn)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
}

