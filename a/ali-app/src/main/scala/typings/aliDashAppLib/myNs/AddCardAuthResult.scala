package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 会员开卡授权 https://docs.alipay.com/mini/api/add-card-auth
trait AddCardAuthResult extends js.Object {
  		// false 表示领卡失败
  /**
  		 * 失败的错误码
  		 * 领卡失败 code 说明
  		 * 名称 | 类型 | 说明
  		 * -----|-----|-----
  		 * JSAPI_SERVICE_TERMINATED | String | 用户取消
  		 * JSAPI_PARAM_INVALID | String | url 为空或非法参数
  		 * JSAPI_SYSTEM_ERROR | String | 系统错误
  		 */
  var code: java.lang.String
  	// 9000 表示成功
  var result: aliDashAppLib.Anon_Appid
  		// true 表示领卡成功
  var resultStatus: java.lang.String
  var success: (aliDashAppLib.aliDashAppLibNumbers.`true` | scala.Boolean) with (aliDashAppLib.aliDashAppLibNumbers.`false` | scala.Boolean)
}

