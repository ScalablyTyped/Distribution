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
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    createCommandIdentifier: js.Function0[scala.Double],
    createContentIdentifier: js.Function1[java.lang.String, XContentIdentifier],
    deregisterContentProvider: js.Function2[XContentProvider, java.lang.String, scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryContentProvider: js.Function1[java.lang.String, XContentProvider],
    queryContentProviders: js.Function0[activexDashInteropLib.SafeArray[ContentProviderInfo]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContentProvider: js.Function3[XContentProvider, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XUniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = abort, acquire = acquire, addEventListener = addEventListener, compareContentIds = compareContentIds, createCommandIdentifier = createCommandIdentifier, createContentIdentifier = createContentIdentifier, deregisterContentProvider = deregisterContentProvider, dispose = dispose, execute = execute, queryContent = queryContent, queryContentProvider = queryContentProvider, queryContentProviders = queryContentProviders, queryInterface = queryInterface, registerContentProvider = registerContentProvider, release = release, releaseCommandIdentifier = releaseCommandIdentifier, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XUniversalContentBroker]
  }
}

