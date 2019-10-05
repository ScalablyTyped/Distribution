package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSecurityProfileRequest extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.undefined
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  /**
    * If true, delete all additionalMetricsToRetain defined for this security profile. If any additionalMetricsToRetain are defined in the current invocation, an exception occurs.
    */
  var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.undefined
  /**
    * If true, delete all alertTargets defined for this security profile. If any alertTargets are defined in the current invocation, an exception occurs.
    */
  var deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.undefined
  /**
    * If true, delete all behaviors defined for this security profile. If any behaviors are defined in the current invocation, an exception occurs.
    */
  var deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.undefined
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  /**
    * The name of the security profile you want to update.
    */
  var securityProfileName: SecurityProfileName
}

object UpdateSecurityProfileRequest {
  @scala.inline
  def apply(
    securityProfileName: SecurityProfileName,
    additionalMetricsToRetain: AdditionalMetricsToRetainList = null,
    alertTargets: AlertTargets = null,
    behaviors: Behaviors = null,
    deleteAdditionalMetricsToRetain: js.UndefOr[scala.Boolean] = js.undefined,
    deleteAlertTargets: js.UndefOr[scala.Boolean] = js.undefined,
    deleteBehaviors: js.UndefOr[scala.Boolean] = js.undefined,
    expectedVersion: Int | Double = null,
    securityProfileDescription: SecurityProfileDescription = null
  ): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName)
    if (additionalMetricsToRetain != null) __obj.updateDynamic("additionalMetricsToRetain")(additionalMetricsToRetain)
    if (alertTargets != null) __obj.updateDynamic("alertTargets")(alertTargets)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (!js.isUndefined(deleteAdditionalMetricsToRetain)) __obj.updateDynamic("deleteAdditionalMetricsToRetain")(deleteAdditionalMetricsToRetain)
    if (!js.isUndefined(deleteAlertTargets)) __obj.updateDynamic("deleteAlertTargets")(deleteAlertTargets)
    if (!js.isUndefined(deleteBehaviors)) __obj.updateDynamic("deleteBehaviors")(deleteBehaviors)
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    if (securityProfileDescription != null) __obj.updateDynamic("securityProfileDescription")(securityProfileDescription)
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
}

