package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSnappingLayerSource
  extends StObject
     with Accessor {
  
  /**
    * Indicates whether feature snapping is turned on or off.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#enabled)
    */
  var enabled: Boolean = js.native
  
  /**
    * The source layer used for snapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#layer)
    */
  val layer: BuildingSceneLayer | CSVLayer | FeatureLayer | GeoJSONLayer | GraphicsLayer | MapNotesLayer | SceneLayer | WFSLayer = js.native
}
