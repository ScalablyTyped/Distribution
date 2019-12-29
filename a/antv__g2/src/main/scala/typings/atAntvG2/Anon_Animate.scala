package typings.atAntvG2

import typings.atAntvG2.atAntvG2Strings.multiple
import typings.atAntvG2.atAntvG2Strings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animate extends js.Object {
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

object Anon_Animate {
  @scala.inline
  def apply(animate: Boolean, cancelable: Boolean, mode: single | multiple): Anon_Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Animate]
  }
}

