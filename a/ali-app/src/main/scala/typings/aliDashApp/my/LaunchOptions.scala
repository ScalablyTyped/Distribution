package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  /**
  		 * 打开小程序的路径
  		 */
  var path: String
  /**
  		 * 打开小程序的query
  		 */
  var query: js.Object
  /**
  		 * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
  		 */
  var referrerInfo: js.Object
  /**
  		 * 来源小程序或公众号或App的 appId，详见下方说明
  		 */
  var `referrerInfo.appId`: String
  /**
  		 * 来源小程序传过来的数据，scene=1037或1038时支持
  		 */
  var `referrerInfo.extraData`: js.Object
  /**
  		 * 打开小程序的[场景值]
  		 */
  var scene: Double
  /**
  		 * shareTicket，详见 获取更多[转发信息]
  		 */
  var shareTicket: String
}

object LaunchOptions {
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: js.Object,
    `referrerInfo.appId`: String,
    `referrerInfo.extraData`: js.Object,
    scene: Double,
    shareTicket: String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path, query = query, referrerInfo = referrerInfo, scene = scene, shareTicket = shareTicket)
    __obj.updateDynamic("referrerInfo.appId")(`referrerInfo.appId`)
    __obj.updateDynamic("referrerInfo.extraData")(`referrerInfo.extraData`)
    __obj.asInstanceOf[LaunchOptions]
  }
}

