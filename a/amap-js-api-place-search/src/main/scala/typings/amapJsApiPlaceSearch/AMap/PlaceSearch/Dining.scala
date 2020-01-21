package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dining extends js.Object {
  /**
    * 餐厅特色
    */
  var addition: String
  /**
    * 氛围
    */
  var atmosphere: String
  /**
    * 人均消费
    */
  var cost: String
  /**
    * 单数据源的评分
    */
  var cp_rating: String
  /**
    * 菜系
    */
  var cuisines: String
  /**
    * 信息来源
    */
  var deep_src: String
  /**
    * 环境评分
    */
  var environment_rating: String
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
    * 订餐APP URL
    */
  var ordering_app_url: String
  /**
    * 订餐wap链接
    */
  var ordering_wap_url: String
  /**
    * 订餐web链接
    */
  var ordering_web_url: String
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 综合评分
    */
  var rating: String
  /**
    * 特色菜
    */
  var recommend: String
  /**
    * 服务评分
    */
  var service_rating: String
  /**
    * 标签
    */
  var tag: String
  /**
    * 口味评分
    */
  var taste_rating: String
}

object Dining {
  @scala.inline
  def apply(
    addition: String,
    atmosphere: String,
    cost: String,
    cp_rating: String,
    cuisines: String,
    deep_src: String,
    environment_rating: String,
    intro: String,
    opentime: String,
    opentime_GDF: String,
    ordering_app_url: String,
    ordering_wap_url: String,
    ordering_web_url: String,
    photos: js.Array[PoiPhoto],
    rating: String,
    recommend: String,
    service_rating: String,
    tag: String,
    taste_rating: String
  ): Dining = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], atmosphere = atmosphere.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], cp_rating = cp_rating.asInstanceOf[js.Any], cuisines = cuisines.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_app_url = ordering_app_url.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], taste_rating = taste_rating.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dining]
  }
}

