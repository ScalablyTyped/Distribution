package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRegressionCurve
  extends StObject
     with XInterface {
  
  val Calculator: XRegressionCurveCalculator
  
  var EquationProperties: XPropertySet
  
  def getCalculator(): XRegressionCurveCalculator
  
  def getEquationProperties(): XPropertySet
  
  def setEquationProperties(xEquationProperties: XPropertySet): Unit
}
object XRegressionCurve {
  
  inline def apply(
    Calculator: XRegressionCurveCalculator,
    EquationProperties: XPropertySet,
    acquire: () => Unit,
    getCalculator: () => XRegressionCurveCalculator,
    getEquationProperties: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    setEquationProperties: XPropertySet => Unit
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal(Calculator = Calculator.asInstanceOf[js.Any], EquationProperties = EquationProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCalculator = js.Any.fromFunction0(getCalculator), getEquationProperties = js.Any.fromFunction0(getEquationProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEquationProperties = js.Any.fromFunction1(setEquationProperties))
    __obj.asInstanceOf[XRegressionCurve]
  }
  
  extension [Self <: XRegressionCurve](x: Self) {
    
    inline def setCalculator(value: XRegressionCurveCalculator): Self = StObject.set(x, "Calculator", value.asInstanceOf[js.Any])
    
    inline def setEquationProperties(value: XPropertySet): Self = StObject.set(x, "EquationProperties", value.asInstanceOf[js.Any])
    
    inline def setGetCalculator(value: () => XRegressionCurveCalculator): Self = StObject.set(x, "getCalculator", js.Any.fromFunction0(value))
    
    inline def setGetEquationProperties(value: () => XPropertySet): Self = StObject.set(x, "getEquationProperties", js.Any.fromFunction0(value))
    
    inline def setSetEquationProperties(value: XPropertySet => Unit): Self = StObject.set(x, "setEquationProperties", js.Any.fromFunction1(value))
  }
}
