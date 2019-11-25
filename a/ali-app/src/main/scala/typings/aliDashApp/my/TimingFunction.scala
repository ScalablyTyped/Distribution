package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 动画 https://docs.alipay.com/mini/api/ui-animation
/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.linear
  - typings.aliDashApp.aliDashAppStrings.ease
  - typings.aliDashApp.aliDashAppStrings.`ease-in`
  - typings.aliDashApp.aliDashAppStrings.`ease-in-out`
  - typings.aliDashApp.aliDashAppStrings.`ease-out`
  - typings.aliDashApp.aliDashAppStrings.`step-start`
  - typings.aliDashApp.aliDashAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.aliDashApp.aliDashAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.aliDashApp.aliDashAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.aliDashApp.aliDashAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.aliDashApp.aliDashAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.aliDashApp.aliDashAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.aliDashApp.aliDashAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.aliDashApp.aliDashAppStrings.`step-start` = this.cast("step-start")
}

