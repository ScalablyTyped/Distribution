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
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setEncoding: js.Function1[java.lang.String, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    writeString: js.Function1[java.lang.String, scala.Unit]
  ): XTextOutputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("closeOutput")(closeOutput)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setEncoding")(setEncoding)
    __obj.updateDynamic("writeBytes")(writeBytes)
    __obj.updateDynamic("writeString")(writeString)
    __obj.asInstanceOf[XTextOutputStream]
  }
}

