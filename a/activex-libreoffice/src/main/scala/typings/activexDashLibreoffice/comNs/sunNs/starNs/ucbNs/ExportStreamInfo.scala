package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** information needed to export an object in mbx format (supplying an output stream to export into). */
trait ExportStreamInfo extends js.Object {
  /** tries hard to make message (document) bodies available for export. */
  var ForceBodies: Boolean
  /** the output stream to export into. */
  var Target: XOutputStream
}

object ExportStreamInfo {
  @scala.inline
  def apply(ForceBodies: Boolean, Target: XOutputStream): ExportStreamInfo = {
    val __obj = js.Dynamic.literal(ForceBodies = ForceBodies, Target = Target)
  
    __obj.asInstanceOf[ExportStreamInfo]
  }
}

