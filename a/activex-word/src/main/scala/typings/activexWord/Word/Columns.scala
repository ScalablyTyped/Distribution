package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  def Add(): Column = js.native
  def Add(BeforeColumn: Any): Column = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoFit(): Unit = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def DistributeWidth(): Unit = js.native
  
  val First: Column = js.native
  
  def Item(Index: Double): Column = js.native
  
  val Last: Column = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  def Select(): Unit = js.native
  
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var Width: Double = js.native
  
  /* private */ @JSName("Word.Columns_typekey")
  var WordDotColumns_typekey: Columns = js.native
}
