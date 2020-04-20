package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeletion extends js.Object {
  var count: Double
  var deletion: Double
  var size: Double
}

object AnonDeletion {
  @scala.inline
  def apply(count: Double, deletion: Double, size: Double): AnonDeletion = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], deletion = deletion.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeletion]
  }
}

