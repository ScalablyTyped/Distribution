package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorResourceDetail extends js.Object {
  /**
    * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the user.
    */
  var isSuppressed: js.UndefOr[Boolean] = js.native
  /**
    * Additional information about the identified resource. The exact metadata and its order can be obtained by inspecting the TrustedAdvisorCheckDescription object returned by the call to DescribeTrustedAdvisorChecks. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data.
    */
  var metadata: StringList = js.native
  /**
    * The AWS region in which the identified resource is located.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the identified resource.
    */
  var resourceId: String = js.native
  /**
    * The status code for the resource identified in the Trusted Advisor check.
    */
  var status: String = js.native
}

object TrustedAdvisorResourceDetail {
  @scala.inline
  def apply(
    metadata: StringList,
    resourceId: String,
    status: String,
    isSuppressed: js.UndefOr[scala.Boolean] = js.undefined,
    region: String = null
  ): TrustedAdvisorResourceDetail = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuppressed)) __obj.updateDynamic("isSuppressed")(isSuppressed.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourceDetail]
  }
}

