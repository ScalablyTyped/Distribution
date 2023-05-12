package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartNeutral extends StObject {
  
  var chart: Neutral
}
object ChartNeutral {
  
  inline def apply(chart: Neutral): ChartNeutral = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartNeutral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartNeutral] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Neutral): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
  }
}
