package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoChartTitle extends StObject {
  
  val Application: Any = js.native
  
  var AutoScaleFont: Any = js.native
  
  val Border: IMsoBorder = js.native
  
  var Caption: String = js.native
  
  def Characters(): IMsoCharacters = js.native
  def Characters(Start: Any): IMsoCharacters = js.native
  def Characters(Start: Any, Length: Any): IMsoCharacters = js.native
  def Characters(Start: Unit, Length: Any): IMsoCharacters = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: ChartFont = js.native
  
  val Format: IMsoChartFormat = js.native
  
  var Formula: String = js.native
  
  var FormulaLocal: String = js.native
  
  var FormulaR1C1: String = js.native
  
  var FormulaR1C1Local: String = js.native
  
  val Height: Double = js.native
  
  var HorizontalAlignment: Any = js.native
  
  var IncludeInLayout: Boolean = js.native
  
  val Interior: IMsoInterior = js.native
  
  var Left: Double = js.native
  
  val Name: String = js.native
  
  /* private */ @JSName("Office.IMsoChartTitle_typekey")
  var OfficeDotIMsoChartTitle_typekey: IMsoChartTitle = js.native
  
  var Orientation: Any = js.native
  
  val Parent: Any = js.native
  
  var Position: XlChartElementPosition = js.native
  
  var ReadingOrder: Double = js.native
  
  def Select(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Text: String = js.native
  
  var Top: Double = js.native
  
  var VerticalAlignment: Any = js.native
  
  val Width: Double = js.native
}
