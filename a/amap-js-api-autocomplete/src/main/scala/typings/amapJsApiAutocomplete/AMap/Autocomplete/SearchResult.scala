package typings.amapJsApiAutocomplete.AMap.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * 输入提示条数
    */
  var count: Double = js.native
  /**
    * 查询状态说明
    */
  var info: String = js.native
  /**
    * 输入提示列表
    */
  var tips: js.Array[Tip] = js.native
}

object SearchResult {
  @scala.inline
  def apply(count: Double, info: String, tips: js.Array[Tip]): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setTipsVarargs(value: Tip*): Self = this.set("tips", js.Array(value :_*))
    @scala.inline
    def setTips(value: js.Array[Tip]): Self = this.set("tips", value.asInstanceOf[js.Any])
  }
  
}

