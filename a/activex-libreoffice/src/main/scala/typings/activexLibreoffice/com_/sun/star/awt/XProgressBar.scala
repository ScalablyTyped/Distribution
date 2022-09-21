package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a progress bar. */
trait XProgressBar
  extends StObject
     with XInterface {
  
  /** returns the current progress value of the progress bar. */
  var Value: Double
  
  /** returns the current progress value of the progress bar. */
  def getValue(): Double
  
  /** sets the background color (RGB) of the control. */
  def setBackgroundColor(Color: Color): Unit
  
  /** sets the foreground color (RGB) of the control. */
  def setForegroundColor(Color: Color): Unit
  
  /**
    * sets the minimum and the maximum progress value of the progress bar.
    *
    * If the minimum value is greater than the maximum value, the method exchanges the values automatically.
    */
  def setRange(Min: Double, Max: Double): Unit
  
  /** sets the progress value of the progress bar. */
  def setValue(Value: Double): Unit
}
object XProgressBar {
  
  inline def apply(
    Value: Double,
    acquire: () => Unit,
    getValue: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    setBackgroundColor: Color => Unit,
    setForegroundColor: Color => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit
  ): XProgressBar = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XProgressBar]
  }
  
  extension [Self <: XProgressBar](x: Self) {
    
    inline def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetBackgroundColor(value: Color => Unit): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetForegroundColor(value: Color => Unit): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1(value))
    
    inline def setSetRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
