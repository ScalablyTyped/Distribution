package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoStatusChangedEvent extends js.Object {
  var path: String
  /**
    *  This value can be passed to ::isStatusModified or ::isStatusNew to get more
    *  information.
    */
  var pathStatus: Double
}

object RepoStatusChangedEvent {
  @scala.inline
  def apply(path: String, pathStatus: Double): RepoStatusChangedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathStatus = pathStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepoStatusChangedEvent]
  }
}

