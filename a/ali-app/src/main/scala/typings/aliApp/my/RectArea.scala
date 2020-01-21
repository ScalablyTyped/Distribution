package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 节点查询 https://docs.alipay.com/mini/api/selector-query
trait RectArea extends js.Object {
  /** 节点的下边界坐标 */
  var bottom: Double
  /** 节点的高度 */
  var height: Double
  /** 节点的左边界坐标 */
  var left: Double
  /** 节点的右边界坐标 */
  var right: Double
  /** 节点的上边界坐标 */
  var top: Double
  /** 节点的宽度 */
  var width: Double
}

object RectArea {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): RectArea = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RectArea]
  }
}

