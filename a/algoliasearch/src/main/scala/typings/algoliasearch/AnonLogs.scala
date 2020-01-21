package typings.algoliasearch

import typings.algoliasearch.mod.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogs extends js.Object {
  var logs: js.Array[Log]
}

object AnonLogs {
  @scala.inline
  def apply(logs: js.Array[Log]): AnonLogs = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLogs]
  }
}

