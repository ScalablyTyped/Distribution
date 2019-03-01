package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  /**
    * Will retry after this delay
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Will retry if fails with EPERM or EACCESS errors
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(delay: scala.Int | scala.Double = null, retries: scala.Int | scala.Double = null): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

