package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchRange extends js.Object {
  /**
    * The end of the range.
    */
  var end: Long = js.native
  /**
    * The start of the range.
    */
  var start: Long = js.native
}

object MatchRange {
  @scala.inline
  def apply(end: Long, start: Long): MatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatchRange]
  }
}

