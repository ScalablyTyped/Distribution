package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityIdFormatResult extends js.Object {
  /**
    * Information about the ID format for the resources.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
}

object DescribeIdentityIdFormatResult {
  @scala.inline
  def apply(Statuses: IdFormatList = null): DescribeIdentityIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses)
    __obj.asInstanceOf[DescribeIdentityIdFormatResult]
  }
}

