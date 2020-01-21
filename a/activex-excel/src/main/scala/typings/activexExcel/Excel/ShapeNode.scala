package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ShapeNode")
@js.native
class ShapeNode protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val EditingType: MsoEditingType = js.native
  @JSName("Excel.ShapeNode_typekey")
  var ExcelDotShapeNode_typekey: ShapeNode = js.native
  val Parent: js.Any = js.native
  val Points: SafeArray[Double] = js.native
  val SegmentType: MsoSegmentType = js.native
}

