package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corner extends js.Object {
  var corner: Boolean
  var dot: Boolean
  var overflowCount: Double
  var size: String
}

object Corner {
  @scala.inline
  def apply(corner: Boolean, dot: Boolean, overflowCount: Double, size: String): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
}

