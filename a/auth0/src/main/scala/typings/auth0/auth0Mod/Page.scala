package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(length = length, limit = limit, start = start, total = total)
  
    __obj.asInstanceOf[Page]
  }
}

