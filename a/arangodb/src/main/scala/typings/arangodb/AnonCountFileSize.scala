package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountFileSize extends js.Object {
  var count: Double
  var fileSize: Double
}

object AnonCountFileSize {
  @scala.inline
  def apply(count: Double, fileSize: Double): AnonCountFileSize = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCountFileSize]
  }
}

