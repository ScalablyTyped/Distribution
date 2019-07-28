package typings.agDashGrid.distLibEntitiesGridOptionsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemDef extends js.Object {
  var action: js.UndefOr[js.Function0[Unit]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var cssClasses: js.UndefOr[js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[HTMLElement | String] = js.undefined
  var name: String
  var shortcut: js.UndefOr[String] = js.undefined
  var subMenu: js.UndefOr[js.Array[MenuItemDef | String]] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object MenuItemDef {
  @scala.inline
  def apply(
    name: String,
    action: () => Unit = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    cssClasses: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: HTMLElement | String = null,
    shortcut: String = null,
    subMenu: js.Array[MenuItemDef | String] = null,
    tooltip: String = null
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

