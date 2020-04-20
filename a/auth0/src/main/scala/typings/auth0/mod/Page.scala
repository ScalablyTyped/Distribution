package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var length: Double
  var limit: Double
  var start: Double
  var total: Double
}

object Page {
  @scala.inline
  def apply(length: Double, limit: Double, start: Double, total: Double): Page = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

