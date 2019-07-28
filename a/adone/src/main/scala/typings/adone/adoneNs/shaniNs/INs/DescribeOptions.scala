package typings.adone.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOptions extends js.Object {
  /**
    * Specify that this block must be skipped
    */
  var skip: js.UndefOr[Boolean | js.Function0[Unit]] = js.undefined
  /**
    * Specify the timeout for this block
    */
  var timeout: js.UndefOr[Double | js.Function0[Unit]] = js.undefined
}

object DescribeOptions {
  @scala.inline
  def apply(skip: Boolean | js.Function0[Unit] = null, timeout: Double | js.Function0[Unit] = null): DescribeOptions = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOptions]
  }
}

