package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchRange extends js.Object {
  /**
    * End of the range value.
    */
  var end: Long
  /**
    * Start of the range value.
    */
  var start: Long
}

object MatchRange {
  @scala.inline
  def apply(end: Long, start: Long): MatchRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[MatchRange]
  }
}

