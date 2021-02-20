package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to write machine-independent simple data types to a stream.
  * @see com.sun.star.io.XDataInputStream
  */
@js.native
trait XDataOutputStream extends XOutputStream {
  
  /** writes a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def writeBoolean(Value: Boolean): Unit = js.native
  
  /** writes an 8-bit byte. */
  def writeByte(Value: Double): Unit = js.native
  
  /** writes a 16-bit character. */
  def writeChar(Value: String): Unit = js.native
  
  /** writes a 64-bit IEEE double. */
  def writeDouble(Value: Double): Unit = js.native
  
  /** writes a 32-bit IEEE float. */
  def writeFloat(Value: Double): Unit = js.native
  
  /** writes a 64-bit big endian integer. */
  def writeHyper(Value: Double): Unit = js.native
  
  /** writes a 32-bit big endian integer. */
  def writeLong(Value: Double): Unit = js.native
  
  /** writes a 16-bit big endian integer. */
  def writeShort(Value: Double): Unit = js.native
  
  /** writes a string in UTF format. */
  def writeUTF(Value: String): Unit = js.native
}
object XDataOutputStream {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeBoolean: Boolean => Unit,
    writeByte: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeChar: String => Unit,
    writeDouble: Double => Unit,
    writeFloat: Double => Unit,
    writeHyper: Double => Unit,
    writeLong: Double => Unit,
    writeShort: Double => Unit,
    writeUTF: String => Unit
  ): XDataOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[XDataOutputStream]
  }
  
  @scala.inline
  implicit class XDataOutputStreamMutableBuilder[Self <: XDataOutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWriteBoolean(value: Boolean => Unit): Self = StObject.set(x, "writeBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteByte(value: Double => Unit): Self = StObject.set(x, "writeByte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteChar(value: String => Unit): Self = StObject.set(x, "writeChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteDouble(value: Double => Unit): Self = StObject.set(x, "writeDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteFloat(value: Double => Unit): Self = StObject.set(x, "writeFloat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteHyper(value: Double => Unit): Self = StObject.set(x, "writeHyper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteLong(value: Double => Unit): Self = StObject.set(x, "writeLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteShort(value: Double => Unit): Self = StObject.set(x, "writeShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteUTF(value: String => Unit): Self = StObject.set(x, "writeUTF", js.Any.fromFunction1(value))
  }
}
