package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endnotes extends StObject {
  
  def Add(Range: Range): Endnote = js.native
  def Add(Range: Range, Reference: Any): Endnote = js.native
  def Add(Range: Range, Reference: Any, Text: Any): Endnote = js.native
  def Add(Range: Range, Reference: Unit, Text: Any): Endnote = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val ContinuationNotice: Range = js.native
  
  val ContinuationSeparator: Range = js.native
  
  def Convert(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Endnote = js.native
  
  var Location: WdEndnoteLocation = js.native
  
  var NumberStyle: WdNoteNumberStyle = js.native
  
  var NumberingRule: WdNumberingRule = js.native
  
  val Parent: Any = js.native
  
  def ResetContinuationNotice(): Unit = js.native
  
  def ResetContinuationSeparator(): Unit = js.native
  
  def ResetSeparator(): Unit = js.native
  
  val Separator: Range = js.native
  
  var StartingNumber: Double = js.native
  
  def SwapWithFootnotes(): Unit = js.native
  
  /* private */ @JSName("Word.Endnotes_typekey")
  var WordDotEndnotes_typekey: Endnotes = js.native
}
