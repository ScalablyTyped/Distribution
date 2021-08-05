package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
trait XProgressMonitor
  extends StObject
     with XProgressBar {
  
  /** adds a new text line to the control. */
  def addText(Topic: String, Text: String, beforeProgress: Boolean): Unit
  
  /** removes a text line from the control. */
  def removeText(Topic: String, beforeProgress: Boolean): Unit
  
  /** updates an existing text line at the control. */
  def updateText(Topic: String, Text: String, beforeProgress: Boolean): Unit
}
object XProgressMonitor {
  
  inline def apply(
    Value: Double,
    acquire: () => Unit,
    addText: (String, String, Boolean) => Unit,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeText: (String, Boolean) => Unit,
    setBackgroundColor: Color => Unit,
    setForegroundColor: Color => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit,
    updateText: (String, String, Boolean) => Unit
  ): XProgressMonitor = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addText = js.Any.fromFunction3(addText), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeText = js.Any.fromFunction2(removeText), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), updateText = js.Any.fromFunction3(updateText))
    __obj.asInstanceOf[XProgressMonitor]
  }
  
  extension [Self <: XProgressMonitor](x: Self) {
    
    inline def setAddText(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "addText", js.Any.fromFunction3(value))
    
    inline def setRemoveText(value: (String, Boolean) => Unit): Self = StObject.set(x, "removeText", js.Any.fromFunction2(value))
    
    inline def setUpdateText(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "updateText", js.Any.fromFunction3(value))
  }
}
