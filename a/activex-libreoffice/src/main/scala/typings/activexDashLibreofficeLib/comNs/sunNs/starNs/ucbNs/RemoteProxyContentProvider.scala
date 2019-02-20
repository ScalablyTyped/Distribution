package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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

