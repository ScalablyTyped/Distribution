package typings.adone.adoneNs.fastNs.INs.pluginNs.chmodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  /**
    * Group properties
    */
  var group: js.UndefOr[Access] = js.undefined
  /**
    * Others properties
    */
  var others: js.UndefOr[Access] = js.undefined
  /**
    * Owner properties
    */
  var owner: js.UndefOr[Access] = js.undefined
}

object Mode {
  @scala.inline
  def apply(group: Access = null, others: Access = null, owner: Access = null): Mode = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (others != null) __obj.updateDynamic("others")(others)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[Mode]
  }
}

