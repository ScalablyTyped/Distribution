package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cells extends StObject {
  
  def Add(): Cell = js.native
  def Add(BeforeCell: Any): Cell = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoFit(): Unit = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(ShiftCells: Any): Unit = js.native
  
  def DistributeHeight(): Unit = js.native
  
  def DistributeWidth(): Unit = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdRowHeightRule = js.native
  
  def Item(Index: Double): Cell = js.native
  
  def Merge(): Unit = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  def SetHeight(RowHeight: Any, HeightRule: WdRowHeightRule): Unit = js.native
  
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Split(): Unit = js.native
  def Split(NumRows: Any): Unit = js.native
  def Split(NumRows: Any, NumColumns: Any): Unit = js.native
  def Split(NumRows: Any, NumColumns: Any, MergeBeforeSplit: Any): Unit = js.native
  def Split(NumRows: Any, NumColumns: Unit, MergeBeforeSplit: Any): Unit = js.native
  def Split(NumRows: Unit, NumColumns: Any): Unit = js.native
  def Split(NumRows: Unit, NumColumns: Any, MergeBeforeSplit: Any): Unit = js.native
  def Split(NumRows: Unit, NumColumns: Unit, MergeBeforeSplit: Any): Unit = js.native
  
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  
  var Width: Double = js.native
  
  /* private */ @JSName("Word.Cells_typekey")
  var WordDotCells_typekey: Cells = js.native
}
