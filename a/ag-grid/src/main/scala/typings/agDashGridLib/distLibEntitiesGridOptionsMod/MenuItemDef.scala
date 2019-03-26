package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemDef extends js.Object {
  var action: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var cssClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var name: java.lang.String
  var shortcut: js.UndefOr[java.lang.String] = js.undefined
  var subMenu: js.UndefOr[js.Array[MenuItemDef | java.lang.String]] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItemDef {
  @scala.inline
  def apply(
    name: java.lang.String,
    action: () => scala.Unit = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    cssClasses: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: stdLib.HTMLElement | java.lang.String = null,
    shortcut: java.lang.String = null,
    subMenu: js.Array[MenuItemDef | java.lang.String] = null,
    tooltip: java.lang.String = null
  ): MenuItemDef = {
    val __obj = js.Dynamic.literal(name = name)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction0(action))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MenuItemDef]
  }
}

