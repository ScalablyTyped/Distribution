package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsParams extends js.Object {
  var from: java.lang.String
  var to: java.lang.String
}

object StatsParams {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): StatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[StatsParams]
  }
}

