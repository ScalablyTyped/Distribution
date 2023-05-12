package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart extends StObject {
  
  var chart: Categorical
}
object Chart {
  
  inline def apply(chart: Categorical): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Categorical): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
  }
}
