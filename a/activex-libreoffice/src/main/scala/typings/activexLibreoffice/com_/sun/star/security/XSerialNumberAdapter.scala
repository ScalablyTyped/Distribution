package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Certificate Serial Number Converter
  *
  * This interface converts a certificate serial number to and from a string
  */
@js.native
trait XSerialNumberAdapter extends XInterface {
  
  /** Convert the SerialNumber to a sequence */
  def toSequence(SerialNumber: String): SafeArray[Double] = js.native
  
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: SeqEquiv[Double]): String = js.native
}
object XSerialNumberAdapter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    toSequence: String => SafeArray[Double],
    toString_ : SeqEquiv[Double] => String
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toSequence = js.Any.fromFunction1(toSequence))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
  
  @scala.inline
  implicit class XSerialNumberAdapterMutableBuilder[Self <: XSerialNumberAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToSequence(value: String => SafeArray[Double]): Self = StObject.set(x, "toSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToString_(value: SeqEquiv[Double] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
