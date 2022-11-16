package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightAnalysisTargetElevationInfo extends StObject {
  
  /**
    * Defines how the target is placed with respect to the terrain surface or 3D objects in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`
  
  /**
    * An elevation offset, which is added to the vertical position of the target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object LineOfSightAnalysisTargetElevationInfo {
  
  inline def apply(mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): LineOfSightAnalysisTargetElevationInfo = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOfSightAnalysisTargetElevationInfo]
  }
  
  extension [Self <: LineOfSightAnalysisTargetElevationInfo](x: Self) {
    
    inline def setMode(value: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
