package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibleElements extends Object {
  
  /**
    * Indicates whether to the base layers will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var baseLayers: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to the reference layers will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var referenceLayers: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to the status indicators will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.native
}
object VisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElements]
  }
  
  @scala.inline
  implicit class VisibleElementsOps[Self <: VisibleElements] (val x: Self) extends AnyVal {
    
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
    def setBaseLayers(value: Boolean): Self = this.set("baseLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLayers: Self = this.set("baseLayers", js.undefined)
    
    @scala.inline
    def setReferenceLayers(value: Boolean): Self = this.set("referenceLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceLayers: Self = this.set("referenceLayers", js.undefined)
    
    @scala.inline
    def setStatusIndicators(value: Boolean): Self = this.set("statusIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusIndicators: Self = this.set("statusIndicators", js.undefined)
  }
}
