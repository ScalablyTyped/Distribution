package typings.activexDashLibreoffice.comNs.sunNs.starNs.connectionNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bidirectional bytestream.
  *
  * You should additionally implement {@link XConnection2} .
  * @see XConnection2
  */
trait XConnection extends XInterface {
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
  @scala.inline
  def apply(
    Description: String,
    acquire: () => Unit,
    close: () => Unit,
    flush: () => Unit,
    getDescription: () => String,
    queryInterface: `type` => js.Any,
    read: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    write: SeqEquiv[Double] => Unit
  ): XConnection = {
    val __obj = js.Dynamic.literal(Description = Description, acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[XConnection]
  }
}

