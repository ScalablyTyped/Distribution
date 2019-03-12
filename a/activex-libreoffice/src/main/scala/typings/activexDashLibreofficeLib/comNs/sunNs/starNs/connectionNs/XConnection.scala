package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bidirectional bytestream.
  *
  * You should additionally implement {@link XConnection2} .
  * @see XConnection2
  */
trait XConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * A unique string describing the connection.
    *
    * This string is different from the arguments to XConnection::accept() and {@link XConnector.connect()} . In general, the string contains an additional
    * handle value. For example, "socket,host=localhost,port=2002,uniqueValue=2324".
    */
  val Description: java.lang.String
  /** Immediately terminates any ongoing read or write calls. All subsequent read or write calls() */
  def close(): scala.Unit
  /** Empties all internal buffers. */
  def flush(): scala.Unit
  /**
    * A unique string describing the connection.
    *
    * This string is different from the arguments to XConnection::accept() and {@link XConnector.connect()} . In general, the string contains an additional
    * handle value. For example, "socket,host=localhost,port=2002,uniqueValue=2324".
    */
  def getDescription(): java.lang.String
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
  def read(
    aReadBytes: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    nBytesToRead: scala.Double
  ): scala.Double
  /**
    * writes the given bytesequence to the stream.
    *
    * The method blocks until the whole sequence is written.
    * @throws com::sun::star::io::IOException in case an error occurred during writing to the stream.
    */
  def write(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XConnection {
  @scala.inline
  def apply(
    Description: java.lang.String,
    acquire: () => scala.Unit,
    close: () => scala.Unit,
    flush: () => scala.Unit,
    getDescription: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    release: () => scala.Unit,
    write: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XConnection = {
    val __obj = js.Dynamic.literal(Description = Description, acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[XConnection]
  }
}

