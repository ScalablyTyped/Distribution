package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLocale extends js.Object {
  var emptyText: js.UndefOr[reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode]] = js.undefined
  var filterConfirm: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var filterReset: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var filterTitle: js.UndefOr[java.lang.String] = js.undefined
  var selectAll: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var selectInvert: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var sortTitle: js.UndefOr[java.lang.String] = js.undefined
}

object TableLocale {
  @scala.inline
  def apply(
    emptyText: reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode] = null,
    filterConfirm: reactLib.reactMod.ReactNode = null,
    filterReset: reactLib.reactMod.ReactNode = null,
    filterTitle: java.lang.String = null,
    selectAll: reactLib.reactMod.ReactNode = null,
    selectInvert: reactLib.reactMod.ReactNode = null,
    sortTitle: java.lang.String = null
  ): TableLocale = {
    val __obj = js.Dynamic.literal()
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (filterConfirm != null) __obj.updateDynamic("filterConfirm")(filterConfirm.asInstanceOf[js.Any])
    if (filterReset != null) __obj.updateDynamic("filterReset")(filterReset.asInstanceOf[js.Any])
    if (filterTitle != null) __obj.updateDynamic("filterTitle")(filterTitle)
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll.asInstanceOf[js.Any])
    if (selectInvert != null) __obj.updateDynamic("selectInvert")(selectInvert.asInstanceOf[js.Any])
    if (sortTitle != null) __obj.updateDynamic("sortTitle")(sortTitle)
    __obj.asInstanceOf[TableLocale]
  }
}

