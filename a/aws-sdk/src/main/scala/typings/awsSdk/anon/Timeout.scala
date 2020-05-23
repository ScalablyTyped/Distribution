package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeout extends js.Object {
  /**
    * a timeout value in milliseconds to wait before aborting the connection. Set to 0 for no timeout.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object Timeout {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): Timeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

