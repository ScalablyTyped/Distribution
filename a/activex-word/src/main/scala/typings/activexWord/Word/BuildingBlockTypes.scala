package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingBlockTypes extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.BuildingBlockTypes_typekey")
  var WordDotBuildingBlockTypes_typekey: BuildingBlockTypes = js.native
  def Item(Index: WdBuildingBlockTypes): BuildingBlockType = js.native
}

object BuildingBlockTypes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdBuildingBlockTypes => BuildingBlockType,
    Parent: js.Any,
    WordDotBuildingBlockTypes_typekey: BuildingBlockTypes
  ): BuildingBlockTypes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.BuildingBlockTypes_typekey")(WordDotBuildingBlockTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingBlockTypes]
  }
  @scala.inline
  implicit class BuildingBlockTypesOps[Self <: BuildingBlockTypes] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: WdBuildingBlockTypes => BuildingBlockType): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotBuildingBlockTypes_typekey(value: BuildingBlockTypes): Self = this.set("Word.BuildingBlockTypes_typekey", value.asInstanceOf[js.Any])
  }
  
}

