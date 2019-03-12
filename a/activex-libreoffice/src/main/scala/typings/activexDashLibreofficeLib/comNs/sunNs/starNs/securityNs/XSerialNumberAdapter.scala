package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Certificate Serial Number Converter
  *
  * This interface converts a certificate serial number to and from a string
  */
trait XSerialNumberAdapter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Convert the SerialNumber to a sequence */
  def toSequence(SerialNumber: java.lang.String): stdLib.SafeArray[scala.Double]
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): java.lang.String
}

object XSerialNumberAdapter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    toSequence: java.lang.String => stdLib.SafeArray[scala.Double],
    toString: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => java.lang.String
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toSequence = js.Any.fromFunction1(toSequence), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
}

