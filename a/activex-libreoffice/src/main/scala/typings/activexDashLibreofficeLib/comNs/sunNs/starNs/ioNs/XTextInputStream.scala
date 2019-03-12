package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to read strings from a stream.
  *
  * This interfaces allows to read strings separated by delimiters and to read lines. The character encoding to be used can be set by {@link
  * setEncoding()} . Default encoding is "utf8".
  */
trait XTextInputStream extends XInputStream {
  /**
    * Returns the EOF status.
    *
    * This method has to be used to detect if the end of the stream is reached.
    *
    * **Important:** This cannot be detected by asking for an empty string because that can be a valid return value of {@link readLine()} (if the line is
    * empty) and {@link readString()} (if a delimiter is directly followed by the next one).
    * @returns `TRUE` , if the end of file is reached, so that no next string can be read. `FALSE` otherwise
    */
  def isEOF(): scala.Boolean
  /**
    * reads text until a line break (CR, LF, or CR/LF) or EOF is found and returns it as string (without CR, LF).
    *
    * The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this method an
    * empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readLine(): java.lang.String
  /**
    * reads text until one of the given delimiter characters or EOF is found and returns it as string (without delimiter).
    *
    * **Important:** CR/LF is not used as default delimiter! So if no delimiter is defined or none of the delimiters is found, the stream will be read to
    * EOF. The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this
    * method an empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readString(
    Delimiters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    bRemoveDelimiter: scala.Boolean
  ): java.lang.String
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: java.lang.String): scala.Unit
}

object XTextInputStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    isEOF: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readLine: () => java.lang.String,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readString: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Boolean) => java.lang.String,
    release: () => scala.Unit,
    setEncoding: java.lang.String => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): XTextInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), isEOF = js.Any.fromFunction0(isEOF), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = js.Any.fromFunction0(readLine), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[XTextInputStream]
  }
}

