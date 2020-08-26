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
  @scala.inline
  implicit class MatchRangeOps[Self <: MatchRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Long): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Long): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

