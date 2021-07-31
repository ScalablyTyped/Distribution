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
    * Indicates whether the preview thumbnail of the region is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var preview: Boolean
}
object ScaleRangeSliderVisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    preview: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ScaleRangeSliderVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), preview = preview.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ScaleRangeSliderVisibleElements]
  }
  
  @scala.inline
  implicit class ScaleRangeSliderVisibleElementsMutableBuilder[Self <: ScaleRangeSliderVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
