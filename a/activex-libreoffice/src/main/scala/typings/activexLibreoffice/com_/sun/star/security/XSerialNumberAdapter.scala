package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Certificate Serial Number Converter
  *
  * This interface converts a certificate serial number to and from a string
  */
trait XSerialNumberAdapter
  extends StObject
     with XInterface {
  
  /** Convert the SerialNumber to a sequence */
  def toSequence(SerialNumber: String): SafeArray[Double]
  
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: SeqEquiv[Double]): String
}
object XSerialNumberAdapter {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    toSequence: String => SafeArray[Double],
    toString_ : SeqEquiv[Double] => String
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toSequence = js.Any.fromFunction1(toSequence))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSerialNumberAdapter] (val x: Self) extends AnyVal {
    
    inline def setToSequence(value: String => SafeArray[Double]): Self = StObject.set(x, "toSequence", js.Any.fromFunction1(value))
    
    inline def setToString_(value: SeqEquiv[Double] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
