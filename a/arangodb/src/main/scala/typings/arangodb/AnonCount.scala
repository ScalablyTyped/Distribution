package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var size: Double
}

object AnonCount {
  @scala.inline
  def apply(count: Double, size: Double): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCount]
  }
}

