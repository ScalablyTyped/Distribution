package typings.atom.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectHistory extends js.Object {
  var lastOpened: Date = js.native
  var paths: js.Array[String] = js.native
}

object ProjectHistory {
  @scala.inline
  def apply(lastOpened: Date, paths: js.Array[String]): ProjectHistory = {
    val __obj = js.Dynamic.literal(lastOpened = lastOpened.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectHistory]
  }
  @scala.inline
  implicit class ProjectHistoryOps[Self <: ProjectHistory] (val x: Self) extends AnyVal {
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
    def setLastOpened(value: Date): Self = this.set("lastOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

