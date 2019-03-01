package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var length: scala.Double
  var limit: scala.Double
  var start: scala.Double
  var total: scala.Double
}

object Page {
  @scala.inline
  def apply(length: scala.Double, limit: scala.Double, start: scala.Double, total: scala.Double): Page = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Page]
  }
}

