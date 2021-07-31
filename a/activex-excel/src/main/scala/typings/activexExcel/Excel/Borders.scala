package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borders extends StObject {
  
  def apply(Index: XlBordersIndex): Border = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Color: XlRgbColor | Double = js.native
  
  var ColorIndex: Double | XlColorIndex | Null = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: XlBordersIndex): Border = js.native
  
  var LineStyle: typings.activexExcel.Excel.LineStyle = js.native
  
  val Parent: js.Any = js.native
  
  var ThemeColor: XlThemeColor = js.native
  
  var TintAndShade: Double = js.native
  
  var Value: LineStyle = js.native
  
  var Weight: XlBorderWeight = js.native
  
  def _Default(Index: XlBordersIndex): Border = js.native
}
