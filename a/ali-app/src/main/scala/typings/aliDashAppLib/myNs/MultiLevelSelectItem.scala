package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3

trait MultiLevelSelectItem extends js.Object {
  var name: java.lang.String
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
}

