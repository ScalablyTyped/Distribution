package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XCurrentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mail server abstraction.
  * @since OOo 2.0
  */
@js.native
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
  val CurrentConnectionContext: XCurrentContext = js.native
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  val SupportedConnectionTypes: SafeArray[String] = js.native
  /**
    * Register a connection listener.
    * @param xListener [in] a listener that will be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def addConnectionListener(xListener: XConnectionListener): Unit = js.native
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
  def connect(xConnectionContext: XCurrentContext, xAuthenticator: XAuthenticator): Unit = js.native
  /**
    * Disconnect from a mail service.
    * @throws com::sun::star::mail::MailException if errors occur during disconnecting.
    */
  def disconnect(): Unit = js.native
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
  def getCurrentConnectionContext(): XCurrentContext = js.native
  /**
    * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
    * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
    * based connection
    * @returns a sequence of supported connection types.
    */
  def getSupportedConnectionTypes(): SafeArray[String] = js.native
  /**
    * Returns whether a connection to a mail service currently exist or not.
    * @returns `TRUE` if a connection to a mail service is established.
    */
  def isConnected(): Boolean = js.native
  /**
    * Unregister a connection listener.
    * @param xListener [in] a listener that no longer need to be informed about connection events.
    * @see com.sun.star.mail.XConnectionListener
    */
  def removeConnectionListener(xListener: XConnectionListener): Unit = js.native
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
    val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener))
    __obj.asInstanceOf[XMailService]
  }
  @scala.inline
  implicit class XMailServiceOps[Self <: XMailService] (val x: Self) extends AnyVal {
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
    def setCurrentConnectionContext(value: XCurrentContext): Self = this.set("CurrentConnectionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedConnectionTypes(value: SafeArray[String]): Self = this.set("SupportedConnectionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddConnectionListener(value: XConnectionListener => Unit): Self = this.set("addConnectionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setConnect(value: (XCurrentContext, XAuthenticator) => Unit): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentConnectionContext(value: () => XCurrentContext): Self = this.set("getCurrentConnectionContext", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSupportedConnectionTypes(value: () => SafeArray[String]): Self = this.set("getSupportedConnectionTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveConnectionListener(value: XConnectionListener => Unit): Self = this.set("removeConnectionListener", js.Any.fromFunction1(value))
  }
  
}

