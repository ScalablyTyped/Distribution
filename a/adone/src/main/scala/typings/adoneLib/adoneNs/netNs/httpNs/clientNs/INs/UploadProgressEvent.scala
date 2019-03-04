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
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable, loaded = loaded, total = total)
  
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

