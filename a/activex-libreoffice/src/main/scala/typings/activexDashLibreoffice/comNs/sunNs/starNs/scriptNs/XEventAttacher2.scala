package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventAttacher2 extends XEventAttacher {
  /**
    * Register a multiple set of listeners listening for the same target. Besides passing multiple listeners, the behavior of this method is identical to
    * that of {@link attachSingleEventListener()} .
    * @see com.sun.star.script.XEventAttacher.attachSingleEventListener
    */
  def attachMultipleEventListeners(xTarget: XInterface, aListeners: SeqEquiv[EventListener]): SafeArray[XEventListener]
}

object XEventAttacher2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    attachListener: (XInterface, XAllListener, js.Any, String, String) => XEventListener,
    attachMultipleEventListeners: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener],
    attachSingleEventListener: (XInterface, XAllListener, js.Any, String, String, String) => XEventListener,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: (XInterface, String, String, XEventListener) => Unit
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachMultipleEventListeners = js.Any.fromFunction2(attachMultipleEventListeners), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
  
    __obj.asInstanceOf[XEventAttacher2]
  }
}

