package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.createCanvasContext")
@js.native
object createCanvasContext extends js.Object {
  /**
  	 * 创建 canvas 绘图上下文
  	 *
  	 * 该绘图上下文只作用于对应 canvasId 的 <canvas/>
  	 */
  def apply(canvasId: String): ConvasContext = js.native
}

