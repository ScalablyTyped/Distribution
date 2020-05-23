package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfAuthoritiesCategory extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  var Name: String
  val Parent: js.Any
  @JSName("Word.TableOfAuthoritiesCategory_typekey")
  var WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory
}

object TableOfAuthoritiesCategory {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory
  ): TableOfAuthoritiesCategory = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfAuthoritiesCategory_typekey")(WordDotTableOfAuthoritiesCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthoritiesCategory]
  }
}

