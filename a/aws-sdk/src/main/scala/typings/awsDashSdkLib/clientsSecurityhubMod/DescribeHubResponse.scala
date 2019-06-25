package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHubResponse extends js.Object {
  /**
    * The ARN of the Hub resource retrieved.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date and time when Security Hub was enabled in the account.
    */
  var SubscribedAt: js.UndefOr[NonEmptyString] = js.undefined
}

object DescribeHubResponse {
  @scala.inline
  def apply(HubArn: NonEmptyString = null, SubscribedAt: NonEmptyString = null): DescribeHubResponse = {
    val __obj = js.Dynamic.literal()
    if (HubArn != null) __obj.updateDynamic("HubArn")(HubArn)
    if (SubscribedAt != null) __obj.updateDynamic("SubscribedAt")(SubscribedAt)
    __obj.asInstanceOf[DescribeHubResponse]
  }
}

