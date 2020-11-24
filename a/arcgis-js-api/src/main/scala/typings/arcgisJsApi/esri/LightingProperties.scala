package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightingProperties extends js.Object {
  
  /**
    * The time and date for which the sun position and light direction is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#date)
    */
  var date: js.UndefOr[DateProperties] = js.native
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#directShadowsEnabled)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#displayUTCOffset)
    */
  var displayUTCOffset: js.UndefOr[Double] = js.native
}
object LightingProperties {
  
  @scala.inline
  def apply(): LightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightingProperties]
  }
  
  @scala.inline
  implicit class LightingPropertiesOps[Self <: LightingProperties] (val x: Self) extends AnyVal {
    
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
    def setDate(value: DateProperties): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDirectShadowsEnabled(value: Boolean): Self = this.set("directShadowsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectShadowsEnabled: Self = this.set("directShadowsEnabled", js.undefined)
    
    @scala.inline
    def setDisplayUTCOffset(value: Double): Self = this.set("displayUTCOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayUTCOffset: Self = this.set("displayUTCOffset", js.undefined)
  }
}
