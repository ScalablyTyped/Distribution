package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeNode extends js.Object {
  val Application: js.Any
  val Creator: Double
  val EditingType: MsoEditingType
  val Parent: js.Any
  val Points: js.Any
  @JSName("PowerPoint.ShapeNode_typekey")
  var PowerPointDotShapeNode_typekey: ShapeNode
  val SegmentType: MsoSegmentType
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
}

