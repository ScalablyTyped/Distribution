package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  def Add(Range: Range): Field = js.native
  def Add(Range: Range, Type: Any): Field = js.native
  def Add(Range: Range, Type: Any, Text: Any): Field = js.native
  def Add(Range: Range, Type: Any, Text: Any, PreserveFormatting: Any): Field = js.native
  def Add(Range: Range, Type: Any, Text: Unit, PreserveFormatting: Any): Field = js.native
  def Add(Range: Range, Type: Unit, Text: Any): Field = js.native
  def Add(Range: Range, Type: Unit, Text: Any, PreserveFormatting: Any): Field = js.native
  def Add(Range: Range, Type: Unit, Text: Unit, PreserveFormatting: Any): Field = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Field = js.native
  
  var Locked: Double = js.native
  
  val Parent: Any = js.native
  
  def ToggleShowCodes(): Unit = js.native
  
  def Unlink(): Unit = js.native
  
  def Update(): Double = js.native
  
  def UpdateSource(): Unit = js.native
  
  /* private */ @JSName("Word.Fields_typekey")
  var WordDotFields_typekey: Fields = js.native
}
