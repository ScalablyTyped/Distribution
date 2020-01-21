package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.reportAnalytics")
@js.native
object reportAnalytics extends js.Object {
  //#region 自定义分析 https://docs.alipay.com/mini/api/report
  /**
  	 * 自定义分析数据的上报接口。使用前需要在小程序管理后台的事件管理中新建事件，并配置好事件名和字段。
  	 *
  	 * @param eventName 自定义事件名，需申请
  	 * @param data 上报的数据
  	 */
  def apply(eventName: String, data: js.Any): Unit = js.native
}

