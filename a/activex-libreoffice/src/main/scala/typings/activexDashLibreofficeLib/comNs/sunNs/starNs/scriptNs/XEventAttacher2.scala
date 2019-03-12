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
  ): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener]
}

object XEventAttacher2 {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    attachListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, XAllListener, js.Any, java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener,
    attachMultipleEventListeners: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[EventListener]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener],
    attachSingleEventListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, XAllListener, js.Any, java.lang.String, java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener) => scala.Unit
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachMultipleEventListeners = js.Any.fromFunction2(attachMultipleEventListeners), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
  
    __obj.asInstanceOf[XEventAttacher2]
  }
}

