package typings
package ablyLib.ablyMod.TypesNs

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
    val __obj = js.Dynamic.literal(all = all, messages = messages, presence = presence)
  
    __obj.asInstanceOf[StatsMessageTypes]
  }
}

