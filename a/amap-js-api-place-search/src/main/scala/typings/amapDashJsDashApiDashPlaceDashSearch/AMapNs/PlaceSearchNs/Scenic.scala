package typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenic extends js.Object {
  /**
    * 信息来源
    */
  var deep_src: String
  /**
    * 简介
    */
  var intro: String
  /**
    * 景区国标级别
    */
  var level: String
  /**
    * 非规范格式的营业时间
    */
  var opentime: String
  /**
    * 规范格式的营业时间
    */
  var opentime_GDF: String
  /**
    * wap购票链接
    */
  var ordering_wap_url: String
  /**
    * web购票链接
    */
  var ordering_web_url: String
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 门票价格
    */
  var price: String
  /**
    * 综合评分
    */
  var rating: String
  /**
    * 推荐景点
    */
  var recommend: String
  /**
    * 适合游玩的季节
    */
  var season: String
  /**
    * 景区主题
    */
  var theme: String
}

object Scenic {
  @scala.inline
  def apply(
    deep_src: String,
    intro: String,
    level: String,
    opentime: String,
    opentime_GDF: String,
    ordering_wap_url: String,
    ordering_web_url: String,
    photos: js.Array[PoiPhoto],
    price: String,
    rating: String,
    recommend: String,
    season: String,
    theme: String
  ): Scenic = {
    val __obj = js.Dynamic.literal(deep_src = deep_src, intro = intro, level = level, opentime = opentime, opentime_GDF = opentime_GDF, ordering_wap_url = ordering_wap_url, ordering_web_url = ordering_web_url, photos = photos, price = price, rating = rating, recommend = recommend, season = season, theme = theme)
  
    __obj.asInstanceOf[Scenic]
  }
}

