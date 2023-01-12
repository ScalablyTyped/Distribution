package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read machine-independent simple data types from a stream.
  * @see com.sun.star.io.XDataOutputStream
  */
trait XDataInputStream
  extends StObject
     with XInputStream {
  
  /** reads in a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def readBoolean(): Double
  
  /** reads an 8-bit byte. */
  def readByte(): Double
  
  /** reads a 16-bit unicode character. */
  def readChar(): String
  
  /** reads a 64-bit IEEE double. */
  def readDouble(): Double
  
  /** reads a 32-bit IEEE float. */
  def readFloat(): Double
  
  /** reads a 64-bit big endian integer. */
  def readHyper(): Double
  
  /** reads a 32-bit big endian integer. */
  def readLong(): Double
  
  /** reads a 16-bit big endian integer. */
  def readShort(): Double
  
  /** reads a string of UTF encoded characters. */
  def readUTF(): String
}
object XDataInputStream {
  
  inline def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    queryInterface: `type` => Any,
    readBoolean: () => Double,
    readByte: () => Double,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: () => String,
    readDouble: () => Double,
    readFloat: () => Double,
    readHyper: () => Double,
    readLong: () => Double,
    readShort: () => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: () => String,
    release: () => Unit,
    skipBytes: Double => Unit
  ): XDataInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XDataInputStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataInputStream] (val x: Self) extends AnyVal {
    
    inline def setReadBoolean(value: () => Double): Self = StObject.set(x, "readBoolean", js.Any.fromFunction0(value))
    
    inline def setReadByte(value: () => Double): Self = StObject.set(x, "readByte", js.Any.fromFunction0(value))
    
    inline def setReadChar(value: () => String): Self = StObject.set(x, "readChar", js.Any.fromFunction0(value))
    
    inline def setReadDouble(value: () => Double): Self = StObject.set(x, "readDouble", js.Any.fromFunction0(value))
    
    inline def setReadFloat(value: () => Double): Self = StObject.set(x, "readFloat", js.Any.fromFunction0(value))
    
    inline def setReadHyper(value: () => Double): Self = StObject.set(x, "readHyper", js.Any.fromFunction0(value))
    
    inline def setReadLong(value: () => Double): Self = StObject.set(x, "readLong", js.Any.fromFunction0(value))
    
    inline def setReadShort(value: () => Double): Self = StObject.set(x, "readShort", js.Any.fromFunction0(value))
    
    inline def setReadUTF(value: () => String): Self = StObject.set(x, "readUTF", js.Any.fromFunction0(value))
  }
}
