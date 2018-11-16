package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: scala.Double
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: scala.Double
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timeFunction: TimingFunction
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: java.lang.String
}

