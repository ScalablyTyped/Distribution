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
  def toSequence(SerialNumber: java.lang.String): activexDashInteropLib.SafeArray[scala.Double]
  /** Convert the SerialNumber to a string */
  def toString(SerialNumber: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): java.lang.String
}

object XSerialNumberAdapter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    toSequence: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[scala.Double]],
    toString: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String]
  ): XSerialNumberAdapter = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, toSequence = toSequence, toString = toString)
  
    __obj.asInstanceOf[XSerialNumberAdapter]
  }
}

