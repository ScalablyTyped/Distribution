package typings.antd.esTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLocale extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: String
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object TransferLocale {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: String,
    searchPlaceholder: String,
    titles: js.Array[String]
  ): TransferLocale = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit, itemsUnit = itemsUnit, notFoundContent = notFoundContent, searchPlaceholder = searchPlaceholder, titles = titles)
  
    __obj.asInstanceOf[TransferLocale]
  }
}

