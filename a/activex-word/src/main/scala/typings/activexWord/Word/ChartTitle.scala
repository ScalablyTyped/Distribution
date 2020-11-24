package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTitle extends js.Object {
  
  val Application: js.Any = js.native
  
  var AutoScaleFont: js.Any = js.native
  
  val Border: ChartBorder = js.native
  
  var Caption: String = js.native
  
  def Characters(): ChartCharacters = js.native
  def Characters(Start: js.UndefOr[scala.Nothing], Length: js.Any): ChartCharacters = js.native
  def Characters(Start: js.Any): ChartCharacters = js.native
  def Characters(Start: js.Any, Length: js.Any): ChartCharacters = js.native
  
  val Creator: Double = js.native
  
  def Delete(): js.Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: ChartFont = js.native
  
  val Format: ChartFormat = js.native
  
  var Formula: String = js.native
  
  var FormulaLocal: String = js.native
  
  var FormulaR1C1: String = js.native
  
  var FormulaR1C1Local: String = js.native
  
  val Height: Double = js.native
  
  var HorizontalAlignment: js.Any = js.native
  
  var IncludeInLayout: Boolean = js.native
  
  val Interior: typings.activexWord.Word.Interior = js.native
  
  var Left: Double = js.native
  
  val Name: String = js.native
  
  var Orientation: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  var Position: XlChartElementPosition = js.native
  
  var ReadingOrder: Double = js.native
  
  def Select(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Text: String = js.native
  
  var Top: Double = js.native
  
  var VerticalAlignment: js.Any = js.native
  
  val Width: Double = js.native
  
  @JSName("Word.ChartTitle_typekey")
  var WordDotChartTitle_typekey: ChartTitle = js.native
}
