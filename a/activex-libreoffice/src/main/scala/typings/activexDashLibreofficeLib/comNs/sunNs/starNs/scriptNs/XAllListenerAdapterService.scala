package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows the generation of adapters from specific interfaces to the {@link XAllListener} interface. */
trait XAllListenerAdapterService
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a wrapper from the listener of type **xListenerType** to the {@link XAllListener} listener.
    *
    * To get the correct listener interface the returned {@link com.sun.star.uno.XInterface} has to be queried for it.
    */
  def createAllListerAdapter(xListenerType: activexDashLibreofficeLib.`type`, xListener: XAllListener, aHelper: js.Any): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XAllListenerAdapterService {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createAllListerAdapter: js.Function3[
      activexDashLibreofficeLib.`type`, 
      XAllListener, 
      js.Any, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAllListenerAdapterService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createAllListerAdapter")(createAllListerAdapter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAllListenerAdapterService]
  }
}

