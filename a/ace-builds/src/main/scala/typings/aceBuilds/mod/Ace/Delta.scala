package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.insert
import typings.aceBuilds.aceBuildsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delta extends js.Object {
  var action: insert | remove = js.native
  var end: Point = js.native
  var lines: js.Array[String] = js.native
  var start: Point = js.native
}

object Delta {
  @scala.inline
  def apply(action: insert | remove, end: Point, lines: js.Array[String], start: Point): Delta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  implicit class DeltaOps[Self <: Delta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: insert | remove): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

