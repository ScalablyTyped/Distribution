package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupShapes extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.GroupShapes_typekey")
  var PowerPointDotGroupShapes_typekey: GroupShapes = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
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
  @scala.inline
  implicit class GroupShapesOps[Self <: GroupShapes] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Shape): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotGroupShapes_typekey(value: GroupShapes): Self = this.set("PowerPoint.GroupShapes_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: js.Any => ShapeRange): Self = this.set("Range", js.Any.fromFunction1(value))
  }
  
}

