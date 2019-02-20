package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventAttacher2 extends XEventAttacher {
  /**
    * Register a multiple set of listeners listening for the same target. Besides passing multiple listeners, the behavior of this method is identical to
    * that of {@link attachSingleEventListener()} .
    * @see com.sun.star.script.XEventAttacher.attachSingleEventListener
    */
  def attachMultipleEventListeners(
    xTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    aListeners: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[EventListener]
  ): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener]
}

