package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressEvent extends js.Object {
  var lengthComputable: scala.Boolean
  var loaded: scala.Double
  var total: scala.Double
}

object UploadProgressEvent {
  @scala.inline
  def apply(lengthComputable: scala.Boolean, loaded: scala.Double, total: scala.Double): UploadProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lengthComputable")(lengthComputable)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

