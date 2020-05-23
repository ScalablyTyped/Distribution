package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ShapeNode")
@js.native
class ShapeNode protected ()
  extends typings.activexExcel.Excel.ShapeNode {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val EditingType: MsoEditingType = js.native
  /* CompleteClass */
  @JSName("Excel.ShapeNode_typekey")
  override var ExcelDotShapeNode_typekey: typings.activexExcel.Excel.ShapeNode = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Points: SafeArray[Double] = js.native
  /* CompleteClass */
  override val SegmentType: MsoSegmentType = js.native
}

