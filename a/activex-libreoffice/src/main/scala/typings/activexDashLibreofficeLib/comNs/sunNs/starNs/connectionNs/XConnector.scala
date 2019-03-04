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
    acquire: js.Function0[scala.Unit],
    connect: js.Function1[java.lang.String, XConnection],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConnector = {
    val __obj = js.Dynamic.literal(acquire = acquire, connect = connect, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XConnector]
  }
}

