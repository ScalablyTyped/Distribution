package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var AutoScaleFont: Any = js.native
  
  val Border: ChartBorder = js.native
  
  def Clear(): Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: ChartFont = js.native
  
  val Format: ChartFormat = js.native
  
  var Height: Double = js.native
  
  var IncludeInLayout: Boolean = js.native
  
  val Interior: typings.activexPowerpoint.PowerPoint.Interior = js.native
  
  var Left: Double = js.native
  
  def LegendEntries(): Any = js.native
  def LegendEntries(Index: Any): Any = js.native
  
  val Name: String = js.native
  
  val Parent: Any = js.native
  
  var Position: XlLegendPosition = js.native
  
  /* private */ @JSName("PowerPoint.Legend_typekey")
  var PowerPointDotLegend_typekey: Legend = js.native
  
  def Select(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
