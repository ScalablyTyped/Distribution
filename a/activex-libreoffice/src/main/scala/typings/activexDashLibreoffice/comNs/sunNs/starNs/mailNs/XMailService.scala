package typings.activexDashLibreoffice.comNs.sunNs.starNs.mailNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XCurrentContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mail server abstraction.
  * @since OOo 2.0
  */
trait XMailService extends XInterface {
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
  val CurrentConnectionContext: XCurrentContext
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  val SupportedConnectionTypes: SafeArray[String]
  /**
    * Register a connection listener.
    * @param xListener [in] a listener that will be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def addConnectionListener(xListener: XConnectionListener): Unit
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
  def connect(xConnectionContext: XCurrentContext, xAuthenticator: XAuthenticator): Unit
  /**
    * Disconnect from a mail service.
    * @throws com::sun::star::mail::MailException if errors occur during disconnecting.
    */
  def disconnect(): Unit
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
  def getCurrentConnectionContext(): XCurrentContext
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  def getSupportedConnectionTypes(): SafeArray[String]
  /**
    * Returns whether a connection to a mail service currently exist or not.
    * @returns `TRUE` if a connection to a mail service is established.
    */
  def isConnected(): Boolean
  /**
    * Unregister a connection listener.
    * @param xListener [in] a listener that no longer need to be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def removeConnectionListener(xListener: XConnectionListener): Unit
}

object XMailService {
  @scala.inline
  def apply(
    CurrentConnectionContext: XCurrentContext,
    SupportedConnectionTypes: SafeArray[String],
    acquire: () => Unit,
    addConnectionListener: XConnectionListener => Unit,
    connect: (XCurrentContext, XAuthenticator) => Unit,
    disconnect: () => Unit,
    getCurrentConnectionContext: () => XCurrentContext,
    getSupportedConnectionTypes: () => SafeArray[String],
    isConnected: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeConnectionListener: XConnectionListener => Unit
  ): XMailService = {
    val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext, SupportedConnectionTypes = SupportedConnectionTypes, acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener))
  
    __obj.asInstanceOf[XMailService]
  }
}

