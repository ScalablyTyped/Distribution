package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style service {@link TextInputStream} .
  * @since LibreOffice 4.1
  */
trait XTextInputStream2
  extends StObject
     with XTextInputStream
     with XActiveDataSink
object XTextInputStream2 {
  
  inline def apply(
    InputStream: XInputStream,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    getInputStream: () => XInputStream,
    isEOF: () => Boolean,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readLine: () => String,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readString: (SeqEquiv[String], Boolean) => String,
    release: () => Unit,
    setEncoding: String => Unit,
    setInputStream: XInputStream => Unit,
    skipBytes: Double => Unit
  ): XTextInputStream2 = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), getInputStream = js.Any.fromFunction0(getInputStream), isEOF = js.Any.fromFunction0(isEOF), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = js.Any.fromFunction0(readLine), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), setInputStream = js.Any.fromFunction1(setInputStream), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XTextInputStream2]
  }
}
