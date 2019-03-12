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
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    createStreamFromSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    getLength: () => scala.Double,
    getPosition: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    release: () => scala.Unit,
    seek: scala.Double => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): SequenceInputStream = {
    val __obj = js.Dynamic.literal(Length = Length, Position = Position, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createStreamFromSequence = js.Any.fromFunction1(createStreamFromSequence), getLength = js.Any.fromFunction0(getLength), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[SequenceInputStream]
  }
}

