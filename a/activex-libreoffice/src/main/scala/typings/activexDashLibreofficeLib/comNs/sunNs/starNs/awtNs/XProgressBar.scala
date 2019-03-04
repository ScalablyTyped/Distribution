package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a progress bar. */
trait XProgressBar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the current progress value of the progress bar. */
  var Value: scala.Double
  /** returns the current progress value of the progress bar. */
  def getValue(): scala.Double
  /** sets the background color (RGB) of the control. */
  def setBackgroundColor(Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** sets the foreground color (RGB) of the control. */
  def setForegroundColor(Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /**
    * sets the minimum and the maximum progress value of the progress bar.
    *
    * If the minimum value is greater than the maximum value, the method exchanges the values automatically.
    */
  def setRange(Min: scala.Double, Max: scala.Double): scala.Unit
  /** sets the progress value of the progress bar. */
  def setValue(Value: scala.Double): scala.Unit
}

object XProgressBar {
  @scala.inline
  def apply(
    Value: scala.Double,
    acquire: js.Function0[scala.Unit],
    getValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setBackgroundColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setForegroundColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setRange: js.Function2[scala.Double, scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): XProgressBar = {
    val __obj = js.Dynamic.literal(Value = Value, acquire = acquire, getValue = getValue, queryInterface = queryInterface, release = release, setBackgroundColor = setBackgroundColor, setForegroundColor = setForegroundColor, setRange = setRange, setValue = setValue)
  
    __obj.asInstanceOf[XProgressBar]
  }
}

