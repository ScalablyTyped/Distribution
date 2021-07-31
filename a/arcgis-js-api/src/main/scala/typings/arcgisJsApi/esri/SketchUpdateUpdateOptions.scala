package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchUpdateUpdateOptions
  extends StObject
     with Object {
  
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if z-values can be modified when updating the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether more than one selection can be made at once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the update tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var tool: js.UndefOr[transform | reshape | move] = js.undefined
}
object SketchUpdateUpdateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchUpdateUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchUpdateUpdateOptions]
  }
  
  @scala.inline
  implicit class SketchUpdateUpdateOptionsMutableBuilder[Self <: SketchUpdateUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
    
    @scala.inline
    def setEnableScaling(value: Boolean): Self = StObject.set(x, "enableScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableScalingUndefined: Self = StObject.set(x, "enableScaling", js.undefined)
    
    @scala.inline
    def setEnableZ(value: Boolean): Self = StObject.set(x, "enableZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableZUndefined: Self = StObject.set(x, "enableZ", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setToggleToolOnClick(value: Boolean): Self = StObject.set(x, "toggleToolOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleToolOnClickUndefined: Self = StObject.set(x, "toggleToolOnClick", js.undefined)
    
    @scala.inline
    def setTool(value: transform | reshape | move): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
  }
}
