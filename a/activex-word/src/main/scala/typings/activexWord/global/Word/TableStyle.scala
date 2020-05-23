package typings.activexWord.global.Word

import typings.activexWord.Word.WdConditionCode
import typings.activexWord.Word.WdRowAlignment
import typings.activexWord.Word.WdTableDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableStyle")
@js.native
class TableStyle protected ()
  extends typings.activexWord.Word.TableStyle {
  /* CompleteClass */
  override var Alignment: WdRowAlignment = js.native
  /* CompleteClass */
  override var AllowBreakAcrossPage: Double = js.native
  /* CompleteClass */
  override var AllowPageBreaks: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Borders: typings.activexWord.Word.Borders = js.native
  /* CompleteClass */
  override var BottomPadding: Double = js.native
  /* CompleteClass */
  override var ColumnStripe: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var LeftIndent: Double = js.native
  /* CompleteClass */
  override var LeftPadding: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RightPadding: Double = js.native
  /* CompleteClass */
  override var RowStripe: Double = js.native
  /* CompleteClass */
  override val Shading: typings.activexWord.Word.Shading = js.native
  /* CompleteClass */
  override var Spacing: Double = js.native
  /* CompleteClass */
  override var TableDirection: WdTableDirection = js.native
  /* CompleteClass */
  override var TopPadding: Double = js.native
  /* CompleteClass */
  @JSName("Word.TableStyle_typekey")
  override var WordDotTableStyle_typekey: typings.activexWord.Word.TableStyle = js.native
  /* CompleteClass */
  override def Condition(ConditionCode: WdConditionCode): typings.activexWord.Word.ConditionalStyle = js.native
}

