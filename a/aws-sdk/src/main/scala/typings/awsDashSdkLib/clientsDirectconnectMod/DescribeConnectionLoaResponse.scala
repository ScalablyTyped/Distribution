package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConnectionLoaResponse extends js.Object {
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.undefined
}

object DescribeConnectionLoaResponse {
  @scala.inline
  def apply(loa: Loa = null): DescribeConnectionLoaResponse = {
    val __obj = js.Dynamic.literal()
    if (loa != null) __obj.updateDynamic("loa")(loa)
    __obj.asInstanceOf[DescribeConnectionLoaResponse]
  }
}

