package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSettingsRequest extends js.Object {
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  /**
    * Enables integration with AWS Organizations for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.OrganizationConfiguration] = js.native
  /**
    * Amazon Resource Name (ARN) of the Amazon S3 bucket where the License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
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
    if (!js.isUndefined(EnableCrossAccountsDiscovery)) __obj.updateDynamic("EnableCrossAccountsDiscovery")(EnableCrossAccountsDiscovery.asInstanceOf[js.Any])
    if (OrganizationConfiguration != null) __obj.updateDynamic("OrganizationConfiguration")(OrganizationConfiguration.asInstanceOf[js.Any])
    if (S3BucketArn != null) __obj.updateDynamic("S3BucketArn")(S3BucketArn.asInstanceOf[js.Any])
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
}

