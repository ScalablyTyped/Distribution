package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSuccessResult extends SearchResult {
  
  /**
    * 建筑信息
    */
  var building: Building = js.native
  
  /**
    * 楼层的id
    */
  var id: String = js.native
  
  var status: `0` = js.native
}
object SearchSuccessResult {
  
  @scala.inline
  def apply(building: Building, id: String, status: `0`): SearchSuccessResult = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuccessResult]
  }
  
  @scala.inline
  implicit class SearchSuccessResultOps[Self <: SearchSuccessResult] (val x: Self) extends AnyVal {
    
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
    def setBuilding(value: Building): Self = this.set("building", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
