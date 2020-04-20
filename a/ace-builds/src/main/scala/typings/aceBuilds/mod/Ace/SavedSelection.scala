package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedSelection extends js.Object {
  var end: Point
  var isBackwards: Boolean
  var start: Point
}

object SavedSelection {
  @scala.inline
  def apply(end: Point, isBackwards: Boolean, start: Point): SavedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isBackwards = isBackwards.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedSelection]
  }
}

