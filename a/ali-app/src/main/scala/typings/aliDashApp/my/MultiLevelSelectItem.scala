package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3
trait MultiLevelSelectItem extends js.Object {
  var name: String
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
}

object MultiLevelSelectItem {
  @scala.inline
  def apply(name: String, subList: js.Array[MultiLevelSelectItem] = null): MultiLevelSelectItem = {
    val __obj = js.Dynamic.literal(name = name)
    if (subList != null) __obj.updateDynamic("subList")(subList)
    __obj.asInstanceOf[MultiLevelSelectItem]
  }
}

