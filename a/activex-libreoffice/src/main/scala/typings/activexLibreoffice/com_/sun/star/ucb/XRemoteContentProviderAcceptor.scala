package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accept remote content providers that want to make themselves known to the local process.
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
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
  ): Boolean = js.native
  
  /**
    * Remove a remote content provider.
    * @param Identifier An arbitrary identifier uniquely identifying the remote content provider.
    * @returns true if the remote content provider has successfully been removed.
    */
  def removeRemoteContentProvider(Identifier: String): Boolean = js.native
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
  
  @scala.inline
  implicit class XRemoteContentProviderAcceptorOps[Self <: XRemoteContentProviderAcceptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRemoteContentProvider(
      value: (String, XMultiServiceFactory, SeqEquiv[String], XRemoteContentProviderDoneListener) => Boolean
    ): Self = this.set("addRemoteContentProvider", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveRemoteContentProvider(value: String => Boolean): Self = this.set("removeRemoteContentProvider", js.Any.fromFunction1(value))
  }
}
