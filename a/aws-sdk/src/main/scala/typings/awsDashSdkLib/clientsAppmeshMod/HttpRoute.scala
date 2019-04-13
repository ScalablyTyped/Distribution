package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: HttpRouteAction
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: HttpRouteMatch
}

object HttpRoute {
  @scala.inline
  def apply(action: HttpRouteAction, `match`: HttpRouteMatch): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[HttpRoute]
  }
}

