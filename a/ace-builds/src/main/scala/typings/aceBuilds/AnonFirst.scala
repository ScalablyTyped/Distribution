package typings.aceBuilds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirst extends js.Object {
  var first: Double
  var last: Double
}

object AnonFirst {
  @scala.inline
  def apply(first: Double, last: Double): AnonFirst = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirst]
  }
}

