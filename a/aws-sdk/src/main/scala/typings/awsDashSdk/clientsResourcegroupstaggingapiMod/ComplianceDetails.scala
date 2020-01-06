package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceDetails extends js.Object {
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ComplianceStatus] = js.native
  /**
    * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or noncompliant values. 
    */
  var KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.native
  /**
    * These tag keys on the resource are noncompliant with the effective tag policy.
    */
  var NoncompliantKeys: js.UndefOr[TagKeyList] = js.native
}

object ComplianceDetails {
  @scala.inline
  def apply(
    ComplianceStatus: js.UndefOr[Boolean] = js.undefined,
    KeysWithNoncompliantValues: TagKeyList = null,
    NoncompliantKeys: TagKeyList = null
  ): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComplianceStatus)) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus.asInstanceOf[js.Any])
    if (KeysWithNoncompliantValues != null) __obj.updateDynamic("KeysWithNoncompliantValues")(KeysWithNoncompliantValues.asInstanceOf[js.Any])
    if (NoncompliantKeys != null) __obj.updateDynamic("NoncompliantKeys")(NoncompliantKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceDetails]
  }
}

