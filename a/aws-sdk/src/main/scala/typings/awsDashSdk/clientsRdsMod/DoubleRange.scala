package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleRange extends js.Object {
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Double] = js.undefined
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Double] = js.undefined
}

object DoubleRange {
  @scala.inline
  def apply(From: Int | scala.Double = null, To: Int | scala.Double = null): DoubleRange = {
    val __obj = js.Dynamic.literal()
    if (From != null) __obj.updateDynamic("From")(From.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleRange]
  }
}

