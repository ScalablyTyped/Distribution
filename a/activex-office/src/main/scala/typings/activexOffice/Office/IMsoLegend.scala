package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoLegend extends StObject {
  
  val Application: Any = js.native
  
  var AutoScaleFont: Any = js.native
  
  val Border: IMsoBorder = js.native
  
  def Clear(): Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: ChartFont = js.native
  
  val Format: IMsoChartFormat = js.native
  
  var Height: Double = js.native
  
  var IncludeInLayout: Boolean = js.native
  
  val Interior: IMsoInterior = js.native
  
  var Left: Double = js.native
  
  def LegendEntries(): Any = js.native
  def LegendEntries(Index: Any): Any = js.native
  
  val Name: String = js.native
  
  /* private */ @JSName("Office.IMsoLegend_typekey")
  var OfficeDotIMsoLegend_typekey: IMsoLegend = js.native
  
  val Parent: Any = js.native
  
  var Position: XlLegendPosition = js.native
  
  def Select(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
