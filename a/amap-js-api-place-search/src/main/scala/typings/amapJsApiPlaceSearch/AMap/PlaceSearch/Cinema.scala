package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cinema extends js.Object {
  /**
    * 信息来源
    */
  var deep_src: String
  /**
    * 简介
    */
  var intro: String
  /**
    * 非规范格式的营业时间
    */
  var opentime: String
  /**
    * 规范格式的营业时间
    */
  var opentime_GDF: String
  /**
    * 停车场设施
    */
  var parking: String
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 综合评分
    */
  var rating: String
}

object Cinema {
  @scala.inline
  def apply(
    deep_src: String,
    intro: String,
    opentime: String,
    opentime_GDF: String,
    parking: String,
    photos: js.Array[PoiPhoto],
    rating: String
  ): Cinema = {
    val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], parking = parking.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cinema]
  }
}

