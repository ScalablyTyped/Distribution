package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenic extends js.Object {
  
  /**
    * 信息来源
    */
  var deep_src: String = js.native
  
  /**
    * 简介
    */
  var intro: String = js.native
  
  /**
    * 景区国标级别
    */
  var level: String = js.native
  
  /**
    * 非规范格式的营业时间
    */
  var opentime: String = js.native
  
  /**
    * 规范格式的营业时间
    */
  var opentime_GDF: String = js.native
  
  /**
    * wap购票链接
    */
  var ordering_wap_url: String = js.native
  
  /**
    * web购票链接
    */
  var ordering_web_url: String = js.native
  
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto] = js.native
  
  /**
    * 门票价格
    */
  var price: String = js.native
  
  /**
    * 综合评分
    */
  var rating: String = js.native
  
  /**
    * 推荐景点
    */
  var recommend: String = js.native
  
  /**
    * 适合游玩的季节
    */
  var season: String = js.native
  
  /**
    * 景区主题
    */
  var theme: String = js.native
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
    val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
  
  @scala.inline
  implicit class ScenicOps[Self <: Scenic] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime(value: String): Self = this.set("opentime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpentime_GDF(value: String): Self = this.set("opentime_GDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering_wap_url(value: String): Self = this.set("ordering_wap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering_web_url(value: String): Self = this.set("ordering_web_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommend(value: String): Self = this.set("recommend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: String): Self = this.set("season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
