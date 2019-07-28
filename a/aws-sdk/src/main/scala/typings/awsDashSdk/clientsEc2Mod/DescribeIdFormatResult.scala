package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdFormatResult extends js.Object {
  /**
    * Information about the ID format for the resource.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
}

object DescribeIdFormatResult {
  @scala.inline
  def apply(Statuses: IdFormatList = null): DescribeIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses)
    __obj.asInstanceOf[DescribeIdFormatResult]
  }
}

