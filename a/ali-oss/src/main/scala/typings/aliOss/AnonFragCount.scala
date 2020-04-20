package typings.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFragCount extends js.Object {
  var FragCount: Double
  var FragDuration: Double
  var PlaylistName: String
  var Type: String
}

object AnonFragCount {
  @scala.inline
  def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): AnonFragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount.asInstanceOf[js.Any], FragDuration = FragDuration.asInstanceOf[js.Any], PlaylistName = PlaylistName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFragCount]
  }
}

