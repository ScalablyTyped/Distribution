package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  /**
    * 到达圈边界坐标点
    */
  var bounds: js.Array[js.Array[js.Array[js.Array[String]]]] = js.native
  
  /**
    * 提供的终点坐标是否在到达圈内
    */
  var inRange: js.UndefOr[js.Array[Boolean]] = js.native
  
  /**
    * 查询状态说明
    */
  var info: String = js.native
  
  // internal
  var infocode: String = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(bounds: js.Array[js.Array[js.Array[js.Array[String]]]], info: String, infocode: String): SearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any])
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
    def setBoundsVarargs(value: js.Array[js.Array[js.Array[String]]]*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[js.Array[js.Array[js.Array[String]]]]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfocode(value: String): Self = this.set("infocode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRangeVarargs(value: Boolean*): Self = this.set("inRange", js.Array(value :_*))
    
    @scala.inline
    def setInRange(value: js.Array[Boolean]): Self = this.set("inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
  }
}
