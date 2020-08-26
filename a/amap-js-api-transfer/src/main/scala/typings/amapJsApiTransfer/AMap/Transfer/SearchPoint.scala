package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchPoint extends js.Object {
  /**
    * 关键词
    */
  var keyword: String = js.native
}

object SearchPoint {
  @scala.inline
  def apply(keyword: String): SearchPoint = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPoint]
  }
  @scala.inline
  implicit class SearchPointOps[Self <: SearchPoint] (val x: Self) extends AnyVal {
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
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
  }
  
}

