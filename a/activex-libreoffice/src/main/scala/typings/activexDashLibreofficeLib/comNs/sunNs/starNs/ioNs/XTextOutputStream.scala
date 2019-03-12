package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to write strings to a stream using a special character encoding.
  *
  * This interfaces allows to write strings to a stream. The character encoding to be used can be set by {@link setEncoding()} . Default encoding is
  * "utf8".
  */
trait XTextOutputStream extends XOutputStream {
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: java.lang.String): scala.Unit
  /**
    * writes a string to the stream using the encoding defined by {@link setEncoding()} .
    *
    * Line breaks or delimiters that may be necessary to support {@link XTextInputStream.readLine()} and {@link XTextInputStream.readString()} have to be
    * added manually to the parameter string.
    * @see setEncoding
    * @see XTextInputStream.readLine
    * @see XTextInputStream.readString
    */
  def writeString(aString: java.lang.String): scala.Unit
}

object XTextOutputStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setEncoding: java.lang.String => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    writeString: java.lang.String => scala.Unit
  ): XTextOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), writeBytes = js.Any.fromFunction1(writeBytes), writeString = js.Any.fromFunction1(writeString))
  
    __obj.asInstanceOf[XTextOutputStream]
  }
}

