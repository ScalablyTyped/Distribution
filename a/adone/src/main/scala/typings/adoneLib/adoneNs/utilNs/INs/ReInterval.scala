package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReInterval extends js.Object {
  def clear(): scala.Unit
  def destroy(): scala.Unit
  def reschedule(interval: scala.Double): scala.Unit
}

object ReInterval {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    reschedule: js.Function1[scala.Double, scala.Unit]
  ): ReInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("reschedule")(reschedule)
    __obj.asInstanceOf[ReInterval]
  }
}

