package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.canIUse")
@js.native
object canIUse extends js.Object {
  //#region canIUse https://docs.alipay.com/mini/api/can-i-use
  /**
  	 * 判断当前小程序的 API、入参或返回值、组件、属性等在当前版本是否支持。
  	 * 参数使用 ${API}.${type}.${param}.${option} 或者 ${component}.${attribute}.${option} 方式来调用
  	 * - API 表示 api 名字
  	 * - type 取值 object/return/callback 表示 api 的判断类型
  	 * - param 表示参数的某一个属性名
  	 * - option 表示参数属性的具体属性值
  	 * - component 表示组件名称
  	 * - attribute 表示组件属性名
  	 * - option 表示组件属性值
  	 */
  def apply(api: String): Boolean = js.native
}

