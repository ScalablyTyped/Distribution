package typings.activexWord.global.Word

import typings.activexWord.Word.WdRevisionType
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Revision")
@js.native
class Revision protected ()
  extends typings.activexWord.Word.Revision {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Author: String = js.native
  /* CompleteClass */
  override val Cells: typings.activexWord.Word.Cells = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Date: VarDate = js.native
  /* CompleteClass */
  override val FormatDescription: String = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val MovedRange: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Style: typings.activexWord.Word.Style = js.native
  /* CompleteClass */
  override val Type: WdRevisionType = js.native
  /* CompleteClass */
  @JSName("Word.Revision_typekey")
  override var WordDotRevision_typekey: typings.activexWord.Word.Revision = js.native
  /* CompleteClass */
  override def Accept(): Unit = js.native
  /* CompleteClass */
  override def Reject(): Unit = js.native
}

