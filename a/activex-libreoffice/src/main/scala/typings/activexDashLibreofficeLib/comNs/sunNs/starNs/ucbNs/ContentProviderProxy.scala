package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a proxy for a content provider.
  *
  * Implementing a content provider proxy can be useful if the creation of the real content provider object shall be deferred for some reason (i.e.
  * performance) until the first method gets called on it. Instead of instantiating and registering the real provider at the UCB, a proxy for the real
  * provider can be created and registered at the UCB.
  * @see XContentProviderProxyFactory
  */
trait ContentProviderProxy
  extends XContentProviderSupplier
     with XContentProvider
     with XParameterizedContentProvider

object ContentProviderProxy {
  @scala.inline
  def apply(
    ContentProvider: XContentProvider,
    acquire: js.Function0[scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    deregisterInstance: js.Function2[java.lang.String, java.lang.String, XContentProvider],
    getContentProvider: js.Function0[XContentProvider],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerInstance: js.Function3[java.lang.String, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit]
  ): ContentProviderProxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentProvider")(ContentProvider)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compareContentIds")(compareContentIds)
    __obj.updateDynamic("deregisterInstance")(deregisterInstance)
    __obj.updateDynamic("getContentProvider")(getContentProvider)
    __obj.updateDynamic("queryContent")(queryContent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerInstance")(registerInstance)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[ContentProviderProxy]
  }
}

