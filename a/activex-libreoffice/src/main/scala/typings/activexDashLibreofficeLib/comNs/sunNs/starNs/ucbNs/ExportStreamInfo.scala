package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** information needed to export an object in mbx format (supplying an output stream to export into). */
trait ExportStreamInfo extends js.Object {
  /** tries hard to make message (document) bodies available for export. */
  var ForceBodies: scala.Boolean
  /** the output stream to export into. */
  var Target: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream
}

object ExportStreamInfo {
  @scala.inline
  def apply(
    ForceBodies: scala.Boolean,
    Target: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream
  ): ExportStreamInfo = {
    val __obj = js.Dynamic.literal(ForceBodies = ForceBodies, Target = Target)
  
    __obj.asInstanceOf[ExportStreamInfo]
  }
}

