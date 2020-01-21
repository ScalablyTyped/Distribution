package typings.antd

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountDotOverflowCount extends js.Object {
  var count: Requireable[ReactNodeLike]
  var dot: Requireable[Boolean]
  var overflowCount: Requireable[Double]
  var showZero: Requireable[Boolean]
}

object AnonCountDotOverflowCount {
  @scala.inline
  def apply(
    count: Requireable[ReactNodeLike],
    dot: Requireable[Boolean],
    overflowCount: Requireable[Double],
    showZero: Requireable[Boolean]
  ): AnonCountDotOverflowCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], showZero = showZero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCountDotOverflowCount]
  }
}

