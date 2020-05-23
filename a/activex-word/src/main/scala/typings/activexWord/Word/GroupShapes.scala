package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupShapes extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.GroupShapes_typekey")
  var WordDotGroupShapes_typekey: GroupShapes
  def Item(Index: js.Any): Shape
  def Range(Index: js.Any): ShapeRange
}

object GroupShapes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Shape,
    Parent: js.Any,
    Range: js.Any => ShapeRange,
    WordDotGroupShapes_typekey: GroupShapes
  ): GroupShapes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range))
    __obj.updateDynamic("Word.GroupShapes_typekey")(WordDotGroupShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupShapes]
  }
}

