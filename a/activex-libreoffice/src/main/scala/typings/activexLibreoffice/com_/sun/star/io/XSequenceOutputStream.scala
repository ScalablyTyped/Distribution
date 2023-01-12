package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface offers access to the written bytes */
trait XSequenceOutputStream
  extends StObject
     with XOutputStream {
  
  /** allows to get access to the written data */
  val WrittenBytes: SafeArray[Double]
  
  /** allows to get access to the written data */
  def getWrittenBytes(): SafeArray[Double]
}
object XSequenceOutputStream {
  
  inline def apply(
    WrittenBytes: SafeArray[Double],
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getWrittenBytes: () => SafeArray[Double],
    queryInterface: `type` => Any,
    release: () => Unit,
    writeBytes: SeqEquiv[Double] => Unit
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getWrittenBytes = js.Any.fromFunction0(getWrittenBytes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[XSequenceOutputStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSequenceOutputStream] (val x: Self) extends AnyVal {
    
    inline def setGetWrittenBytes(value: () => SafeArray[Double]): Self = StObject.set(x, "getWrittenBytes", js.Any.fromFunction0(value))
    
    inline def setWrittenBytes(value: SafeArray[Double]): Self = StObject.set(x, "WrittenBytes", value.asInstanceOf[js.Any])
  }
}
