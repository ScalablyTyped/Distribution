package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provide access to a collection of remote content providers.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get a factory through which a remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Identifier An arbitrary identifier uniquely identifying a remote content provider.
    * @returns the appropriate factory, or null if none is available.
    */
  def queryRemoteContentProvider(Identifier: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
}

object XRemoteContentProviderSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryRemoteContentProvider: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
    ],
    release: js.Function0[scala.Unit]
  ): XRemoteContentProviderSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, queryRemoteContentProvider = queryRemoteContentProvider, release = release)
  
    __obj.asInstanceOf[XRemoteContentProviderSupplier]
  }
}

