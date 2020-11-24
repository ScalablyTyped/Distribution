package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cinema extends js.Object {
  
  /**
    * 信息来源
    */
  var deep_src: String = js.native
  
  /**
    * 简介
    */
  var intro: String = js.native
  
  /**
    * 非规范格式的营业时间
    */
  var opentime: String = js.native
  
  /**
    * 规范格式的营业时间
    */
  var opentime_GDF: String = js.native
  
  /**
    * 停车场设施
    */
  var parking: String = js.native
  
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto] = js.native
  
  /**
    * 综合评分
    */
  var rating: String = js.native
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
  
  @scala.inline
  implicit class CinemaOps[Self <: Cinema] (val x: Self) extends AnyVal {
    
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
    def setDeep_src(value: String): Self = this.set("deep_src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntro(value: String): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime(value: String): Self = this.set("opentime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime_GDF(value: String): Self = this.set("opentime_GDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParking(value: String): Self = this.set("parking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
  }
}
