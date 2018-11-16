package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AddCardAuthOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, scala.Unit]] = js.undefined
  /**
  		 * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
  		 */
  var url: java.lang.String
}

