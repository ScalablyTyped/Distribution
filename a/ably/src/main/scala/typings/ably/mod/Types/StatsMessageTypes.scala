package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsMessageTypes extends js.Object {
  var all: StatsMessageCount
  var messages: StatsMessageCount
  var presence: StatsMessageCount
}

object StatsMessageTypes {
  @scala.inline
  def apply(all: StatsMessageCount, messages: StatsMessageCount, presence: StatsMessageCount): StatsMessageTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsMessageTypes]
  }
}

