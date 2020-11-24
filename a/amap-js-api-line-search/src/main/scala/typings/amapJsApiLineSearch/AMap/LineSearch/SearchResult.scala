package typings.amapJsApiLineSearch.AMap.LineSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  /**
    * 查该城市无此公交站时，返回的建议城市列表
    */
  var cityList: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 成功状态文字描述
    */
  var info: String = js.native
  
  /**
    * 查无此公交站时，返回的建议关键字列表
    */
  var keywordList: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 根据查询条件返回公交路线信息
    */
  var lineInfo: js.Array[LineInfo] = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(info: String, lineInfo: js.Array[LineInfo]): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], lineInfo = lineInfo.asInstanceOf[js.Any])
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineInfoVarargs(value: LineInfo*): Self = this.set("lineInfo", js.Array(value :_*))
    
    @scala.inline
    def setLineInfo(value: js.Array[LineInfo]): Self = this.set("lineInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityListVarargs(value: js.Any*): Self = this.set("cityList", js.Array(value :_*))
    
    @scala.inline
    def setCityList(value: js.Array[_]): Self = this.set("cityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCityList: Self = this.set("cityList", js.undefined)
    
    @scala.inline
    def setKeywordListVarargs(value: js.Any*): Self = this.set("keywordList", js.Array(value :_*))
    
    @scala.inline
    def setKeywordList(value: js.Array[_]): Self = this.set("keywordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywordList: Self = this.set("keywordList", js.undefined)
  }
}
