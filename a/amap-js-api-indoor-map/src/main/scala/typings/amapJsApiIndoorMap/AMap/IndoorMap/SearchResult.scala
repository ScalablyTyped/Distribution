package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`0`
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult
  - typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchSuccessResult(building: Building, id: String, status: `0`): SearchResult = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchErrorResult(error: Error, id: String, status: `1`): SearchResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

