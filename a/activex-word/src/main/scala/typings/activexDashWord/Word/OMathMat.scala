package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.OMathMat")
@js.native
class OMathMat protected () extends js.Object {
  var Align: WdOMathVertAlignType = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  var ColGap: Double = js.native
  var ColGapRule: WdOMathSpacingRule = js.native
  var ColSpacing: Double = js.native
  val Cols: OMathMatCols = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var PlcHoldHidden: Boolean = js.native
  var RowSpacing: Double = js.native
  var RowSpacingRule: WdOMathSpacingRule = js.native
  val Rows: OMathMatRows = js.native
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat = js.native
  def Cell(Row: Double, Col: Double): OMath = js.native
}

