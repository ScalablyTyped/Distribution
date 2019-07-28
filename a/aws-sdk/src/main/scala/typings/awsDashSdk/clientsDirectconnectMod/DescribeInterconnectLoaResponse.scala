package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInterconnectLoaResponse extends js.Object {
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.undefined
}

object DescribeInterconnectLoaResponse {
  @scala.inline
  def apply(loa: Loa = null): DescribeInterconnectLoaResponse = {
    val __obj = js.Dynamic.literal()
    if (loa != null) __obj.updateDynamic("loa")(loa)
    __obj.asInstanceOf[DescribeInterconnectLoaResponse]
  }
}

