package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query/register/deregister content providers.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * deregisters a content provider.
    * @param Provider a content provider to deregister.
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template (see {@link registerConten
    */
  def deregisterContentProvider(Provider: XContentProvider, Scheme: java.lang.String): scala.Unit
  /**
    * returns the currently active content provider for a content identifier.
    * @param Identifier a content identifier (i.e., a URL).
    * @returns a content provider, or null.
    */
  def queryContentProvider(Identifier: java.lang.String): XContentProvider
  /**
    * returns a list of information on all registered content providers.
    * @returns a list information on content providers.
    */
  def queryContentProviders(): activexDashInteropLib.SafeArray[ContentProviderInfo]
  /**
    * registers a content provider for a specific URL template.
    * @param Provider the content provider to register.  This may be `NULL` , in which case a later {@link XContentProvider.queryContent()} with an {@link XCo
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template.  A URL template is a regu
    * @param ReplaceExisting `TRUE` : replace the provider possibly registered for the given URL template. The replaced provider will not be deregistered auto
    * @returns the replaced content provider, if there was one.
    * @see XContentIdentifier
    */
  def registerContentProvider(Provider: XContentProvider, Scheme: java.lang.String, ReplaceExisting: scala.Boolean): XContentProvider
}

object XContentProviderManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    deregisterContentProvider: js.Function2[XContentProvider, java.lang.String, scala.Unit],
    queryContentProvider: js.Function1[java.lang.String, XContentProvider],
    queryContentProviders: js.Function0[activexDashInteropLib.SafeArray[ContentProviderInfo]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContentProvider: js.Function3[XContentProvider, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit]
  ): XContentProviderManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("deregisterContentProvider")(deregisterContentProvider)
    __obj.updateDynamic("queryContentProvider")(queryContentProvider)
    __obj.updateDynamic("queryContentProviders")(queryContentProviders)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerContentProvider")(registerContentProvider)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XContentProviderManager]
  }
}

