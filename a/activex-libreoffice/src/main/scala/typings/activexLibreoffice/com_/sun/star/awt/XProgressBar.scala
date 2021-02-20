package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a progress bar. */
@js.native
trait XProgressBar extends XInterface {
  
  /** returns the current progress value of the progress bar. */
  var Value: Double = js.native
  
  /** returns the current progress value of the progress bar. */
  def getValue(): Double = js.native
  
  /** sets the background color (RGB) of the control. */
  def setBackgroundColor(Color: Color): Unit = js.native
  
  /** sets the foreground color (RGB) of the control. */
  def setForegroundColor(Color: Color): Unit = js.native
  
  /**
    * sets the minimum and the maximum progress value of the progress bar.
    *
    * If the minimum value is greater than the maximum value, the method exchanges the values automatically.
    */
  def setRange(Min: Double, Max: Double): Unit = js.native
  
  /** sets the progress value of the progress bar. */
  def setValue(Value: Double): Unit = js.native
}
object XProgressBar {
  
  @scala.inline
  def apply(
    Value: Double,
    acquire: () => Unit,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setBackgroundColor: Color => Unit,
    setForegroundColor: Color => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit
  ): XProgressBar = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XProgressBar]
  }
  
  @scala.inline
  implicit class XProgressBarMutableBuilder[Self <: XProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBackgroundColor(value: Color => Unit): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForegroundColor(value: Color => Unit): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
