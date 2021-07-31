package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapProperties
  extends StObject
     with LayersMixinProperties
     with TablesMixinProperties {
  
  /**
    * Specifies a basemap for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties | String] = js.undefined
  
  /**
    * Specifies the surface properties for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground)
    */
  var ground: js.UndefOr[GroundProperties | String] = js.undefined
}
object MapProperties {
  
  @scala.inline
  def apply(): MapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapProperties]
  }
  
  @scala.inline
  implicit class MapPropertiesMutableBuilder[Self <: MapProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: BasemapProperties | String): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setGround(value: GroundProperties | String): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundUndefined: Self = StObject.set(x, "ground", js.undefined)
  }
}
