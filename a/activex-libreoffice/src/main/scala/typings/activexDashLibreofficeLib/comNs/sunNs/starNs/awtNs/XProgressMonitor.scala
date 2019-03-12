package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
trait XProgressMonitor extends XProgressBar {
  /** adds a new text line to the control. */
  def addText(Topic: java.lang.String, Text: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
  /** removes a text line from the control. */
  def removeText(Topic: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
  /** updates an existing text line at the control. */
  def updateText(Topic: java.lang.String, Text: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
}

object XProgressMonitor {
  @scala.inline
  def apply(
    Value: scala.Double,
    acquire: () => scala.Unit,
    addText: (java.lang.String, java.lang.String, scala.Boolean) => scala.Unit,
    getValue: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeText: (java.lang.String, scala.Boolean) => scala.Unit,
    setBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setForegroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setRange: (scala.Double, scala.Double) => scala.Unit,
    setValue: scala.Double => scala.Unit,
    updateText: (java.lang.String, java.lang.String, scala.Boolean) => scala.Unit
  ): XProgressMonitor = {
    val __obj = js.Dynamic.literal(Value = Value, acquire = js.Any.fromFunction0(acquire), addText = js.Any.fromFunction3(addText), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeText = js.Any.fromFunction2(removeText), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), updateText = js.Any.fromFunction3(updateText))
  
    __obj.asInstanceOf[XProgressMonitor]
  }
}

