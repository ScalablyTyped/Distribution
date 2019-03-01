package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOptions extends js.Object {
  /**
    * Specify that this block must be skipped
    */
  var skip: js.UndefOr[scala.Boolean | js.Function0[scala.Unit]] = js.undefined
  /**
    * Specify the timeout for this block
    */
  var timeout: js.UndefOr[scala.Double | js.Function0[scala.Unit]] = js.undefined
}

object DescribeOptions {
  @scala.inline
  def apply(
    skip: scala.Boolean | js.Function0[scala.Unit] = null,
    timeout: scala.Double | js.Function0[scala.Unit] = null
  ): DescribeOptions = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOptions]
  }
}

