package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badge extends js.Object {
  /** 需要飘红的选项的索引，从0开始 */
  var index: scala.Double
  /**
  		 * 自定义飘红文案：
  		 *
  		 * 1、type为none/point/more时本文案可不填
  		 * 2、type为num时本文案为小数或<=0均不显示, >100 显示"..."
  		 */
  var text: java.lang.String
  /**
  		 * 飘红类型，支持 none（无红点）/ point（纯红点） / num（数字红点）/ text（文案红点）/ more（...）
  		 *
  		 */
  var `type`: aliDashAppLib.aliDashAppLibStrings.none | aliDashAppLib.aliDashAppLibStrings.point | aliDashAppLib.aliDashAppLibStrings.num | aliDashAppLib.aliDashAppLibStrings.text | aliDashAppLib.aliDashAppLibStrings.more | java.lang.String
}

object Badge {
  @scala.inline
  def apply(
    index: scala.Double,
    text: java.lang.String,
    `type`: aliDashAppLib.aliDashAppLibStrings.none | aliDashAppLib.aliDashAppLibStrings.point | aliDashAppLib.aliDashAppLibStrings.num | aliDashAppLib.aliDashAppLibStrings.text | aliDashAppLib.aliDashAppLibStrings.more | java.lang.String
  ): Badge = {
    val __obj = js.Dynamic.literal(index = index, text = text)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
}

