package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupShapes extends js.Object {
  val Application: js.Any
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("PowerPoint.GroupShapes_typekey")
  var PowerPointDotGroupShapes_typekey: GroupShapes
  def Item(Index: js.Any): Shape
  def Range(Index: js.Any): ShapeRange
}

object GroupShapes {
  @scala.inline
  def apply(
    Application: js.Any,
    Count: Double,
    Creator: Double,
    Item: js.Any => Shape,
    Parent: js.Any,
    PowerPointDotGroupShapes_typekey: GroupShapes,
    Range: js.Any => ShapeRange
  ): GroupShapes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range))
    __obj.updateDynamic("PowerPoint.GroupShapes_typekey")(PowerPointDotGroupShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupShapes]
  }
}

