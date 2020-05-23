package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Templates_typekey")
  var WordDotTemplates_typekey: Templates
  def Item(Index: js.Any): Template
  def LoadBuildingBlocks(): Unit
}

object Templates {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Template,
    LoadBuildingBlocks: () => Unit,
    Parent: js.Any,
    WordDotTemplates_typekey: Templates
  ): Templates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), LoadBuildingBlocks = js.Any.fromFunction0(LoadBuildingBlocks), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Templates_typekey")(WordDotTemplates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates]
  }
}

