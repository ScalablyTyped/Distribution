package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var size: Double
}

object Count {
  @scala.inline
  def apply(count: Double, size: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

