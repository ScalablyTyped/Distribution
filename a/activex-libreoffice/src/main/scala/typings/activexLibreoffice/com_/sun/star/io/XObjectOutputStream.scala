package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * stores {@link XPersistObject} implementations into the stream
  *
  * An implementation of the type {@link XPersistObject} uses this interface to write its internal state into a stream. Have a look there for the
  * explanation of the concept.
  * @see com.sun.star.io.XPersistObject
  */
trait XObjectOutputStream
  extends StObject
     with XDataOutputStream {
  
  /**
    * writes an object to the stream.
    * @param Object the object, which shall serialize itself into the stream.
    */
  def writeObject(Object: XPersistObject): Unit
}
object XObjectOutputStream {
  
  inline def apply(
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    writeBoolean: Boolean => Unit,
    writeByte: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeChar: String => Unit,
    writeDouble: Double => Unit,
    writeFloat: Double => Unit,
    writeHyper: Double => Unit,
    writeLong: Double => Unit,
    writeObject: XPersistObject => Unit,
    writeShort: Double => Unit,
    writeUTF: String => Unit
  ): XObjectOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[XObjectOutputStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XObjectOutputStream] (val x: Self) extends AnyVal {
    
    inline def setWriteObject(value: XPersistObject => Unit): Self = StObject.set(x, "writeObject", js.Any.fromFunction1(value))
  }
}
