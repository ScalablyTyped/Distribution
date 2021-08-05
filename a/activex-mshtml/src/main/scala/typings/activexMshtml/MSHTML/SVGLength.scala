package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGLength extends StObject {
  
  /* private */ @JSName("MSHTML.SVGLength_typekey")
  var MSHTMLDotSVGLength_typekey: SVGLength
  
  def convertToSpecifiedUnits(unitType: Double): Unit
  
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
  
  var unitType: Double
  
  var value: Double
  
  var valueAsString: String
  
  var valueInSpecifiedUnits: Double
}
object SVGLength {
  
  inline def apply(
    MSHTMLDotSVGLength_typekey: SVGLength,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: String,
    valueInSpecifiedUnits: Double
  ): SVGLength = {
    val __obj = js.Dynamic.literal(convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLength_typekey")(MSHTMLDotSVGLength_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLength]
  }
  
  extension [Self <: SVGLength](x: Self) {
    
    inline def setConvertToSpecifiedUnits(value: Double => Unit): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotSVGLength_typekey(value: SVGLength): Self = StObject.set(x, "MSHTML.SVGLength_typekey", value.asInstanceOf[js.Any])
    
    inline def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2(value))
    
    inline def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    inline def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
