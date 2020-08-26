package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hotel extends js.Object {
  /**
    * 特色服务
    */
  var addition: String = js.native
  /**
    * 信息来源
    */
  var deep_src: String = js.native
  /**
    * 环境评分
    */
  var environment_rating: String = js.native
  /**
    * 设施评分
    */
  var faci_rating: String = js.native
  /**
    * 卫生评分
    */
  var health_rating: String = js.native
  /**
    * 简介
    */
  var intro: String = js.native
  /**
    * 最低房价
    */
  var lowest_price: String = js.native
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto] = js.native
  /**
    * 综合评分
    */
  var rating: String = js.native
  /**
    * 服务评分
    */
  var service_rating: String = js.native
  /**
    * 星级
    */
  var star: String = js.native
  /**
    * 交通提示
    */
  var traffic: String = js.native
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
  @scala.inline
  implicit class HotelOps[Self <: Hotel] (val x: Self) extends AnyVal {
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
    def setAddition(value: String): Self = this.set("addition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeep_src(value: String): Self = this.set("deep_src", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_rating(value: String): Self = this.set("environment_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setFaci_rating(value: String): Self = this.set("faci_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealth_rating(value: String): Self = this.set("health_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntro(value: String): Self = this.set("intro", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowest_price(value: String): Self = this.set("lowest_price", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setService_rating(value: String): Self = this.set("service_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setStar(value: String): Self = this.set("star", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraffic(value: String): Self = this.set("traffic", value.asInstanceOf[js.Any])
  }
  
}

