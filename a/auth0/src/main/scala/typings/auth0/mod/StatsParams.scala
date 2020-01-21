package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsParams extends js.Object {
  var from: String
  var to: String
}

object StatsParams {
  @scala.inline
  def apply(from: String, to: String): StatsParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsParams]
  }
}

