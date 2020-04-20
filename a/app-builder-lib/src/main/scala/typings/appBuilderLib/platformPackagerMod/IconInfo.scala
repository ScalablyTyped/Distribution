package typings.appBuilderLib.platformPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconInfo extends js.Object {
  var file: String
  var size: Double
}

object IconInfo {
  @scala.inline
  def apply(file: String, size: Double): IconInfo = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconInfo]
  }
}

