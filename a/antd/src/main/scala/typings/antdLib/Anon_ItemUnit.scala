package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemUnit extends js.Object {
  var itemUnit: java.lang.String
  var itemsUnit: java.lang.String
  var notFoundContent: js.Any
  var searchPlaceholder: java.lang.String
  var titles: js.Array[java.lang.String]
}

object Anon_ItemUnit {
  @scala.inline
  def apply(
    itemUnit: java.lang.String,
    itemsUnit: java.lang.String,
    notFoundContent: js.Any,
    searchPlaceholder: java.lang.String,
    titles: js.Array[java.lang.String]
  ): Anon_ItemUnit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemUnit")(itemUnit)
    __obj.updateDynamic("itemsUnit")(itemsUnit)
    __obj.updateDynamic("notFoundContent")(notFoundContent)
    __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    __obj.updateDynamic("titles")(titles)
    __obj.asInstanceOf[Anon_ItemUnit]
  }
}

