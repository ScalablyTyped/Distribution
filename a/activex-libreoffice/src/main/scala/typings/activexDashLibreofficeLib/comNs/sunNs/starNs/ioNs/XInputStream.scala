package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the basic interface to read data from a stream.
  *
  * See the [streaming document]{@link url="http://udk.openoffice.org/common/man/concept/streams.html"} for further information on chaining and piping
  * streams.
  */
trait XInputStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * states how many bytes can be read or skipped without blocking.
    *
    * Note: This method offers no information on whether the EOF has been reached.
    */
  def available(): scala.Double
  /**
    * closes the stream.
    *
    * Users must close the stream explicitly when no further reading should be done. (There may exist ring references to chained objects that can only be
    * released during this call. Thus not calling this method would result in a leak of memory or external resources.)
    */
  def closeInput(): scala.Unit
  /**
    * reads the specified number of bytes in the given sequence.
    *
    * The return value specifies the number of bytes which have been put into the sequence. A difference between **nBytesToRead** and the return value
    * indicates that EOF has been reached. This means that the method blocks until the specified number of bytes are available or the EOF is reached.
    * @param aData after the call, the byte sequence contains the requested number of bytes (or less as a sign of EOF). ;  C++ only : Note that for unbridged
    * @param nBytesToRead the total number of bytes to read
    */
  def readBytes(
    aData: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    nBytesToRead: scala.Double
  ): scala.Double
  /**
    * reads the available number of bytes, at maximum **nMaxBytesToRead** .
    *
    * This method is very similar to the readBytes method, except that it has different blocking behaviour. The method blocks as long as at least 1 byte is
    * available or EOF has been reached. EOF has only been reached, when the method returns 0 and the corresponding byte sequence is empty. Otherwise, after
    * the call, aData contains the available, but no more than nMaxBytesToRead, bytes.
    * @param aData contains the data read from the stream.
    * @param nMaxBytesToRead The maximum number of bytes to be read from this stream during the call.
    * @see com.sun.star.io.XInputStream.readBytes
    */
  def readSomeBytes(
    aData: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    nMaxBytesToRead: scala.Double
  ): scala.Double
  /**
    * skips the next **nBytesToSkip** bytes (must be positive).
    *
    * It is up to the implementation whether this method is blocking the thread or not.
    * @param nBytesToSkip number of bytes to skip
    */
  def skipBytes(nBytesToSkip: scala.Double): scala.Unit
}

object XInputStream {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    release: js.Function0[scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): XInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire, available = available, closeInput = closeInput, queryInterface = queryInterface, readBytes = readBytes, readSomeBytes = readSomeBytes, release = release, skipBytes = skipBytes)
  
    __obj.asInstanceOf[XInputStream]
  }
}

