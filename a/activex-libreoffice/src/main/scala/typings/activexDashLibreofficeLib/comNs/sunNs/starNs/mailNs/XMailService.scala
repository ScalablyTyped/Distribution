package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mail server abstraction.
  * @since OOo 2.0
  */
trait XMailService
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
    *
    *
    *
    * **Precondition**: `isConnected` returns true.
    * @returns the current connection context.
    * @see com.sun.star.mail.connectUser
    * @see com.sun.star.io.NotConnectedException
    * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
    */
  val CurrentConnectionContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  val SupportedConnectionTypes: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Register a connection listener.
    * @param xListener [in] a listener that will be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def addConnectionListener(xListener: XConnectionListener): scala.Unit
  /**
    * Connect to a mail service. Only one connection to a mail service can be established at a time.
    * @param xConnectionContext [in] an interface used to query for connection related information. The context must contain the following values: **ServerNam
    * @param xAuthenticator [in] an interface used to query for the necessary user information needed to login to the mail server. If no authentication is req
    * @see com.sun.star.uno.XCurrentContext
    * @see com.sun.star.mail.XAuthenticator
    * @see com.sun.star.lang.IllegalArgumentException
    * @see com.sun.star.io.AlreadyConnectedException
    * @see com.sun.star.io.UnknownHostException
    * @see com.sun.star.io.NoRouteToHostException
    * @see com.sun.star.io.ConnectException
    * @see com.sun.star.auth.AuthenticationException
    * @see com.sun.star.mail.IllegalStateException
    * @see com.sun.star.mail.MailException
    * @throws com::sun::star::lang::IllegalArgumentException if the provided connection context contains invalid values or misses required connection parameters.
    * @throws com::sun::star::io::AlreadyConnectedException on a try to connect to an already connect mail server.
    * @throws com::sun::star::io::UnknownHostException usually if the IP address of the mail server could not be determined. Possible causes are a broken netwo
    * @throws com::sun::star::io::NoRouteToHostException if an error occurred to connect to the remote mail server. Typically the remote mail server cannot be
    * @throws com::sun::star::io::ConnectException if an error occurred while attempting to connect to the remote mail server. Typically the connection was ref
    * @throws com::sun::star::auth::AuthenticationException if the specified user could not be logged in.
    * @throws com::sun::star::mail::MailException for other errors during login.
    */
  def connect(
    xConnectionContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext,
    xAuthenticator: XAuthenticator
  ): scala.Unit
  /**
    * Disconnect from a mail service.
    * @throws com::sun::star::mail::MailException if errors occur during disconnecting.
    */
  def disconnect(): scala.Unit
  /**
    * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
    *
    *
    *
    * **Precondition**: `isConnected` returns true.
    * @returns the current connection context.
    * @see com.sun.star.mail.connectUser
    * @see com.sun.star.io.NotConnectedException
    * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
    */
  def getCurrentConnectionContext(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  def getSupportedConnectionTypes(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns whether a connection to a mail service currently exist or not.
    * @returns `TRUE` if a connection to a mail service is established.
    */
  def isConnected(): scala.Boolean
  /**
    * Unregister a connection listener.
    * @param xListener [in] a listener that no longer need to be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def removeConnectionListener(xListener: XConnectionListener): scala.Unit
}

object XMailService {
  @scala.inline
  def apply(
    CurrentConnectionContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext,
    SupportedConnectionTypes: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addConnectionListener: js.Function1[XConnectionListener, scala.Unit],
    connect: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext, 
      XAuthenticator, 
      scala.Unit
    ],
    disconnect: js.Function0[scala.Unit],
    getCurrentConnectionContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext],
    getSupportedConnectionTypes: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isConnected: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeConnectionListener: js.Function1[XConnectionListener, scala.Unit]
  ): XMailService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentConnectionContext")(CurrentConnectionContext)
    __obj.updateDynamic("SupportedConnectionTypes")(SupportedConnectionTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConnectionListener")(addConnectionListener)
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("getCurrentConnectionContext")(getCurrentConnectionContext)
    __obj.updateDynamic("getSupportedConnectionTypes")(getSupportedConnectionTypes)
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeConnectionListener")(removeConnectionListener)
    __obj.asInstanceOf[XMailService]
  }
}

