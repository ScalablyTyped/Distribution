package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.Lang
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.all
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 是否批量查询
    */
  var batch: js.UndefOr[Boolean] = js.native
  
  /**
    * 城市
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * 是否返回详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  
  /**
    * 语言类型
    */
  var lang: js.UndefOr[Lang] = js.native
  
  /**
    * 中心点
    */
  var radius: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setExtensions(value: base | all): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setLang(value: Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
