package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsScaleMenus
  extends StObject
     with Object {
  
  /**
    * Indicates whether the maximum scale dropdown menu is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var maxScaleMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the minimum scale dropdown menu is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var minScaleMenu: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsScaleMenus {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElementsScaleMenus = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElementsScaleMenus]
  }
  
  extension [Self <: VisibleElementsScaleMenus](x: Self) {
    
    inline def setMaxScaleMenu(value: Boolean): Self = StObject.set(x, "maxScaleMenu", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleMenuUndefined: Self = StObject.set(x, "maxScaleMenu", js.undefined)
    
    inline def setMinScaleMenu(value: Boolean): Self = StObject.set(x, "minScaleMenu", value.asInstanceOf[js.Any])
    
    inline def setMinScaleMenuUndefined: Self = StObject.set(x, "minScaleMenu", js.undefined)
  }
}
