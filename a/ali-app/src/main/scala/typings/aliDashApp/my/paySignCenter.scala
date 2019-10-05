package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.paySignCenter")
@js.native
object paySignCenter extends js.Object {
  /**
  	 * 签约中心
  	 *
  	 * 返回码 | 含义
  	 * ------|------
  	 * 7000 | 协议签约成功
  	 * 7001 | 签约结果未知（有可能已经签约成功），请根据外部签约号查询签约状态
  	 * 7002 | 协议签约失败
  	 * 6001 | 用户中途取消
  	 * 6002 | 网络连接错误	 * @param options
  	 */
  def apply(options: PaySignCenterOptions): Unit = js.native
}

