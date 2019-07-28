package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link ContentProvider} that wraps remote content providers that (potentially) have been distributed to a UCB.
  *
  * Before trying to pass a request to a "real", underlying content provider (which will most likely be a remote content provider distributed to this
  * UCB), this proxy first activates any remote content providers that have been distributed here, but are still inactive (see {@link
  * RemoteContentProviderAcceptor} and {@link XRemoteContentProviderActivator} for more information).
  *
  * The way this works might change, therefore this interface is marked as deprecated.
  * @deprecated Deprecated
  */
trait RemoteProxyContentProvider
  extends XContentProvider
     with XContentIdentifierFactory
     with XParameterizedContentProvider

object RemoteProxyContentProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createContentIdentifier: String => XContentIdentifier,
    deregisterInstance: (String, String) => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => js.Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: () => Unit
  ): RemoteProxyContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[RemoteProxyContentProvider]
  }
}

