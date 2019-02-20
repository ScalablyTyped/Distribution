package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to the written bytes */
trait XSequenceOutputStream extends XOutputStream {
  /** allows to get access to the written data */
  val WrittenBytes: activexDashInteropLib.SafeArray[scala.Double]
  /** allows to get access to the written data */
  def getWrittenBytes(): activexDashInteropLib.SafeArray[scala.Double]
}

