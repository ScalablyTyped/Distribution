package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapFloorInfoProperties extends StObject {
  
  /**
    * Contains the facility features of a floor plan, which describe the footprints of managed buildings and other structures.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#facilityLayer)
    */
  var facilityLayer: js.UndefOr[FacilityLayerInfoProperties] = js.undefined
  
  /**
    * Contains the level features of a floor plan, which describe the footprint of each occupiable floor contained in a managed facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#levelLayer)
    */
  var levelLayer: js.UndefOr[LevelLayerInfoProperties] = js.undefined
  
  /**
    * Contains the site features of a floor plan, which describe the boundaries of managed sites and is used for visualization in mapmaking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#siteLayer)
    */
  var siteLayer: js.UndefOr[SiteLayerInfoProperties] = js.undefined
}
object MapFloorInfoProperties {
  
  inline def apply(): MapFloorInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapFloorInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapFloorInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setFacilityLayer(value: FacilityLayerInfoProperties): Self = StObject.set(x, "facilityLayer", value.asInstanceOf[js.Any])
    
    inline def setFacilityLayerUndefined: Self = StObject.set(x, "facilityLayer", js.undefined)
    
    inline def setLevelLayer(value: LevelLayerInfoProperties): Self = StObject.set(x, "levelLayer", value.asInstanceOf[js.Any])
    
    inline def setLevelLayerUndefined: Self = StObject.set(x, "levelLayer", js.undefined)
    
    inline def setSiteLayer(value: SiteLayerInfoProperties): Self = StObject.set(x, "siteLayer", value.asInstanceOf[js.Any])
    
    inline def setSiteLayerUndefined: Self = StObject.set(x, "siteLayer", js.undefined)
  }
}
