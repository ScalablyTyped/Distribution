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
    acquire: js.Function0[scala.Unit],
    addText: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    getValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeText: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    setBackgroundColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setForegroundColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setRange: js.Function2[scala.Double, scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    updateText: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit]
  ): XProgressMonitor = {
    val __obj = js.Dynamic.literal(Value = Value, acquire = acquire, addText = addText, getValue = getValue, queryInterface = queryInterface, release = release, removeText = removeText, setBackgroundColor = setBackgroundColor, setForegroundColor = setForegroundColor, setRange = setRange, setValue = setValue, updateText = updateText)
  
    __obj.asInstanceOf[XProgressMonitor]
  }
}

