package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemUnit extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: js.Any
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object Anon_ItemUnit {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: js.Any,
    searchPlaceholder: String,
    titles: js.Array[String]
  ): Anon_ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit, itemsUnit = itemsUnit, notFoundContent = notFoundContent, searchPlaceholder = searchPlaceholder, titles = titles)
  
    __obj.asInstanceOf[Anon_ItemUnit]
  }
}

