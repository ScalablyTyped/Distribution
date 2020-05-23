package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object io {
  /** is thrown when a client tries to connect to a resource to which they are already connected. */
  type AlreadyConnectedException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /**
    * is thrown by instances which need to buffer data.
    *
    * It indicates that not enough system resources are available for extending the buffer. (May also indicate that the internal buffer has grown to a
    * larger size than 2G. Some current implementations do not support larger buffers.)
    */
  type BufferSizeExceededException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /**
    * Signals that an error occurred while attempting to connect a socket to a remote address and port. Typically, the connection was refused remotely
    * (e.g., no process is listening on the remote address/port).
    */
  type ConnectException = typings.activexLibreoffice.com_.sun.star.io.SocketException
  /** is thrown when an input or output error has occurred. */
  type IOException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * Signals that an error occurred while attempting to connect a socket to a remote address and port. Typically, the remote host cannot be reached because
    * of an intervening firewall, or if an intermediate router is down.
    */
  type NoRouteToHostException = typings.activexLibreoffice.com_.sun.star.io.SocketException
  /** is thrown when a read/write operation is tried on an instance that has not been chained properly. */
  type NotConnectedException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /**
    * the implementation of an output stream and an input stream.
    *
    * All data written through the outputstream is buffered until it is read again from the input stream. Often two different threads access input and
    * outputstream.
    *
    * With the pipe-service, an outputstream can be converted into an input stream at the cost of an additional buffer.
    */
  type Pipe = typings.activexLibreoffice.com_.sun.star.io.XPipe
  /** This service allows to wrap a sequence of bytes with a output stream object. */
  type SequenceOutputStream = typings.activexLibreoffice.com_.sun.star.io.XSequenceOutputStream
  /** Thrown to indicate that there is an error in the underlying protocol, such as a TCP error. */
  type SocketException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /** This service allows to get access to temp files. */
  type TempFile = typings.activexLibreoffice.com_.sun.star.io.XTempFile
  /**
    * provides functionality to read text data from a {@link com.sun.star.io.XInputStream} that initially has to be passed to the method {@link
    * XActiveDataSink.setInputStream()} .
    *
    * For details about the text functionality see {@link com.sun.star.io.XTextInputStream} .
    */
  type TextInputStream = typings.activexLibreoffice.com_.sun.star.io.XTextInputStream2
  /**
    * provides functionality to write text data to a {@link com.sun.star.io.XOutputStream} that initially has to be passed to the method {@link
    * XActiveDataSource.setOutputStream()} .
    *
    * For details about the text functionality see {@link com.sun.star.io.XTextOutputStream} .
    */
  type TextOutputStream = typings.activexLibreoffice.com_.sun.star.io.XTextOutputStream2
  /** is thrown when the `EOF` is reached during reading a datatype ( `long` , `string` , etc.). */
  type UnexpectedEOFException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /** is thrown when the IP address of a host could not be determined. */
  type UnknownHostException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /** is thrown when inconsistent data comes up while reading a complex data type ( `string` or object). */
  type WrongFormatException = typings.activexLibreoffice.com_.sun.star.io.IOException
}
