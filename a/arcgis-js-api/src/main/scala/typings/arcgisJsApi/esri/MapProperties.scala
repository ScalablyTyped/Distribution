package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapProperties
  extends LayersMixinProperties
     with TablesMixinProperties {
  
  /**
    * Specifies a basemap for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties | String] = js.native
  
  /**
    * Specifies the surface properties for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground)
    */
  var ground: js.UndefOr[GroundProperties | String] = js.native
}
object MapProperties {
  
  @scala.inline
  def apply(): MapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapProperties]
  }
  
  @scala.inline
  implicit class MapPropertiesOps[Self <: MapProperties] (val x: Self) extends AnyVal {
    
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
    def setBasemap(value: BasemapProperties | String): Self = this.set("basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    
    @scala.inline
    def setGround(value: GroundProperties | String): Self = this.set("ground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGround: Self = this.set("ground", js.undefined)
  }
}
