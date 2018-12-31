package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 系统信息 https://docs.alipay.com/mini/api/system-info
trait SystemInfo extends js.Object {
  /**
  		 * 当前运行的客户端，当前是支付宝则有效值是"alipay"
  		 */
  var app: aliDashAppLib.aliDashAppLibStrings.alipay | java.lang.String
  /**
  		 * 手机品牌
  		 */
  var brand: java.lang.String
  /**
  		 * 当前电量百分比
  		 */
  var currentBattery: java.lang.String
  /**
  		 * 用户设置字体大小
  		 */
  var fontSizeSetting: scala.Double
  /**
  		 * 支付宝设置的语言
  		 */
  var language: java.lang.String
  /**
  		 * 手机型号
  		 */
  var model: java.lang.String
  /**
  		 * 设备像素比
  		 */
  var pixelRatio: scala.Double
  /**
  		 * 系统名：Android，iOS
  		 */
  var platform: aliDashAppLib.aliDashAppLibStrings.Android | aliDashAppLib.aliDashAppLibStrings.iOS | java.lang.String
  /**
  		 * 屏幕高度
  		 */
  var screenHeight: scala.Double
  /**
  		 * 屏幕宽度
  		 */
  var screenWidth: scala.Double
  /**
  		 * 设备磁盘容量
  		 */
  var storage: java.lang.String
  /**
  		 * 系统版本
  		 */
  var system: java.lang.String
  /**
  		 * 支付宝版本号
  		 */
  var version: java.lang.String
  /**
  		 * 窗口高度
  		 */
  var windowHeight: scala.Double
  /**
  		 * 窗口宽度
  		 */
  var windowWidth: scala.Double
}

