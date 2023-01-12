package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XColorScaleEntry extends StObject {
  
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color
  
  var Formula: String
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double
  
  def getColor(): Color
  
  def getFormula(): String
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double
  
  def setColor(Color: Color): Unit
  
  def setFormula(Formula: String): Unit
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit
}
object XColorScaleEntry {
  
  inline def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: () => Color,
    getFormula: () => String,
    getType: () => Double,
    setColor: Color => Unit,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XColorScaleEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XColorScaleEntry] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setGetColor(value: () => Color): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    inline def setGetFormula(value: () => String): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSetColor(value: Color => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    inline def setSetFormula(value: String => Unit): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    inline def setSetType(value: Double => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
