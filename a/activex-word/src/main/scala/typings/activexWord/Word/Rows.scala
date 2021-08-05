package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rows extends StObject {
  
  def Add(): Row = js.native
  def Add(BeforeRow: js.Any): Row = js.native
  
  var Alignment: WdRowAlignment = js.native
  
  var AllowBreakAcrossPages: Double = js.native
  
  var AllowOverlap: Double = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  def ConvertToText(): Range = js.native
  def ConvertToText(Separator: js.Any): Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): Range = js.native
  def ConvertToText(Separator: Unit, NestedTables: js.Any): Range = js.native
  
  def ConvertToTextOld(): Range = js.native
  def ConvertToTextOld(Separator: js.Any): Range = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var DistanceBottom: Double = js.native
  
  var DistanceLeft: Double = js.native
  
  var DistanceRight: Double = js.native
  
  var DistanceTop: Double = js.native
  
  def DistributeHeight(): Unit = js.native
  
  val First: Row = js.native
  
  var HeadingFormat: Double = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdRowHeightRule = js.native
  
  var HorizontalPosition: Double = js.native
  
  def Item(Index: Double): Row = js.native
  
  val Last: Row = js.native
  
  var LeftIndent: Double = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  
  def Select(): Unit = js.native
  
  def SetHeight(RowHeight: Double, HeightRule: WdRowHeightRule): Unit = js.native
  
  def SetLeftIndent(LeftIndent: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var SpaceBetweenColumns: Double = js.native
  
  var TableDirection: WdTableDirection = js.native
  
  var VerticalPosition: Double = js.native
  
  /* private */ @JSName("Word.Rows_typekey")
  var WordDotRows_typekey: Rows = js.native
  
  var WrapAroundText: Double = js.native
}
