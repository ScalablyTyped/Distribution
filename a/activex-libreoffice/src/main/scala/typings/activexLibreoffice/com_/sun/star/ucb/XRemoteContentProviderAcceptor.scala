package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accept remote content providers that want to make themselves known to the local process.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderAcceptor extends XInterface {
  /**
    * Add a remote content provider.
    * @param Identifier An arbitrary identifier uniquely identifying the remote content provider.
    * @param Factory A factory through which the remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Templates A sequence of URL templates the remote content provider is willing to handle.
    * @param DoneListener If not null, the implementation of this interface can  --  through this callback  --  tell the calling side that the implementation
    * @returns true if the remote content provider has successfully been added.
    */
  def addRemoteContentProvider(
    Identifier: String,
    Factory: XMultiServiceFactory,
    Templates: SeqEquiv[String],
    DoneListener: XRemoteContentProviderDoneListener
  ): Boolean
  /**
    * Remove a remote content provider.
    * @param Identifier An arbitrary identifier uniquely identifying the remote content provider.
    * @returns true if the remote content provider has successfully been removed.
    */
  def removeRemoteContentProvider(Identifier: String): Boolean
}

object XRemoteContentProviderAcceptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRemoteContentProvider: (String, XMultiServiceFactory, SeqEquiv[String], XRemoteContentProviderDoneListener) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRemoteContentProvider: String => Boolean
  ): XRemoteContentProviderAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRemoteContentProvider = js.Any.fromFunction4(addRemoteContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProvider = js.Any.fromFunction1(removeRemoteContentProvider))
    __obj.asInstanceOf[XRemoteContentProviderAcceptor]
  }
}

