package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotel extends js.Object {
  /**
    * 特色服务
    */
  var addition: String
  /**
    * 信息来源
    */
  var deep_src: String
  /**
    * 环境评分
    */
  var environment_rating: String
  /**
    * 设施评分
    */
  var faci_rating: String
  /**
    * 卫生评分
    */
  var health_rating: String
  /**
    * 简介
    */
  var intro: String
  /**
    * 最低房价
    */
  var lowest_price: String
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 综合评分
    */
  var rating: String
  /**
    * 服务评分
    */
  var service_rating: String
  /**
    * 星级
    */
  var star: String
  /**
    * 交通提示
    */
  var traffic: String
}

object Hotel {
  @scala.inline
  def apply(
    addition: String,
    deep_src: String,
    environment_rating: String,
    faci_rating: String,
    health_rating: String,
    intro: String,
    lowest_price: String,
    photos: js.Array[PoiPhoto],
    rating: String,
    service_rating: String,
    star: String,
    traffic: String
  ): Hotel = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], faci_rating = faci_rating.asInstanceOf[js.Any], health_rating = health_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], lowest_price = lowest_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotel]
  }
}

