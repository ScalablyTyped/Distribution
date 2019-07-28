package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notify about changes to a {@link XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeNotifier extends XInterface {
  /**
    * Add a listener.
    * @param Listener Some listener.
    */
  def addRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
  /**
    * Remove a listener.
    * @param Listener Some listener previously added via {@link XRemoteContentProviderChangeNotifier.addRemoteContentProviderChangeListener()} .
    */
  def removeRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
}

object XRemoteContentProviderChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit
  ): XRemoteContentProviderChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRemoteContentProviderChangeListener = js.Any.fromFunction1(addRemoteContentProviderChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProviderChangeListener = js.Any.fromFunction1(removeRemoteContentProviderChangeListener))
  
    __obj.asInstanceOf[XRemoteContentProviderChangeNotifier]
  }
}

