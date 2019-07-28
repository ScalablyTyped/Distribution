package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressEvent extends js.Object {
  var lengthComputable: Boolean
  var loaded: Double
  var total: Double
}

object UploadProgressEvent {
  @scala.inline
  def apply(lengthComputable: Boolean, loaded: Double, total: Double): UploadProgressEvent = {
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable, loaded = loaded, total = total)
  
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

