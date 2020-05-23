package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesOfAuthoritiesCategories extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.TablesOfAuthoritiesCategories_typekey")
  var WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
  def Item(Index: js.Any): TableOfAuthoritiesCategory
}

object TablesOfAuthoritiesCategories {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => TableOfAuthoritiesCategory,
    Parent: js.Any,
    WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
  ): TablesOfAuthoritiesCategories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TablesOfAuthoritiesCategories_typekey")(WordDotTablesOfAuthoritiesCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesOfAuthoritiesCategories]
  }
}

