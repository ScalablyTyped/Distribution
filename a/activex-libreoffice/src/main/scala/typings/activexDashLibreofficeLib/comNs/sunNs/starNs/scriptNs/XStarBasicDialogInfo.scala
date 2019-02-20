package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing old style basic dialog (SI controls) in binary data
  * @deprecated Deprecated
  */
trait XStarBasicDialogInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns binary data describing the SIDialog in SBX stream format */
  val Data: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  val Name: java.lang.String
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  def getName(): java.lang.String
}

