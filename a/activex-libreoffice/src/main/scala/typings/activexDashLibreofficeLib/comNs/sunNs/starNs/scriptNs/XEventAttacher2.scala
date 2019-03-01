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

object XEventAttacher2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    attachListener: js.Function5[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      XAllListener, 
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
    ],
    attachMultipleEventListeners: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[EventListener], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener]
    ],
    attachSingleEventListener: js.Function6[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      XAllListener, 
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeListener: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, 
      scala.Unit
    ]
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("attachListener")(attachListener)
    __obj.updateDynamic("attachMultipleEventListeners")(attachMultipleEventListeners)
    __obj.updateDynamic("attachSingleEventListener")(attachSingleEventListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[XEventAttacher2]
  }
}

