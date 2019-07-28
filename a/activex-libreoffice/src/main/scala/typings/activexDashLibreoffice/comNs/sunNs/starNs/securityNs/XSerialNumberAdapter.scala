package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Certificate Serial Number Converter
  *
  * This interface converts a certificate serial number to and from a string
  */
trait XSerialNumberAdapter extends XInterface {
  /** Convert the SerialNumber to a sequence */
  def toSequence(SerialNumber: String): SafeArray[Double]
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: SeqEquiv[Double]): String
}

object XSerialNumberAdapter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    toSequence: String => SafeArray[Double],
    toString: SeqEquiv[Double] => String
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toSequence = js.Any.fromFunction1(toSequence), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
}

