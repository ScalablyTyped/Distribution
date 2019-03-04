package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notify about changes to a {@link XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add a listener.
    * @param Listener Some listener.
    */
  def addRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): scala.Unit
  /**
    * Remove a listener.
    * @param Listener Some listener previously added via {@link XRemoteContentProviderChangeNotifier.addRemoteContentProviderChangeListener()} .
    */
  def removeRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): scala.Unit
}

object XRemoteContentProviderChangeNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addRemoteContentProviderChangeListener: js.Function1[XRemoteContentProviderChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeRemoteContentProviderChangeListener: js.Function1[XRemoteContentProviderChangeListener, scala.Unit]
  ): XRemoteContentProviderChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire, addRemoteContentProviderChangeListener = addRemoteContentProviderChangeListener, queryInterface = queryInterface, release = release, removeRemoteContentProviderChangeListener = removeRemoteContentProviderChangeListener)
  
    __obj.asInstanceOf[XRemoteContentProviderChangeNotifier]
  }
}

