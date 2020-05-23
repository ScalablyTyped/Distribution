package typings.algoliasearch.anon

import typings.algoliasearch.mod.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logs extends js.Object {
  var logs: js.Array[Log]
}

object Logs {
  @scala.inline
  def apply(logs: js.Array[Log]): Logs = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logs]
  }
}

