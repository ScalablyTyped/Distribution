package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLocale extends js.Object {
  var itemUnit: java.lang.String
  var itemsUnit: java.lang.String
  var notFoundContent: java.lang.String
  var searchPlaceholder: java.lang.String
  var titles: js.Array[java.lang.String]
}

object TransferLocale {
  @scala.inline
  def apply(
    itemUnit: java.lang.String,
    itemsUnit: java.lang.String,
    notFoundContent: java.lang.String,
    searchPlaceholder: java.lang.String,
    titles: js.Array[java.lang.String]
  ): TransferLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemUnit")(itemUnit)
    __obj.updateDynamic("itemsUnit")(itemsUnit)
    __obj.updateDynamic("notFoundContent")(notFoundContent)
    __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    __obj.updateDynamic("titles")(titles)
    __obj.asInstanceOf[TransferLocale]
  }
}

