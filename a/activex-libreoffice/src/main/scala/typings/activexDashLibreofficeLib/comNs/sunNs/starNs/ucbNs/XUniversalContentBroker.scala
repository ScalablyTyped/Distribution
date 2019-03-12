package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.0 */
trait XUniversalContentBroker
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContentProvider
     with XContentProviderManager
     with XContentIdentifierFactory

object XUniversalContentBroker {
  @scala.inline
  def apply(
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => scala.Double,
    createCommandIdentifier: () => scala.Double,
    createContentIdentifier: java.lang.String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, java.lang.String) => scala.Unit,
    dispose: () => scala.Unit,
    execute: (Command, scala.Double, XCommandEnvironment) => js.Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: java.lang.String => XContentProvider,
    queryContentProviders: () => stdLib.SafeArray[ContentProviderInfo],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContentProvider: (XContentProvider, java.lang.String, scala.Boolean) => XContentProvider,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): XUniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), compareContentIds = js.Any.fromFunction2(compareContentIds), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2(deregisterContentProvider), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = js.Any.fromFunction0(queryContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XUniversalContentBroker]
  }
}

