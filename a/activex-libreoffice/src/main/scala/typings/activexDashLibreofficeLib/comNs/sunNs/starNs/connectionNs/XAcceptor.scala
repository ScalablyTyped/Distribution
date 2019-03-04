package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to passively accept connection attempts from other processes.
  *
  * This is the counterpart to the {@link XConnector} interface.
  */
trait XAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def accept(sConnectionDescription: java.lang.String): XConnection
  /** pushes acceptor out of the accept-call. */
  def stopAccepting(): scala.Unit
}

object XAcceptor {
  @scala.inline
  def apply(
    accept: js.Function1[java.lang.String, XConnection],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopAccepting: js.Function0[scala.Unit]
  ): XAcceptor = {
    val __obj = js.Dynamic.literal(accept = accept, acquire = acquire, queryInterface = queryInterface, release = release, stopAccepting = stopAccepting)
  
    __obj.asInstanceOf[XAcceptor]
  }
}

