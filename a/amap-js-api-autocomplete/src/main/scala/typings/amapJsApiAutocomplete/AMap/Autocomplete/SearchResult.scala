package typings.amapJsApiAutocomplete.AMap.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 输入提示条数
    */
  var count: Double
  /**
    * 查询状态说明
    */
  var info: String
  /**
    * 输入提示列表
    */
  var tips: js.Array[Tip]
}

object SearchResult {
  @scala.inline
  def apply(count: Double, info: String, tips: js.Array[Tip]): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

