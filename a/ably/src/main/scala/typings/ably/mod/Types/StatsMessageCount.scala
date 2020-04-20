package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsMessageCount extends js.Object {
  var count: Double
  var data: Double
}

object StatsMessageCount {
  @scala.inline
  def apply(count: Double, data: Double): StatsMessageCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsMessageCount]
  }
}

