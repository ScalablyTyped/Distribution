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

object RemoteProxyContentProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    createContentIdentifier: js.Function1[java.lang.String, XContentIdentifier],
    deregisterInstance: js.Function2[java.lang.String, java.lang.String, XContentProvider],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerInstance: js.Function3[java.lang.String, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit]
  ): RemoteProxyContentProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compareContentIds")(compareContentIds)
    __obj.updateDynamic("createContentIdentifier")(createContentIdentifier)
    __obj.updateDynamic("deregisterInstance")(deregisterInstance)
    __obj.updateDynamic("queryContent")(queryContent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerInstance")(registerInstance)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[RemoteProxyContentProvider]
  }
}

