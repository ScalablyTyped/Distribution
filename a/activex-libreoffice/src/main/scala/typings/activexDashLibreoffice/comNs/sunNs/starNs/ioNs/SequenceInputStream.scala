package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service allows to wrap a sequence of bytes with a stream object. */
trait SequenceInputStream extends XSeekableInputStream {
  /** allows to create a stream based on the sequence. */
  def createStreamFromSequence(aData: SeqEquiv[Double]): Unit
}

object SequenceInputStream {
  @scala.inline
  def apply(
    Length: Double,
    Position: Double,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    createStreamFromSequence: SeqEquiv[Double] => Unit,
    getLength: () => Double,
    getPosition: () => Double,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    seek: Double => Unit,
    skipBytes: Double => Unit
  ): SequenceInputStream = {
    val __obj = js.Dynamic.literal(Length = Length, Position = Position, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createStreamFromSequence = js.Any.fromFunction1(createStreamFromSequence), getLength = js.Any.fromFunction0(getLength), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[SequenceInputStream]
  }
}

