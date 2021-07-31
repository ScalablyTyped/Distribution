package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends StObject {
  
  var Alignment: WdRowAlignment = js.native
  
  var AllowBreakAcrossPages: Double = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Cells: typings.activexWord.Word.Cells = js.native
  
  def ConvertToText(): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: Unit, NestedTables: js.Any): typings.activexWord.Word.Range = js.native
  
  def ConvertToTextOld(): typings.activexWord.Word.Range = js.native
  def ConvertToTextOld(Separator: js.Any): typings.activexWord.Word.Range = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var HeadingFormat: Double = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdRowHeightRule = js.native
  
  var ID: String = js.native
  
  val Index: Double = js.native
  
  val IsFirst: Boolean = js.native
  
  val IsLast: Boolean = js.native
  
  var LeftIndent: Double = js.native
  
  val NestingLevel: Double = js.native
  
  val Next: Row = js.native
  
  val Parent: js.Any = js.native
  
  val Previous: Row = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Select(): Unit = js.native
  
  def SetHeight(RowHeight: Double, HeightRule: WdRowHeightRule): Unit = js.native
  
  def SetLeftIndent(LeftIndent: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var SpaceBetweenColumns: Double = js.native
  
  @JSName("Word.Row_typekey")
  var WordDotRow_typekey: Row = js.native
}
