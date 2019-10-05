package typings.aliDashApp.my

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.createAnimation")
@js.native
object createAnimation extends js.Object {
  /**
  	 * 创建动画实例 animation。调用实例的方法来描述动画，最后通过动画实例的export方法将动画数据导出并传递给组件的animation属性。
  	 *
  	 * 注意: export 方法每次调用后会清掉之前的动画操作
  	 */
  def apply(options: Partial[CreateAnimationOptions]): Animation = js.native
}

