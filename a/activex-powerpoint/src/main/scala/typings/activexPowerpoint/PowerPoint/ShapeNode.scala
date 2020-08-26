package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeNode extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val EditingType: MsoEditingType = js.native
  val Parent: js.Any = js.native
  val Points: js.Any = js.native
  @JSName("PowerPoint.ShapeNode_typekey")
  var PowerPointDotShapeNode_typekey: ShapeNode = js.native
  val SegmentType: MsoSegmentType = js.native
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    Parent: js.Any,
    Points: js.Any,
    PowerPointDotShapeNode_typekey: ShapeNode,
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ShapeNode_typekey")(PowerPointDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  @scala.inline
  implicit class ShapeNodeOps[Self <: ShapeNode] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditingType(value: MsoEditingType): Self = this.set("EditingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoints(value: js.Any): Self = this.set("Points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotShapeNode_typekey(value: ShapeNode): Self = this.set("PowerPoint.ShapeNode_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentType(value: MsoSegmentType): Self = this.set("SegmentType", value.asInstanceOf[js.Any])
  }
  
}

