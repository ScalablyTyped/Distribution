package typings.activexWord.global.Word

import typings.activexWord.Word.WdOMathSpacingRule
import typings.activexWord.Word.WdOMathVertAlignType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.OMathMat")
@js.native
class OMathMat protected ()
  extends typings.activexWord.Word.OMathMat {
  /* CompleteClass */
  override var Align: WdOMathVertAlignType = js.native
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var ColGap: Double = js.native
  /* CompleteClass */
  override var ColGapRule: WdOMathSpacingRule = js.native
  /* CompleteClass */
  override var ColSpacing: Double = js.native
  /* CompleteClass */
  override val Cols: typings.activexWord.Word.OMathMatCols = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PlcHoldHidden: Boolean = js.native
  /* CompleteClass */
  override var RowSpacing: Double = js.native
  /* CompleteClass */
  override var RowSpacingRule: WdOMathSpacingRule = js.native
  /* CompleteClass */
  override val Rows: typings.activexWord.Word.OMathMatRows = js.native
  /* CompleteClass */
  @JSName("Word.OMathMat_typekey")
  override var WordDotOMathMat_typekey: typings.activexWord.Word.OMathMat = js.native
  /* CompleteClass */
  override def Cell(Row: Double, Col: Double): typings.activexWord.Word.OMath = js.native
}

