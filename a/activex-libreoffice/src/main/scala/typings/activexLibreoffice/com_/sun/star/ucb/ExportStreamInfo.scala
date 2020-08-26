package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** information needed to export an object in mbx format (supplying an output stream to export into). */
@js.native
trait ExportStreamInfo extends js.Object {
  /** tries hard to make message (document) bodies available for export. */
  var ForceBodies: Boolean = js.native
  /** the output stream to export into. */
  var Target: XOutputStream = js.native
}

object ExportStreamInfo {
  @scala.inline
  def apply(ForceBodies: Boolean, Target: XOutputStream): ExportStreamInfo = {
    val __obj = js.Dynamic.literal(ForceBodies = ForceBodies.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportStreamInfo]
  }
  @scala.inline
  implicit class ExportStreamInfoOps[Self <: ExportStreamInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForceBodies(value: Boolean): Self = this.set("ForceBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: XOutputStream): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
  
}

