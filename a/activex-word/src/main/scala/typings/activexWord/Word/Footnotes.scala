package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footnotes extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val ContinuationNotice: Range = js.native
  val ContinuationSeparator: Range = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Location: WdFootnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  val Separator: Range = js.native
  var StartingNumber: Double = js.native
  @JSName("Word.Footnotes_typekey")
  var WordDotFootnotes_typekey: Footnotes = js.native
  def Add(Range: Range): Footnote = js.native
  def Add(Range: Range, Reference: js.Any): Footnote = js.native
  def Add(Range: Range, Reference: js.Any, Text: js.Any): Footnote = js.native
  def Convert(): Unit = js.native
  def Item(Index: Double): Footnote = js.native
  def ResetContinuationNotice(): Unit = js.native
  def ResetContinuationSeparator(): Unit = js.native
  def ResetSeparator(): Unit = js.native
  def SwapWithEndnotes(): Unit = js.native
}

