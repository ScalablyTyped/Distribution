package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`wire-frame`
import typings.arcgisJsApi.arcgisJsApiStrings.`x-ray`
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingFilterBlockFilterMode extends Object {
  
  /**
    * Defines the type of edges used to display a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) filtered in `wire-frame` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var edges: js.UndefOr[SolidEdges3D | SketchEdges3D] = js.native
  
  /**
    * Defines how features are drawn while the filter is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var `type`: js.UndefOr[solid | `wire-frame` | `x-ray`] = js.native
}
object BuildingFilterBlockFilterMode {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BuildingFilterBlockFilterMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BuildingFilterBlockFilterMode]
  }
  
  @scala.inline
  implicit class BuildingFilterBlockFilterModeOps[Self <: BuildingFilterBlockFilterMode] (val x: Self) extends AnyVal {
    
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
    def setEdges(value: SolidEdges3D | SketchEdges3D): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setType(value: solid | `wire-frame` | `x-ray`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
