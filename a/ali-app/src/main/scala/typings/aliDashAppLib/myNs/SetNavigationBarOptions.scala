package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 导航栏背景色，支持十六进制颜色值 */
  var backgroundColor: java.lang.String
  /** 导航栏底部边框颜色，支持十六进制颜色值。若设置了 backgroundColor，则borderBottomColor 不会生效，默认会和 backgroundColor 颜色一样 */
  var borderBottomColor: java.lang.String
  /** 图片连接地址，必须是https，请使用3x高清图片。若设置了image则title参数失效 */
  var image: java.lang.String
  /** 是否重置导航栏为支付宝默认配色，默认 false */
  var reset: scala.Boolean
  /** 页面标题 */
  var title: java.lang.String
}

