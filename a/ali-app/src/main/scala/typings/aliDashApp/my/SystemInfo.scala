package typings.aliDashApp.my

import typings.aliDashApp.aliDashAppStrings.Android
import typings.aliDashApp.aliDashAppStrings.alipay
import typings.aliDashApp.aliDashAppStrings.iOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 系统信息 https://docs.alipay.com/mini/api/system-info
trait SystemInfo extends js.Object {
  /**
  		 * 当前运行的客户端，当前是支付宝则有效值是"alipay"
  		 */
  var app: alipay | String
  /**
  		 * 手机品牌
  		 */
  var brand: String
  /**
  		 * 当前电量百分比
  		 */
  var currentBattery: String
  /**
  		 * 用户设置字体大小
  		 */
  var fontSizeSetting: Double
  /**
  		 * 支付宝设置的语言
  		 */
  var language: String
  /**
  		 * 手机型号
  		 */
  var model: String
  /**
  		 * 设备像素比
  		 */
  var pixelRatio: Double
  /**
  		 * 系统名：Android，iOS
  		 */
  var platform: Android | iOS | String
  /**
  		 * 屏幕高度
  		 */
  var screenHeight: Double
  /**
  		 * 屏幕宽度
  		 */
  var screenWidth: Double
  /**
  		 * 设备磁盘容量
  		 */
  var storage: String
  /**
  		 * 系统版本
  		 */
  var system: String
  /**
  		 * 支付宝版本号
  		 */
  var version: String
  /**
  		 * 窗口高度
  		 */
  var windowHeight: Double
  /**
  		 * 窗口宽度
  		 */
  var windowWidth: Double
}

object SystemInfo {
  @scala.inline
  def apply(
    app: alipay | String,
    brand: String,
    currentBattery: String,
    fontSizeSetting: Double,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: Android | iOS | String,
    screenHeight: Double,
    screenWidth: Double,
    storage: String,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], brand = brand, currentBattery = currentBattery, fontSizeSetting = fontSizeSetting, language = language, model = model, pixelRatio = pixelRatio, platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight, screenWidth = screenWidth, storage = storage, system = system, version = version, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[SystemInfo]
  }
}

