package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  /**
    * Will retry after this delay
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Will retry if fails with EPERM or EACCESS errors
    */
  var retries: js.UndefOr[Double] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Int | Double = null, retries: Int | Double = null): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

