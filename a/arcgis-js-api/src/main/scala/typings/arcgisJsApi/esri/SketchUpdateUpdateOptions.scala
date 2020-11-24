package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchUpdateUpdateOptions extends Object {
  
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableRotation: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if z-values can be modified when updating the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var enableZ: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether more than one selection can be made at once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the update tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var tool: js.UndefOr[transform | reshape | move] = js.native
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
  implicit class SketchUpdateUpdateOptionsOps[Self <: SketchUpdateUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableRotation(value: Boolean): Self = this.set("enableRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRotation: Self = this.set("enableRotation", js.undefined)
    
    @scala.inline
    def setEnableScaling(value: Boolean): Self = this.set("enableScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScaling: Self = this.set("enableScaling", js.undefined)
    
    @scala.inline
    def setEnableZ(value: Boolean): Self = this.set("enableZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZ: Self = this.set("enableZ", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = this.set("multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSelectionEnabled: Self = this.set("multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setToggleToolOnClick(value: Boolean): Self = this.set("toggleToolOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleToolOnClick: Self = this.set("toggleToolOnClick", js.undefined)
    
    @scala.inline
    def setTool(value: transform | reshape | move): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
  }
}
