package typings.activexLibreoffice.com_.sun.star.connection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to actively establish an interprocess connection. */
@js.native
trait XConnector extends XInterface {
  
  /**
    * creates a new connection interprocess connection.
    *
    * Tries to connect to an {@link XAcceptor} . Behavior is unspecified if a call to connect is made when another call to connect either has not yet
    * returned or has returned successfully without raising an exception.
    * @param sConnectionDescription contains the kind of the connection plus a comma separated list of attributes, e.g., **socket,host=locahost,port=2345** fo
    * @throws ConnectionSetupException Problems during setting up the connector on client side, (e.g., Security-reasons, socket already busy .. ), or the strin
    * @throws NoConnectException Couldn't reach a server (e.g. network failure), no server is listening
    */
  def connect(sConnectionDescription: String): XConnection = js.native
}
object XConnector {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    connect: String => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction1(connect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConnector]
  }
  
  @scala.inline
  implicit class XConnectorOps[Self <: XConnector] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: String => XConnection): Self = this.set("connect", js.Any.fromFunction1(value))
  }
}
