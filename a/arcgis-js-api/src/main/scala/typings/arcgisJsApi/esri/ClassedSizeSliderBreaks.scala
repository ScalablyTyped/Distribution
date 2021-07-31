package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderBreaks
  extends StObject
     with Object {
  
  /**
    * The max value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var max: Double
  
  /**
    * The min value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var min: Double
  
  /**
    * The size in points of the symbol representing features with values within the given `min` and `max`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var size: Double
}
object ClassedSizeSliderBreaks {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): ClassedSizeSliderBreaks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderBreaks]
  }
  
  @scala.inline
  implicit class ClassedSizeSliderBreaksMutableBuilder[Self <: ClassedSizeSliderBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
