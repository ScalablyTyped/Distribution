package typings.aliApp.anon

import typings.aliApp.my.MultiLevelSelectItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
                  // 是否选择完成,取消返回false
  var result: js.Array[MultiLevelSelectItem]
  var success: Boolean
}

object Result {
  @scala.inline
  def apply(result: js.Array[MultiLevelSelectItem], success: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

