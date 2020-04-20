package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: Double
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: Double
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timeFunction: TimingFunction
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: String
}

object CreateAnimationOptions {
  @scala.inline
  def apply(delay: Double, duration: Double, timeFunction: TimingFunction, transformOrigin: String): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timeFunction = timeFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
}

