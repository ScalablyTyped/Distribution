package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to actively establish an interprocess connection. */
trait XConnector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new connection interprocess connection.
    *
    * Tries to connect to an {@link XAcceptor} . Behavior is unspecified if a call to connect is made when another call to connect either has not yet
    * returned or has returned successfully without raising an exception.
    * @param sConnectionDescription contains the kind of the connection plus a comma separated list of attributes, e.g., **socket,host=locahost,port=2345** fo
    * @throws ConnectionSetupException Problems during setting up the connector on client side, (e.g., Security-reasons, socket already busy .. ), or the strin
    * @throws NoConnectException Couldn't reach a server (e.g. network failure), no server is listening
    */
  def connect(sConnectionDescription: java.lang.String): XConnection
}

object XConnector {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    connect: java.lang.String => XConnection,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XConnector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction1(connect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConnector]
  }
}

