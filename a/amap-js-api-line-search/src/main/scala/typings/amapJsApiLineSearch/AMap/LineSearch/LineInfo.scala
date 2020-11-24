package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoBase
  - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoExt
*/
trait LineInfo extends js.Object
object LineInfo {
  
  @scala.inline
  def LineInfoBase(
    citycode: String,
    end_stop: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    `type`: String
  ): LineInfo = {
    val __obj = js.Dynamic.literal(citycode = citycode.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfo]
  }
  
  @scala.inline
  def LineInfoExt(
    basic_price: String,
    bounds: Bounds,
    citycode: String,
    company: String,
    distance: String,
    end_stop: String,
    etime: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    stime: String,
    total_price: String,
    `type`: String,
    via_stops: js.Array[BusStop]
  ): LineInfo = {
    val __obj = js.Dynamic.literal(basic_price = basic_price.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], total_price = total_price.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfo]
  }
}
