package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelDefaultUpdateOptions extends StObject {
  
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var enableScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if z-values can be modified when updating the graphic.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var enableZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether more than one selection can be made at once.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Changes the behavior for the `reshape` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var reshapeOptions: js.UndefOr[SketchViewModelDefaultUpdateOptionsReshapeOptions] = js.undefined
  
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the update tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var tool: js.UndefOr[move | transform | reshape] = js.undefined
}
object SketchViewModelDefaultUpdateOptions {
  
  inline def apply(): SketchViewModelDefaultUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelDefaultUpdateOptions]
  }
  
  extension [Self <: SketchViewModelDefaultUpdateOptions](x: Self) {
    
    inline def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
    
    inline def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
    
    inline def setEnableScaling(value: Boolean): Self = StObject.set(x, "enableScaling", value.asInstanceOf[js.Any])
    
    inline def setEnableScalingUndefined: Self = StObject.set(x, "enableScaling", js.undefined)
    
    inline def setEnableZ(value: Boolean): Self = StObject.set(x, "enableZ", value.asInstanceOf[js.Any])
    
    inline def setEnableZUndefined: Self = StObject.set(x, "enableZ", js.undefined)
    
    inline def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    inline def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setReshapeOptions(value: SketchViewModelDefaultUpdateOptionsReshapeOptions): Self = StObject.set(x, "reshapeOptions", value.asInstanceOf[js.Any])
    
    inline def setReshapeOptionsUndefined: Self = StObject.set(x, "reshapeOptions", js.undefined)
    
    inline def setToggleToolOnClick(value: Boolean): Self = StObject.set(x, "toggleToolOnClick", value.asInstanceOf[js.Any])
    
    inline def setToggleToolOnClickUndefined: Self = StObject.set(x, "toggleToolOnClick", js.undefined)
    
    inline def setTool(value: move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
  }
}
