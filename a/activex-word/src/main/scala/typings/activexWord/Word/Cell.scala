package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoSum(): Unit = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  var BottomPadding: Double = js.native
  
  val Column: typings.activexWord.Word.Column = js.native
  
  val ColumnIndex: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(ShiftCells: Any): Unit = js.native
  
  var FitText: Boolean = js.native
  
  def Formula(): Unit = js.native
  def Formula(Formula: Any): Unit = js.native
  def Formula(Formula: Any, NumFormat: Any): Unit = js.native
  def Formula(Formula: Unit, NumFormat: Any): Unit = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdRowHeightRule = js.native
  
  var ID: String = js.native
  
  var LeftPadding: Double = js.native
  
  def Merge(MergeTo: Cell): Unit = js.native
  
  val NestingLevel: Double = js.native
  
  val Next: Cell = js.native
  
  val Parent: Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  val Previous: Cell = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var RightPadding: Double = js.native
  
  val Row: typings.activexWord.Word.Row = js.native
  
  val RowIndex: Double = js.native
  
  def Select(): Unit = js.native
  
  def SetHeight(RowHeight: Any, HeightRule: WdRowHeightRule): Unit = js.native
  
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Split(): Unit = js.native
  def Split(NumRows: Any): Unit = js.native
  def Split(NumRows: Any, NumColumns: Any): Unit = js.native
  def Split(NumRows: Unit, NumColumns: Any): Unit = js.native
  
  val Tables: typings.activexWord.Word.Tables = js.native
  
  var TopPadding: Double = js.native
  
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  
  var Width: Double = js.native
  
  /* private */ @JSName("Word.Cell_typekey")
  var WordDotCell_typekey: Cell = js.native
  
  var WordWrap: Boolean = js.native
}
