package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Endnotes")
@js.native
class Endnotes protected () extends js.Object {
  val Application: Application = js.native
  val ContinuationNotice: Range = js.native
  val ContinuationSeparator: Range = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Location: WdEndnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  val Separator: Range = js.native
  var StartingNumber: scala.Double = js.native
  var `Word.Endnotes_typekey`: Endnotes = js.native
  def Add(Range: Range): Endnote = js.native
  def Add(Range: Range, Reference: js.Any): Endnote = js.native
  def Add(Range: Range, Reference: js.Any, Text: js.Any): Endnote = js.native
  def Convert(): scala.Unit = js.native
  def Item(Index: scala.Double): Endnote = js.native
  def ResetContinuationNotice(): scala.Unit = js.native
  def ResetContinuationSeparator(): scala.Unit = js.native
  def ResetSeparator(): scala.Unit = js.native
  def SwapWithFootnotes(): scala.Unit = js.native
}

