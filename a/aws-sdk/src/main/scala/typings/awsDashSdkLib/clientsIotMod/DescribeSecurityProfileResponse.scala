package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSecurityProfileResponse extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors but it is also retained for any metric specified here.
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
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
  /**
    * A description of the security profile (associated with the security profile when it was created or updated).
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  /**
    * The name of the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  /**
    * The version of the security profile. A new version is generated whenever the security profile is updated.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object DescribeSecurityProfileResponse {
  @scala.inline
  def apply(
    additionalMetricsToRetain: AdditionalMetricsToRetainList = null,
    alertTargets: AlertTargets = null,
    behaviors: Behaviors = null,
    creationDate: Timestamp = null,
    lastModifiedDate: Timestamp = null,
    securityProfileArn: SecurityProfileArn = null,
    securityProfileDescription: SecurityProfileDescription = null,
    securityProfileName: SecurityProfileName = null,
    version: js.UndefOr[Version] = js.undefined
  ): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (additionalMetricsToRetain != null) __obj.updateDynamic("additionalMetricsToRetain")(additionalMetricsToRetain)
    if (alertTargets != null) __obj.updateDynamic("alertTargets")(alertTargets)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (securityProfileArn != null) __obj.updateDynamic("securityProfileArn")(securityProfileArn)
    if (securityProfileDescription != null) __obj.updateDynamic("securityProfileDescription")(securityProfileDescription)
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
}

