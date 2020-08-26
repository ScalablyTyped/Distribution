package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoStatusChangedEvent extends js.Object {
  var path: String = js.native
  /**
    *  This value can be passed to ::isStatusModified or ::isStatusNew to get more
    *  information.
    */
  var pathStatus: Double = js.native
}

object RepoStatusChangedEvent {
  @scala.inline
  def apply(path: String, pathStatus: Double): RepoStatusChangedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathStatus = pathStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStatusChangedEvent]
  }
  @scala.inline
  implicit class RepoStatusChangedEventOps[Self <: RepoStatusChangedEvent] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathStatus(value: Double): Self = this.set("pathStatus", value.asInstanceOf[js.Any])
  }
  
}

