package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingBlockType extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Categories: typings.activexWord.Word.Categories
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.BuildingBlockType_typekey")
  var WordDotBuildingBlockType_typekey: BuildingBlockType
}

object BuildingBlockType {
  @scala.inline
  def apply(
    Application: Application,
    Categories: Categories,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotBuildingBlockType_typekey: BuildingBlockType
  ): BuildingBlockType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.BuildingBlockType_typekey")(WordDotBuildingBlockType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingBlockType]
  }
}

