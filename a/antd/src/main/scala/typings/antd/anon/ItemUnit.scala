package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemUnit extends js.Object {
  var itemUnit: String = js.native
  var itemsUnit: String = js.native
  var notFoundContent: String = js.native
  var searchPlaceholder: String = js.native
  var titles: js.Array[String] = js.native
}

object ItemUnit {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: String,
    searchPlaceholder: String,
    titles: js.Array[String]
  ): ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemUnit]
  }
  @scala.inline
  implicit class ItemUnitOps[Self <: ItemUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsUnit(value: String): Self = this.set("itemsUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFoundContent(value: String): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitlesVarargs(value: String*): Self = this.set("titles", js.Array(value :_*))
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
  }
  
}

