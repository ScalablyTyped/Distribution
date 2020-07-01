package typings.antd.transferMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLocale extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var remove: String
  var removeAll: String
  var removeCurrent: String
  var searchPlaceholder: String
  var selectAll: String
  var selectCurrent: String
  var selectInvert: String
  var titles: js.Array[String]
}

object TransferLocale {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    remove: String,
    removeAll: String,
    removeCurrent: String,
    searchPlaceholder: String,
    selectAll: String,
    selectCurrent: String,
    selectInvert: String,
    titles: js.Array[String],
    notFoundContent: ReactNode = null
  ): TransferLocale = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferLocale]
  }
}

