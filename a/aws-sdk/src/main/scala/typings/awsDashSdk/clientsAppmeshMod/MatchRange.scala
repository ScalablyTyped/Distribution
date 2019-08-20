package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchRange extends js.Object {
  /**
    * The end of the range.
    */
  var end: Long
  /**
    * The start of the range.
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

