package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHubRequest extends js.Object {
  /**
    * The ARN of the Hub resource to retrieve.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.undefined
}

object DescribeHubRequest {
  @scala.inline
  def apply(HubArn: NonEmptyString = null): DescribeHubRequest = {
    val __obj = js.Dynamic.literal()
    if (HubArn != null) __obj.updateDynamic("HubArn")(HubArn)
    __obj.asInstanceOf[DescribeHubRequest]
  }
}

