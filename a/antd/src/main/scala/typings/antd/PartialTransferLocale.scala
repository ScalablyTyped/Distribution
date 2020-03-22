package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
trait PartialTransferLocale extends js.Object {
  var itemUnit: js.UndefOr[String] = js.undefined
  var itemsUnit: js.UndefOr[String] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialTransferLocale {
  @scala.inline
  def apply(
    itemUnit: String = null,
    itemsUnit: String = null,
    notFoundContent: ReactNode = null,
    searchPlaceholder: String = null,
    titles: js.Array[String] = null
  ): PartialTransferLocale = {
    val __obj = js.Dynamic.literal()
    if (itemUnit != null) __obj.updateDynamic("itemUnit")(itemUnit.asInstanceOf[js.Any])
    if (itemsUnit != null) __obj.updateDynamic("itemsUnit")(itemsUnit.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTransferLocale]
  }
}

