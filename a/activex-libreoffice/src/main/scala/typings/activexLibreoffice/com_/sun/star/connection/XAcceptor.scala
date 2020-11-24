package typings.activexLibreoffice.com_.sun.star.connection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to passively accept connection attempts from other processes.
  *
  * This is the counterpart to the {@link XConnector} interface.
  */
@js.native
trait XAcceptor extends XInterface {
  
  /**
    * accepts an interprocess connection. Waits until someone connects to the resource.
    *
    * After a successful return, the method may be called again to accept further connections, but the parameter string MUST be left unchanged.
    * @param sConnectionDescription contains the kind of the connection plus a comma separated list of attributes, e.g., **socket,host=localhost,port=2345** f
    * @returns null reference, stopAccepting was called. Otherwise a valid {@link XConnection} reference.
    * @throws AlreadyAcceptingException Only one acceptor-thread per instance allowed.
    * @throws ConnectionSetupException Problems during setting up the acceptor. (e.g., Security-reasons, socket already busy, etc.)
    * @throws com::sun::star::lang::IllegalArgumentException sConnectionDescription could not be interpreted
    */
  def accept(sConnectionDescription: String): XConnection = js.native
  
  /** pushes acceptor out of the accept-call. */
  def stopAccepting(): Unit = js.native
}
object XAcceptor {
  
  @scala.inline
  def apply(
    accept: String => XConnection,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopAccepting: () => Unit
  ): XAcceptor = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopAccepting = js.Any.fromFunction0(stopAccepting))
    __obj.asInstanceOf[XAcceptor]
  }
  
  @scala.inline
  implicit class XAcceptorOps[Self <: XAcceptor] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: String => XConnection): Self = this.set("accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopAccepting(value: () => Unit): Self = this.set("stopAccepting", js.Any.fromFunction0(value))
  }
}
