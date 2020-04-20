package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  /**
    * 公交换乘终点名称
    */
  var destinationName: String
  /**
    * 公交换乘终点
    */
  var end: PoiExt
  /**
    * 公交换乘起点名称
    */
  var originName: String
  /**
    * 公交换乘起点
    */
  var start: PoiExt
}

object SearchResultExt {
  @scala.inline
  def apply(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    plans: js.Array[TransferPlan],
    start: PoiExt,
    taxi_cost: Double
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultExt]
  }
}

