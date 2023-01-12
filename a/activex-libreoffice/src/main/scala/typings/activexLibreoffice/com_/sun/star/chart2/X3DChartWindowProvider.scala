package typings.activexLibreoffice.com_.sun.star.chart2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X3DChartWindowProvider extends StObject {
  
  def setWindow(window: Double): Unit
}
object X3DChartWindowProvider {
  
  inline def apply(setWindow: Double => Unit): X3DChartWindowProvider = {
    val __obj = js.Dynamic.literal(setWindow = js.Any.fromFunction1(setWindow))
    __obj.asInstanceOf[X3DChartWindowProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X3DChartWindowProvider] (val x: Self) extends AnyVal {
    
    inline def setSetWindow(value: Double => Unit): Self = StObject.set(x, "setWindow", js.Any.fromFunction1(value))
  }
}
