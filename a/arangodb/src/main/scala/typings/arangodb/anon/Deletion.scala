package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deletion extends js.Object {
  var count: Double
  var deletion: Double
  var size: Double
}

object Deletion {
  @scala.inline
  def apply(count: Double, deletion: Double, size: Double): Deletion = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], deletion = deletion.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletion]
  }
}

