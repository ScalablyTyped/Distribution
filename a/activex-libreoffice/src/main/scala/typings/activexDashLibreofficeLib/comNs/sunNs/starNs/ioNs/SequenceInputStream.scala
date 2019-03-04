package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service allows to wrap a sequence of bytes with a stream object. */
trait SequenceInputStream extends XSeekableInputStream {
  /** allows to create a stream based on the sequence. */
  def createStreamFromSequence(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object SequenceInputStream {
  @scala.inline
  def apply(
    Length: scala.Double,
    Position: scala.Double,
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    createStreamFromSequence: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    getLength: js.Function0[scala.Double],
    getPosition: js.Function0[scala.Double],
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
    seek: js.Function1[scala.Double, scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): SequenceInputStream = {
    val __obj = js.Dynamic.literal(Length = Length, Position = Position, acquire = acquire, available = available, closeInput = closeInput, createStreamFromSequence = createStreamFromSequence, getLength = getLength, getPosition = getPosition, queryInterface = queryInterface, readBytes = readBytes, readSomeBytes = readSomeBytes, release = release, seek = seek, skipBytes = skipBytes)
  
    __obj.asInstanceOf[SequenceInputStream]
  }
}

