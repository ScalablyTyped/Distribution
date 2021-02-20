package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to read strings from a stream.
  *
  * This interfaces allows to read strings separated by delimiters and to read lines. The character encoding to be used can be set by {@link
  * setEncoding()} . Default encoding is "utf8".
  */
@js.native
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
  def isEOF(): Boolean = js.native
  
  /**
    * reads text until a line break (CR, LF, or CR/LF) or EOF is found and returns it as string (without CR, LF).
    *
    * The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this method an
    * empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readLine(): String = js.native
  
  /**
    * reads text until one of the given delimiter characters or EOF is found and returns it as string (without delimiter).
    *
    * **Important:** CR/LF is not used as default delimiter! So if no delimiter is defined or none of the delimiters is found, the stream will be read to
    * EOF. The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this
    * method an empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readString(Delimiters: SeqEquiv[String], bRemoveDelimiter: Boolean): String = js.native
  
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: String): Unit = js.native
}
object XTextInputStream {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    isEOF: () => Boolean,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readLine: () => String,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readString: (SeqEquiv[String], Boolean) => String,
    release: () => Unit,
    setEncoding: String => Unit,
    skipBytes: Double => Unit
  ): XTextInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), isEOF = js.Any.fromFunction0(isEOF), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = js.Any.fromFunction0(readLine), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XTextInputStream]
  }
  
  @scala.inline
  implicit class XTextInputStreamMutableBuilder[Self <: XTextInputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEOF(value: () => Boolean): Self = StObject.set(x, "isEOF", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadLine(value: () => String): Self = StObject.set(x, "readLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadString(value: (SeqEquiv[String], Boolean) => String): Self = StObject.set(x, "readString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEncoding(value: String => Unit): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
  }
}
