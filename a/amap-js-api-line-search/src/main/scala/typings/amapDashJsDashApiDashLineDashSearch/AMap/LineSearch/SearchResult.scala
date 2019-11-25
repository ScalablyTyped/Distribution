package typings.amapDashJsDashApiDashLineDashSearch.AMap.LineSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 查该城市无此公交站时，返回的建议城市列表
    */
  var cityList: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 成功状态文字描述
    */
  var info: String
  /**
    * 查无此公交站时，返回的建议关键字列表
    */
  var keywordList: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 根据查询条件返回公交路线信息
    */
  var lineInfo: js.Array[LineInfo]
}

object SearchResult {
  @scala.inline
  def apply(
    info: String,
    lineInfo: js.Array[LineInfo],
    cityList: js.Array[_] = null,
    keywordList: js.Array[_] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], lineInfo = lineInfo.asInstanceOf[js.Any])
    if (cityList != null) __obj.updateDynamic("cityList")(cityList.asInstanceOf[js.Any])
    if (keywordList != null) __obj.updateDynamic("keywordList")(keywordList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

