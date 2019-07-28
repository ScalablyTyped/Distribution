package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceSettingsResponse extends js.Object {
  /**
    * Indicates whether cross-account discovery has been enabled.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * Indicates whether AWS Organizations has been integrated with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.OrganizationConfiguration] = js.undefined
  /**
    * Regional S3 bucket path for storing reports, license trail event data, discovery data, etc.
    */
  var S3BucketArn: js.UndefOr[String] = js.undefined
  /**
    * SNS topic configured to receive notifications from License Manager.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
}

object GetServiceSettingsResponse {
  @scala.inline
  def apply(
    EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
    OrganizationConfiguration: OrganizationConfiguration = null,
    S3BucketArn: String = null,
    SnsTopicArn: String = null
  ): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableCrossAccountsDiscovery)) __obj.updateDynamic("EnableCrossAccountsDiscovery")(EnableCrossAccountsDiscovery)
    if (OrganizationConfiguration != null) __obj.updateDynamic("OrganizationConfiguration")(OrganizationConfiguration)
    if (S3BucketArn != null) __obj.updateDynamic("S3BucketArn")(S3BucketArn)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
}

