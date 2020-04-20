package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeLike extends js.Object {
  /** A Point representing the end of the Range. */
  var end: PointLike
  /** A Point representing the start of the Range. */
  var start: PointLike
}

object RangeLike {
  @scala.inline
  def apply(end: PointLike, start: PointLike): RangeLike = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeLike]
  }
}

