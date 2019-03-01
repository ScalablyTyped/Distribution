package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * controls a status indicator which displays progress of longer actions to the user
  *
  * Such objects are provided by a {@link XStatusIndicatorFactory} .
  * @see XStatusIndicatorFactory
  */
trait XStatusIndicator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * stop the progress
    *
    * Further calls of {@link XStatusIndicator.setText()} , {@link XStatusIndicator.setValue()} or {@link XStatusIndicator.reset()} must be ignored. Only
    * {@link XStatusIndicator.start()} can reactivate this indicator. It's not allowed to destruct the indicator inside this method. The instance must be
    * gone by using ref count or disposing.
    */
  def end(): scala.Unit
  /**
    * clear progress value and description
    *
    * Calling of setValue(0) and setText("") should do the same. Stopped indicators must ignore this call.
    */
  def reset(): scala.Unit
  /**
    * update progress description
    *
    * Initial value can be set during starting of the progress by calling {@link XStatusIndicator.start()} . Stopped indicators must ignore this call.
    * @param Text new value for progress description which should be shown now
    */
  def setText(Text: java.lang.String): scala.Unit
  /**
    * update progress value
    *
    * Wrong values must be ignored and stopped indicators must ignore this call generally.
    * @param Value new value for progress which should be shown now Must fit the range [0..Range] which was set during {@link XStatusIndicator.start()} .
    */
  def setValue(Value: scala.Double): scala.Unit
  /**
    * initialize and start the progress
    *
    * It activates a new created or reactivate an already used indicator (must be finished by calling {@link XStatusIndicator.end()} before!). By the way
    * it's possible to set first progress description and the possible range of progress value. That means that a progress can runs from 0 to **Range** .
    * @param Text initial value for progress description for showing Value can be updated by calling {@link XStatusIndicator.setText()} .
    * @param Range means the maximum value of the progress which can be set by calling {@link XStatusIndicator.setValue()} .
    */
  def start(Text: java.lang.String, Range: scala.Double): scala.Unit
}

object XStatusIndicator {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    end: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    start: js.Function2[java.lang.String, scala.Double, scala.Unit]
  ): XStatusIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[XStatusIndicator]
  }
}

