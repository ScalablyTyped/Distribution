package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footnotes extends StObject {
  
  def Add(Range: Range): Footnote = js.native
  def Add(Range: Range, Reference: js.Any): Footnote = js.native
  def Add(Range: Range, Reference: js.Any, Text: js.Any): Footnote = js.native
  def Add(Range: Range, Reference: Unit, Text: js.Any): Footnote = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val ContinuationNotice: Range = js.native
  
  val ContinuationSeparator: Range = js.native
  
  def Convert(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Footnote = js.native
  
  var Location: WdFootnoteLocation = js.native
  
  var NumberStyle: WdNoteNumberStyle = js.native
  
  var NumberingRule: WdNumberingRule = js.native
  
  val Parent: js.Any = js.native
  
  def ResetContinuationNotice(): Unit = js.native
  
  def ResetContinuationSeparator(): Unit = js.native
  
  def ResetSeparator(): Unit = js.native
  
  val Separator: Range = js.native
  
  var StartingNumber: Double = js.native
  
  def SwapWithEndnotes(): Unit = js.native
  
  @JSName("Word.Footnotes_typekey")
  var WordDotFootnotes_typekey: Footnotes = js.native
}
