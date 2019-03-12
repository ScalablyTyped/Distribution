package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Footnotes")
@js.native
class Footnotes protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val ContinuationNotice: Range = js.native
  val ContinuationSeparator: Range = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Location: WdFootnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  val Separator: Range = js.native
  var StartingNumber: scala.Double = js.native
  var `Word.Footnotes_typekey`: Footnotes = js.native
  def Add(Range: Range): Footnote = js.native
  def Add(Range: Range, Reference: js.Any): Footnote = js.native
  def Add(Range: Range, Reference: js.Any, Text: js.Any): Footnote = js.native
  def Convert(): scala.Unit = js.native
  def Item(Index: scala.Double): Footnote = js.native
  def ResetContinuationNotice(): scala.Unit = js.native
  def ResetContinuationSeparator(): scala.Unit = js.native
  def ResetSeparator(): scala.Unit = js.native
  def SwapWithEndnotes(): scala.Unit = js.native
}

