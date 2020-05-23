package typings.activexWord.Word

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeNode extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val EditingType: MsoEditingType
  val Parent: js.Any
  val Points: js.Any
  val SegmentType: MsoSegmentType
  @JSName("Word.ShapeNode_typekey")
  var WordDotShapeNode_typekey: ShapeNode
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EditingType: MsoEditingType,
    Parent: js.Any,
    Points: js.Any,
    SegmentType: MsoSegmentType,
    WordDotShapeNode_typekey: ShapeNode
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShapeNode_typekey")(WordDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
}

