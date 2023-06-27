package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`wire-frame`
import typings.arcgisJsApi.arcgisJsApiStrings.`x-ray`
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingFilterBlockFilterMode extends StObject {
  
  /**
  		 * Defines the type of edges used to display a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) filtered in `wire-frame` mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
  		 */
  var edges: js.UndefOr[SolidEdges3D | SketchEdges3D] = js.undefined
  
  /**
  		 * Defines how features are drawn while the filter is active.
  		 *
  		 * @default solid
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
  		 */
  var `type`: js.UndefOr[solid | `wire-frame` | `x-ray`] = js.undefined
}
object BuildingFilterBlockFilterMode {
  
  inline def apply(): BuildingFilterBlockFilterMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingFilterBlockFilterMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingFilterBlockFilterMode] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: SolidEdges3D | SketchEdges3D): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setType(value: solid | `wire-frame` | `x-ray`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
