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
    acquire: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getDescription: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    release: js.Function0[scala.Unit],
    write: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XConnection = {
    val __obj = js.Dynamic.literal(Description = Description, acquire = acquire, close = close, flush = flush, getDescription = getDescription, queryInterface = queryInterface, read = read, release = release, write = write)
  
    __obj.asInstanceOf[XConnection]
  }
}

