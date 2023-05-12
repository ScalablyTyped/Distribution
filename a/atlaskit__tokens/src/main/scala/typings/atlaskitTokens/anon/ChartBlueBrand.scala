package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBlueBrand[BaseToken] extends StObject {
  
  var chart: BlueBrand[BaseToken]
}
object ChartBlueBrand {
  
  inline def apply[BaseToken](chart: BlueBrand[BaseToken]): ChartBlueBrand[BaseToken] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBlueBrand[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartBlueBrand[?], BaseToken] (val x: Self & ChartBlueBrand[BaseToken]) extends AnyVal {
    
    inline def setChart(value: BlueBrand[BaseToken]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
  }
}
