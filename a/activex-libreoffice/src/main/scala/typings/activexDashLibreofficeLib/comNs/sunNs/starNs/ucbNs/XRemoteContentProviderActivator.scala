package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface should be implemented together with {@link XRemoteContentProviderAcceptor} and allows for a lazy implementation of {@link
  * XRemoteContentProviderAcceptor.addRemoteContentProvider()} .
  *
  * The way this works might change, therefore this interface is marked as deprecated.
  * @deprecated Deprecated
  */
trait XRemoteContentProviderActivator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Activate (i.e., register at the broker) the remote content providers that until now have only been remembered by {@link
    * XRemoteContentProviderAcceptor.addRemoteContentProvider()} , but not registered.
    *
    * This allows for {@link XRemoteContentProviderAcceptor.addRemoteContentProvider()} to be implemented in a lazy fashion (remember the remote content
    * providers, but do not register them right away), which can increase performance in certain situations. But it is not required that an implementation
    * of {@link XRemoteContentProviderAcceptor} uses this lazy strategy (and thus also implements this interface).
    * @returns the broker at which the remote content providers have been registered.
    */
  def activateRemoteContentProviders(): XContentProviderManager
}

