package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsConnectionTypes extends js.Object {
  var all: StatsResourceCount
  var plain: StatsResourceCount
  var tls: StatsResourceCount
}

object StatsConnectionTypes {
  @scala.inline
  def apply(all: StatsResourceCount, plain: StatsResourceCount, tls: StatsResourceCount): StatsConnectionTypes = {
    val __obj = js.Dynamic.literal(all = all, plain = plain, tls = tls)
  
    __obj.asInstanceOf[StatsConnectionTypes]
  }
}

