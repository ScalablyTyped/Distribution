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
    acquire: () => scala.Unit,
    createAllListerAdapter: (activexDashLibreofficeLib.`type`, XAllListener, js.Any) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAllListenerAdapterService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAllListerAdapter = js.Any.fromFunction3(createAllListerAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAllListenerAdapterService]
  }
}

