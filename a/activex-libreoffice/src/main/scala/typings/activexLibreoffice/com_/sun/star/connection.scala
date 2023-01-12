package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XStreamListener
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connection {
  
  /**
    * allows to accept connection attempts from another process.
    *
    * {@link Acceptor} is a delegating service. You can add further acceptors by giving them a service name com.sun.star.connection.Acceptor.xxx, where xxx
    * is the connection type used in the connection string during {@link accept()} /connect() call.
    */
  type Acceptor = XAcceptor
  
  /** Is thrown, when there is another thread already accepting on this instance. */
  type AlreadyAcceptingException = Exception
  
  /** Is thrown, when it is not possible to accept on a local resource. */
  type ConnectionSetupException = Exception
  
  /**
    * allows to establish a connection to another process.
    *
    * {@link Connector} is a delegating service. You can add further connectors by giving them a service name com.sun.star.connection.Connector.xxx, where
    * xxx is the connection type used in the connection string during accept()/connect() call.
    */
  type Connector = XConnector
  
  /** Is thrown in case no one is accepting on the specified resource. */
  type NoConnectException = Exception
  
  /**
    * This permission represents access to a network via sockets. A {@link SocketPermission} consists of a host specification and a set of actions
    * specifying ways to connect to that host. The host is specified as `;     host = (hostname | IPaddress)[:portrange];     portrange = portnumber |
    * -portnumber | portnumber-[portnumber];     ` The host is expressed as a DNS name, as a numerical IP address, or as `"localhost"` (for the local
    * machine). The wildcard `"*"` may be included once in a DNS name host specification. If it is included, it must be in the leftmost position, as in
    * `"*.sun.com"` . ;  The port or portrange is optional. A port specification of the form `"N-"` , where `N` is a port number, signifies all ports
    * numbered `N` and above, while a specification of the form `"-N"` indicates all ports numbered `N` and below.
    *
    * The possible ways to connect to the host are `accept``connect``listen``resolve`;  The `"listen"` action is only meaningful when used with
    * `"localhost"` . The `"resolve"` (resolve host/ip name service lookups) action is implied when any of the other actions are present. ;  As an example
    * of the creation and meaning of SocketPermissions, note that if the following permission `SocketPermission("foo.bar.com:7777", "connect,accept");; ` is
    * granted, it allows to connect to port 7777 on foo.bar.com, and to accept connections on that port. ;  Similarly, if the following permission
    * `SocketPermission("localhost:1024-", "accept,connect,listen");; ` is granted, it allows that code to accept connections on, connect to, or listen on
    * any port between 1024 and 65535 on the local host.
    * @since OOo 1.1.2
    */
  trait SocketPermission extends StObject {
    
    /** comma separated actions list */
    var Actions: String
    
    /** target host with optional portrange */
    var Host: String
  }
  object SocketPermission {
    
    inline def apply(Actions: String, Host: String): SocketPermission = {
      val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketPermission]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketPermission] (val x: Self) extends AnyVal {
      
      inline def setActions(value: String): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * allows to passively accept connection attempts from other processes.
    *
    * This is the counterpart to the {@link XConnector} interface.
    */
  trait XAcceptor
    extends StObject
       with XInterface {
    
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
    def accept(sConnectionDescription: String): XConnection
    
    /** pushes acceptor out of the accept-call. */
    def stopAccepting(): Unit
  }
  object XAcceptor {
    
    inline def apply(
      accept: String => XConnection,
      acquire: () => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      stopAccepting: () => Unit
    ): XAcceptor = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopAccepting = js.Any.fromFunction0(stopAccepting))
      __obj.asInstanceOf[XAcceptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XAcceptor] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String => XConnection): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setStopAccepting(value: () => Unit): Self = StObject.set(x, "stopAccepting", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A bidirectional bytestream.
    *
    * You should additionally implement {@link XConnection2} .
    * @see XConnection2
    */
  trait XConnection
    extends StObject
       with XInterface {
    
    /**
      * A unique string describing the connection.
      *
      * This string is different from the arguments to XConnection::accept() and {@link XConnector.connect()} . In general, the string contains an additional
      * handle value. For example, "socket,host=localhost,port=2002,uniqueValue=2324".
      */
    val Description: String
    
    /** Immediately terminates any ongoing read or write calls. All subsequent read or write calls() */
    def close(): Unit
    
    /** Empties all internal buffers. */
    def flush(): Unit
    
    /**
      * A unique string describing the connection.
      *
      * This string is different from the arguments to XConnection::accept() and {@link XConnector.connect()} . In general, the string contains an additional
      * handle value. For example, "socket,host=localhost,port=2002,uniqueValue=2324".
      */
    def getDescription(): String
    
    /**
      * reads a requested number of bytes from the connection.
      *
      * This method is blocking, meaning that it always returns a bytesequence with the requested number of bytes, unless it has reached end of file (which
      * often means, that {@link close()} has been called).
      *
      * please see also the readSomeBytes() method of {@link XConnection2} .
      * @param aReadBytes The buffer to receive the read bytes.
      * @param nBytesToRead The number of bytes to be read from the stream.
      * @returns The read number of bytes. The return value and the length of the returned sequence must be identical.
      * @throws com::sun::star::io::IOException in case an error occurred during reading from the stream.
      */
    def read(aReadBytes: js.Array[SeqEquiv[Double]], nBytesToRead: Double): Double
    
    /**
      * writes the given bytesequence to the stream.
      *
      * The method blocks until the whole sequence is written.
      * @throws com::sun::star::io::IOException in case an error occurred during writing to the stream.
      */
    def write(aData: SeqEquiv[Double]): Unit
  }
  object XConnection {
    
    inline def apply(
      Description: String,
      acquire: () => Unit,
      close: () => Unit,
      flush: () => Unit,
      getDescription: () => String,
      queryInterface: `type` => Any,
      read: (js.Array[SeqEquiv[Double]], Double) => Double,
      release: () => Unit,
      write: SeqEquiv[Double] => Unit
    ): XConnection = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[XConnection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XConnection] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      inline def setRead(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setWrite(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  /** {@link XConnection2} extends the `XConnection` interface with `available` and `readSomeBytes` */
  trait XConnection2
    extends StObject
       with XConnection {
    
    /** Gives the number of bytes available via `read` without blocking. */
    def available(): Double
    
    /** Blocks if no data is available otherwise reads at max **nMaxBytesToRead** but at least 1 byte. */
    def readSomeBytes(aData: js.Array[SeqEquiv[Double]], nMaxBytesToRead: Double): Double
  }
  object XConnection2 {
    
    inline def apply(
      Description: String,
      acquire: () => Unit,
      available: () => Double,
      close: () => Unit,
      flush: () => Unit,
      getDescription: () => String,
      queryInterface: `type` => Any,
      read: (js.Array[SeqEquiv[Double]], Double) => Double,
      readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
      release: () => Unit,
      write: SeqEquiv[Double] => Unit
    ): XConnection2 = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[XConnection2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XConnection2] (val x: Self) extends AnyVal {
      
      inline def setAvailable(value: () => Double): Self = StObject.set(x, "available", js.Any.fromFunction0(value))
      
      inline def setReadSomeBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = StObject.set(x, "readSomeBytes", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to add listeners to a connection.
    *
    * Maybe supported by connections returned from {@link XAcceptor.accept()} or {@link XConnector.connect()} .
    */
  trait XConnectionBroadcaster
    extends StObject
       with XInterface {
    
    /**
      * registers an object to receive events from this connection.
      *
      * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
      */
    def addStreamListener(aListener: XStreamListener): Unit
    
    /**
      * unregisters an object to receive events from this connection.
      *
      * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
      */
    def removeStreamListener(aListener: XStreamListener): Unit
  }
  object XConnectionBroadcaster {
    
    inline def apply(
      acquire: () => Unit,
      addStreamListener: XStreamListener => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeStreamListener: XStreamListener => Unit
    ): XConnectionBroadcaster = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStreamListener = js.Any.fromFunction1(addStreamListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStreamListener = js.Any.fromFunction1(removeStreamListener))
      __obj.asInstanceOf[XConnectionBroadcaster]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XConnectionBroadcaster] (val x: Self) extends AnyVal {
      
      inline def setAddStreamListener(value: XStreamListener => Unit): Self = StObject.set(x, "addStreamListener", js.Any.fromFunction1(value))
      
      inline def setRemoveStreamListener(value: XStreamListener => Unit): Self = StObject.set(x, "removeStreamListener", js.Any.fromFunction1(value))
    }
  }
  
  /** allows to actively establish an interprocess connection. */
  trait XConnector
    extends StObject
       with XInterface {
    
    /**
      * creates a new connection interprocess connection.
      *
      * Tries to connect to an {@link XAcceptor} . Behavior is unspecified if a call to connect is made when another call to connect either has not yet
      * returned or has returned successfully without raising an exception.
      * @param sConnectionDescription contains the kind of the connection plus a comma separated list of attributes, e.g., **socket,host=locahost,port=2345** fo
      * @throws ConnectionSetupException Problems during setting up the connector on client side, (e.g., Security-reasons, socket already busy .. ), or the strin
      * @throws NoConnectException Couldn't reach a server (e.g. network failure), no server is listening
      */
    def connect(sConnectionDescription: String): XConnection
  }
  object XConnector {
    
    inline def apply(
      acquire: () => Unit,
      connect: String => XConnection,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XConnector = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction1(connect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XConnector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XConnector] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: String => XConnection): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    }
  }
}
