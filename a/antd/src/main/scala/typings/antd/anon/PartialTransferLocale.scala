package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
trait PartialTransferLocale extends js.Object {
  var itemUnit: js.UndefOr[String] = js.undefined
  var itemsUnit: js.UndefOr[String] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var remove: js.UndefOr[String] = js.undefined
  var removeAll: js.UndefOr[String] = js.undefined
  var removeCurrent: js.UndefOr[String] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var selectAll: js.UndefOr[String] = js.undefined
  var selectCurrent: js.UndefOr[String] = js.undefined
  var selectInvert: js.UndefOr[String] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialTransferLocale {
  @scala.inline
  def apply(
    itemUnit: String = null,
    itemsUnit: String = null,
    notFoundContent: ReactNode = null,
    remove: String = null,
    removeAll: String = null,
    removeCurrent: String = null,
    searchPlaceholder: String = null,
    selectAll: String = null,
    selectCurrent: String = null,
    selectInvert: String = null,
    titles: js.Array[String] = null
  ): PartialTransferLocale = {
    val __obj = js.Dynamic.literal()
    if (itemUnit != null) __obj.updateDynamic("itemUnit")(itemUnit.asInstanceOf[js.Any])
    if (itemsUnit != null) __obj.updateDynamic("itemsUnit")(itemsUnit.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll.asInstanceOf[js.Any])
    if (removeCurrent != null) __obj.updateDynamic("removeCurrent")(removeCurrent.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll.asInstanceOf[js.Any])
    if (selectCurrent != null) __obj.updateDynamic("selectCurrent")(selectCurrent.asInstanceOf[js.Any])
    if (selectInvert != null) __obj.updateDynamic("selectInvert")(selectInvert.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTransferLocale]
  }
}

