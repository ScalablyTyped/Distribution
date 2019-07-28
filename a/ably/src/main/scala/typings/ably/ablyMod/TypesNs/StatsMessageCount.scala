package typings.ably.ablyMod.TypesNs

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
    val __obj = js.Dynamic.literal(count = count, data = data)
  
    __obj.asInstanceOf[StatsMessageCount]
  }
}

