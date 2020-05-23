package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  val Application: typings.activexWord.Word.Application
  val BuildingBlocks: typings.activexWord.Word.BuildingBlocks
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Type: BuildingBlockType
  @JSName("Word.Category_typekey")
  var WordDotCategory_typekey: Category
}

object Category {
  @scala.inline
  def apply(
    Application: Application,
    BuildingBlocks: BuildingBlocks,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Type: BuildingBlockType,
    WordDotCategory_typekey: Category
  ): Category = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuildingBlocks = BuildingBlocks.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Category_typekey")(WordDotCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

