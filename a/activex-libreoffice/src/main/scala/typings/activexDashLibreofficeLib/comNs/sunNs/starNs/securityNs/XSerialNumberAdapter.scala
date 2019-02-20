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

