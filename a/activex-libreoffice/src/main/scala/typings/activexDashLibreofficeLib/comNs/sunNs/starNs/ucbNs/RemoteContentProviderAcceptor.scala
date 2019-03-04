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
    acquire: js.Function0[scala.Unit],
    activateRemoteContentProviders: js.Function0[XContentProviderManager],
    addRemoteContentProvider: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XRemoteContentProviderDoneListener, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeRemoteContentProvider: js.Function1[java.lang.String, scala.Boolean]
  ): RemoteContentProviderAcceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire, activateRemoteContentProviders = activateRemoteContentProviders, addRemoteContentProvider = addRemoteContentProvider, queryInterface = queryInterface, release = release, removeRemoteContentProvider = removeRemoteContentProvider)
  
    __obj.asInstanceOf[RemoteContentProviderAcceptor]
  }
}

