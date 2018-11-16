package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择城市 https://docs.alipay.com/mini/api/ui-city

trait City extends js.Object {
  	// 城市名
  var adCode: java.lang.String
  var city: java.lang.String
  	// 行政区划代码
  var spell: js.UndefOr[java.lang.String] = js.undefined
}

