package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows content providers running in remote processes to be registered at the local content provider broker. */
trait RemoteContentProviderAcceptor
  extends StObject
     with XRemoteContentProviderAcceptor
     with XRemoteContentProviderActivator
object RemoteContentProviderAcceptor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    activateRemoteContentProviders: () => XContentProviderManager,
    addRemoteContentProvider: (String, XMultiServiceFactory, SeqEquiv[String], XRemoteContentProviderDoneListener) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRemoteContentProvider: String => Boolean
  ): RemoteContentProviderAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activateRemoteContentProviders = js.Any.fromFunction0(activateRemoteContentProviders), addRemoteContentProvider = js.Any.fromFunction4(addRemoteContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProvider = js.Any.fromFunction1(removeRemoteContentProvider))
    __obj.asInstanceOf[RemoteContentProviderAcceptor]
  }
}
