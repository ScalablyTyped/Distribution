package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleRangeSliderVisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether the preview thumbnail of the scale is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.24_ Indicates whether the scale dropdown menus are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var scaleMenus: js.UndefOr[Boolean | VisibleElementsScaleMenus] = js.undefined
}
object ScaleRangeSliderVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ScaleRangeSliderVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ScaleRangeSliderVisibleElements]
  }
  
  extension [Self <: ScaleRangeSliderVisibleElements](x: Self) {
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setScaleMenus(value: Boolean | VisibleElementsScaleMenus): Self = StObject.set(x, "scaleMenus", value.asInstanceOf[js.Any])
    
    inline def setScaleMenusUndefined: Self = StObject.set(x, "scaleMenus", js.undefined)
  }
}
