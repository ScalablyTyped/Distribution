package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeNode extends js.Object {
  val Application: js.Any
  val Creator: Double
  val EditingType: MsoEditingType
  @JSName("Office.ShapeNode_typekey")
  var OfficeDotShapeNode_typekey: ShapeNode
  val Parent: js.Any
  val Points: js.Any
  val SegmentType: MsoSegmentType
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    OfficeDotShapeNode_typekey: ShapeNode,
    Parent: js.Any,
    Points: js.Any,
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ShapeNode_typekey")(OfficeDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
}

