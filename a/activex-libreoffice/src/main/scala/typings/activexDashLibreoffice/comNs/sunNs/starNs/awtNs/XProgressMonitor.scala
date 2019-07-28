package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
trait XProgressMonitor extends XProgressBar {
  /** adds a new text line to the control. */
  def addText(Topic: String, Text: String, beforeProgress: Boolean): Unit
  /** removes a text line from the control. */
  def removeText(Topic: String, beforeProgress: Boolean): Unit
  /** updates an existing text line at the control. */
  def updateText(Topic: String, Text: String, beforeProgress: Boolean): Unit
}

object XProgressMonitor {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(Value = Value, acquire = js.Any.fromFunction0(acquire), addText = js.Any.fromFunction3(addText), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeText = js.Any.fromFunction2(removeText), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), updateText = js.Any.fromFunction3(updateText))
  
    __obj.asInstanceOf[XProgressMonitor]
  }
}

