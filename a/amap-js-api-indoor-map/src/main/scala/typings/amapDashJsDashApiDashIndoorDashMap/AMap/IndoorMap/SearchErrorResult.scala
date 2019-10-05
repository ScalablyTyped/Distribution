package typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchErrorResult extends SearchResult {
  var error: Error
  /**
    * 楼宇id
    */
  var id: String
  var status: `1`
}

object SearchErrorResult {
  @scala.inline
  def apply(error: Error, id: String, status: `1`): SearchErrorResult = {
    val __obj = js.Dynamic.literal(error = error, id = id, status = status)
  
    __obj.asInstanceOf[SearchErrorResult]
  }
}

