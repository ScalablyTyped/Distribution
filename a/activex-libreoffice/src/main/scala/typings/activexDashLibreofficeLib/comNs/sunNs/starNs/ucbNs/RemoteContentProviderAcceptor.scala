package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows content providers running in remote processes to be registered at the local content provider broker. */
trait RemoteContentProviderAcceptor
  extends XRemoteContentProviderAcceptor
     with XRemoteContentProviderActivator

object RemoteContentProviderAcceptor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    activateRemoteContentProviders: () => XContentProviderManager,
    addRemoteContentProvider: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XRemoteContentProviderDoneListener) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRemoteContentProvider: java.lang.String => scala.Boolean
  ): RemoteContentProviderAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activateRemoteContentProviders = js.Any.fromFunction0(activateRemoteContentProviders), addRemoteContentProvider = js.Any.fromFunction4(addRemoteContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProvider = js.Any.fromFunction1(removeRemoteContentProvider))
  
    __obj.asInstanceOf[RemoteContentProviderAcceptor]
  }
}

