package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification mechanism that a {@link XRemoteContentProviderAcceptor} no longer needs a remote content provider.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderDoneListener extends XInterface {
  /**
    * A notification that all remote content providers added to the given {@link XRemoteContentProviderAcceptor} should be removed, because the acceptor no
    * longer needs them.
    * @param Acceptor If null, all remote content providers added to any acceptor shall be removed.
    */
  def doneWithRemoteContentProviders(Acceptor: XRemoteContentProviderAcceptor): Unit
}

object XRemoteContentProviderDoneListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    doneWithRemoteContentProviders: XRemoteContentProviderAcceptor => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRemoteContentProviderDoneListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), doneWithRemoteContentProviders = js.Any.fromFunction1(doneWithRemoteContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRemoteContentProviderDoneListener]
  }
}

