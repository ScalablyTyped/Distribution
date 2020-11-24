package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dining extends js.Object {
  
  /**
    * 餐厅特色
    */
  var addition: String = js.native
  
  /**
    * 氛围
    */
  var atmosphere: String = js.native
  
  /**
    * 人均消费
    */
  var cost: String = js.native
  
  /**
    * 单数据源的评分
    */
  var cp_rating: String = js.native
  
  /**
    * 菜系
    */
  var cuisines: String = js.native
  
  /**
    * 信息来源
    */
  var deep_src: String = js.native
  
  /**
    * 环境评分
    */
  var environment_rating: String = js.native
  
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
    * 订餐APP URL
    */
  var ordering_app_url: String = js.native
  
  /**
    * 订餐wap链接
    */
  var ordering_wap_url: String = js.native
  
  /**
    * 订餐web链接
    */
  var ordering_web_url: String = js.native
  
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto] = js.native
  
  /**
    * 综合评分
    */
  var rating: String = js.native
  
  /**
    * 特色菜
    */
  var recommend: String = js.native
  
  /**
    * 服务评分
    */
  var service_rating: String = js.native
  
  /**
    * 标签
    */
  var tag: String = js.native
  
  /**
    * 口味评分
    */
  var taste_rating: String = js.native
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
  
  @scala.inline
  implicit class DiningOps[Self <: Dining] (val x: Self) extends AnyVal {
    
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
    def setAtmosphere(value: String): Self = this.set("atmosphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCost(value: String): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp_rating(value: String): Self = this.set("cp_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCuisines(value: String): Self = this.set("cuisines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeep_src(value: String): Self = this.set("deep_src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_rating(value: String): Self = this.set("environment_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntro(value: String): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime(value: String): Self = this.set("opentime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime_GDF(value: String): Self = this.set("opentime_GDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering_app_url(value: String): Self = this.set("ordering_app_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering_wap_url(value: String): Self = this.set("ordering_wap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering_web_url(value: String): Self = this.set("ordering_web_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommend(value: String): Self = this.set("recommend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_rating(value: String): Self = this.set("service_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaste_rating(value: String): Self = this.set("taste_rating", value.asInstanceOf[js.Any])
  }
}
