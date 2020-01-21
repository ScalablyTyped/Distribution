package typings.antd.tableInterfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLocale extends js.Object {
  var collapse: js.UndefOr[String] = js.undefined
  var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var filterConfirm: js.UndefOr[ReactNode] = js.undefined
  var filterReset: js.UndefOr[ReactNode] = js.undefined
  var filterTitle: js.UndefOr[String] = js.undefined
  var selectAll: js.UndefOr[ReactNode] = js.undefined
  var selectInvert: js.UndefOr[ReactNode] = js.undefined
  var sortTitle: js.UndefOr[String] = js.undefined
}

object TableLocale {
  @scala.inline
  def apply(
    collapse: String = null,
    emptyText: ReactNode | js.Function0[ReactNode] = null,
    expand: String = null,
    filterConfirm: ReactNode = null,
    filterReset: ReactNode = null,
    filterTitle: String = null,
    selectAll: ReactNode = null,
    selectInvert: ReactNode = null,
    sortTitle: String = null
  ): TableLocale = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filterConfirm != null) __obj.updateDynamic("filterConfirm")(filterConfirm.asInstanceOf[js.Any])
    if (filterReset != null) __obj.updateDynamic("filterReset")(filterReset.asInstanceOf[js.Any])
    if (filterTitle != null) __obj.updateDynamic("filterTitle")(filterTitle.asInstanceOf[js.Any])
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll.asInstanceOf[js.Any])
    if (selectInvert != null) __obj.updateDynamic("selectInvert")(selectInvert.asInstanceOf[js.Any])
    if (sortTitle != null) __obj.updateDynamic("sortTitle")(sortTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLocale]
  }
}

