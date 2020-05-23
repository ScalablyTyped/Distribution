package typings.antvG2.anon

import typings.antvG2.antvG2Strings.multiple
import typings.antvG2.antvG2Strings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animate extends js.Object {
  /**
    * 选中是否执行动画，默认执行动画
    */
  var animate: Boolean
  /**
    * 选中之后是否允许取消选中，默认允许取消选中
    */
  var cancelable: Boolean
  /**
    * 选中模式，单选、多选
    */
  var mode: single | multiple
}

object Animate {
  @scala.inline
  def apply(animate: Boolean, cancelable: Boolean, mode: single | multiple): Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
}

