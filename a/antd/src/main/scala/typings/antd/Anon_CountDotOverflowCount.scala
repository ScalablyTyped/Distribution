package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountDotOverflowCount extends js.Object {
  var count: Requireable[ReactNodeLike]
  var dot: Requireable[Boolean]
  var overflowCount: Requireable[Double]
  var showZero: Requireable[Boolean]
}

object Anon_CountDotOverflowCount {
  @scala.inline
  def apply(
    count: Requireable[ReactNodeLike],
    dot: Requireable[Boolean],
    overflowCount: Requireable[Double],
    showZero: Requireable[Boolean]
  ): Anon_CountDotOverflowCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], showZero = showZero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CountDotOverflowCount]
  }
}

