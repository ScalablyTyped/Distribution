package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityProfileRequest extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
  /**
    * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a behavior.
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.undefined
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  /**
    * The name you are giving to the security profile.
    */
  var securityProfileName: SecurityProfileName
  /**
    * Metadata that can be used to manage the security profile.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateSecurityProfileRequest {
  @scala.inline
  def apply(
    securityProfileName: SecurityProfileName,
    additionalMetricsToRetain: AdditionalMetricsToRetainList = null,
    alertTargets: AlertTargets = null,
    behaviors: Behaviors = null,
    securityProfileDescription: SecurityProfileDescription = null,
    tags: TagList = null
  ): CreateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName)
    if (additionalMetricsToRetain != null) __obj.updateDynamic("additionalMetricsToRetain")(additionalMetricsToRetain)
    if (alertTargets != null) __obj.updateDynamic("alertTargets")(alertTargets)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (securityProfileDescription != null) __obj.updateDynamic("securityProfileDescription")(securityProfileDescription)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateSecurityProfileRequest]
  }
}

