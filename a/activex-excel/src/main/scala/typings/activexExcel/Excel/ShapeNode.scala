package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeNode extends js.Object {
  val Application: js.Any
  val Creator: Double
  val EditingType: MsoEditingType
  @JSName("Excel.ShapeNode_typekey")
  var ExcelDotShapeNode_typekey: ShapeNode
  val Parent: js.Any
  val Points: SafeArray[Double]
  val SegmentType: MsoSegmentType
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    ExcelDotShapeNode_typekey: ShapeNode,
    Parent: js.Any,
    Points: SafeArray[Double],
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ShapeNode_typekey")(ExcelDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
}

