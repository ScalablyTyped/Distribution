package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceDetails extends js.Object {
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[ComplianceStatus] = js.undefined
  /**
    * The tag key is noncompliant with the effective tag policy.
    */
  var InvalidKeys: js.UndefOr[TagKeyList] = js.undefined
  /**
    * The tag value is noncompliant with the effective tag policy.
    */
  var InvalidValues: js.UndefOr[TagKeyList] = js.undefined
  /**
    * A tag key that is required by the effective tag policy is missing.
    */
  var MissingKeys: js.UndefOr[TagKeyList] = js.undefined
}

object ComplianceDetails {
  @scala.inline
  def apply(
    ComplianceStatus: js.UndefOr[ComplianceStatus] = js.undefined,
    InvalidKeys: TagKeyList = null,
    InvalidValues: TagKeyList = null,
    MissingKeys: TagKeyList = null
  ): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComplianceStatus)) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus)
    if (InvalidKeys != null) __obj.updateDynamic("InvalidKeys")(InvalidKeys)
    if (InvalidValues != null) __obj.updateDynamic("InvalidValues")(InvalidValues)
    if (MissingKeys != null) __obj.updateDynamic("MissingKeys")(MissingKeys)
    __obj.asInstanceOf[ComplianceDetails]
  }
}

