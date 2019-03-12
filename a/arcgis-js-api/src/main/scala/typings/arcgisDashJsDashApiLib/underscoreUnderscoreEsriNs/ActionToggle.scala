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
    clone: () => ActionToggle,
    disabled: scala.Boolean,
    id: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    visible: scala.Boolean
  ): ActionToggle = {
    val __obj = js.Dynamic.literal(active = active, className = className, clone = js.Any.fromFunction0(clone), disabled = disabled, id = id, title = title, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionToggle]
  }
}

