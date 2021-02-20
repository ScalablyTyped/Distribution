package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  def Add(Range: Range): Field = js.native
  def Add(
    Range: Range,
    Type: js.UndefOr[scala.Nothing],
    Text: js.UndefOr[scala.Nothing],
    PreserveFormatting: js.Any
  ): Field = js.native
  def Add(Range: Range, Type: js.UndefOr[scala.Nothing], Text: js.Any): Field = js.native
  def Add(Range: Range, Type: js.UndefOr[scala.Nothing], Text: js.Any, PreserveFormatting: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.UndefOr[scala.Nothing], PreserveFormatting: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any, PreserveFormatting: js.Any): Field = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Field = js.native
  
  var Locked: Double = js.native
  
  val Parent: js.Any = js.native
  
  def ToggleShowCodes(): Unit = js.native
  
  def Unlink(): Unit = js.native
  
  def Update(): Double = js.native
  
  def UpdateSource(): Unit = js.native
  
  @JSName("Word.Fields_typekey")
  var WordDotFields_typekey: Fields = js.native
}
