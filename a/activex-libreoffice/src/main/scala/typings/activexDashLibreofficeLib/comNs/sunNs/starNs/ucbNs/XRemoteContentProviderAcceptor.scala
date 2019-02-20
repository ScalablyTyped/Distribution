package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accept remote content providers that want to make themselves known to the local process.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add a remote content provider.
    * @param Identifier An arbitrary identifier uniquely identifying the remote content provider.
    * @param Factory A factory through which the remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Templates A sequence of URL templates the remote content provider is willing to handle.
    * @param DoneListener If not null, the implementation of this interface can  --  through this callback  --  tell the calling side that the implementation
    * @returns true if the remote content provider has successfully been added.
    */
  def addRemoteContentProvider(
    Identifier: java.lang.String,
    Factory: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory,
    Templates: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    DoneListener: XRemoteContentProviderDoneListener
  ): scala.Boolean
  /**
    * Remove a remote content provider.
    * @param Identifier An arbitrary identifier uniquely identifying the remote content provider.
    * @returns true if the remote content provider has successfully been removed.
    */
  def removeRemoteContentProvider(Identifier: java.lang.String): scala.Boolean
}

