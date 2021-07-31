package typings.activexExcel.anon

import typings.activexExcel.Excel.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChChart extends StObject {
  
  val Ch: Chart
}
object ChChart {
  
  @scala.inline
  def apply(Ch: Chart): ChChart = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChChart]
  }
  
  @scala.inline
  implicit class ChChartMutableBuilder[Self <: ChChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCh(value: Chart): Self = StObject.set(x, "Ch", value.asInstanceOf[js.Any])
  }
}
