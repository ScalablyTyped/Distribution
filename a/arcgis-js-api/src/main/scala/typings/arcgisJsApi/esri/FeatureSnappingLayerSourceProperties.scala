package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.BuildingSceneLayerPropert
import typings.arcgisJsApi.anon.CSVLayerPropertiestypecsv
import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.GeoJSONLayerPropertiestyp
import typings.arcgisJsApi.anon.GraphicsLayerPropertiesty
import typings.arcgisJsApi.anon.MapNotesLayerPropertiesty
import typings.arcgisJsApi.anon.SceneLayerPropertiestypes
import typings.arcgisJsApi.anon.WFSLayerPropertiestypewfs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSnappingLayerSourceProperties extends StObject {
  
  /**
    * Indicates whether feature snapping is turned on or off.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source layer used for snapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#layer)
    */
  var layer: js.UndefOr[
    BuildingSceneLayerPropert | CSVLayerPropertiestypecsv | FeatureLayerPropertiestyp | GeoJSONLayerPropertiestyp | GraphicsLayerPropertiesty | MapNotesLayerPropertiesty | SceneLayerPropertiestypes | WFSLayerPropertiestypewfs
  ] = js.undefined
}
object FeatureSnappingLayerSourceProperties {
  
  inline def apply(): FeatureSnappingLayerSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSnappingLayerSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureSnappingLayerSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLayer(
      value: BuildingSceneLayerPropert | CSVLayerPropertiestypecsv | FeatureLayerPropertiestyp | GeoJSONLayerPropertiestyp | GraphicsLayerPropertiesty | MapNotesLayerPropertiesty | SceneLayerPropertiestypes | WFSLayerPropertiestypewfs
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
