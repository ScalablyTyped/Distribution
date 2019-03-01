package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoStatusChangedEvent extends js.Object {
  var path: java.lang.String
  /**
    *  This value can be passed to ::isStatusModified or ::isStatusNew to get more
    *  information.
    */
  var pathStatus: scala.Double
}

object RepoStatusChangedEvent {
  @scala.inline
  def apply(path: java.lang.String, pathStatus: scala.Double): RepoStatusChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("pathStatus")(pathStatus)
    __obj.asInstanceOf[RepoStatusChangedEvent]
  }
}

