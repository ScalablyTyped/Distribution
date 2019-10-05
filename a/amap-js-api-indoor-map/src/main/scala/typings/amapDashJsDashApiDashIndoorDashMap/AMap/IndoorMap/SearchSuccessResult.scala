package typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSuccessResult extends SearchResult {
  /**
    * 建筑信息
    */
  var building: Building
  /**
    * 楼层的id
    */
  var id: String
  var status: `0`
}

object SearchSuccessResult {
  @scala.inline
  def apply(building: Building, id: String, status: `0`): SearchSuccessResult = {
    val __obj = js.Dynamic.literal(building = building, id = id, status = status)
  
    __obj.asInstanceOf[SearchSuccessResult]
  }
}

