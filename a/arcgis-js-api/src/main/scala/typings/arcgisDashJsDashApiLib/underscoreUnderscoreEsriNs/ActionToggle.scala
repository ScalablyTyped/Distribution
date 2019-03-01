package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionToggle extends ActionBase

object ActionToggle {
  @scala.inline
  def apply(
    active: scala.Boolean,
    className: java.lang.String,
    clone: js.Function0[ActionToggle],
    disabled: scala.Boolean,
    id: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    visible: scala.Boolean
  ): ActionToggle = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ActionToggle]
  }
}

