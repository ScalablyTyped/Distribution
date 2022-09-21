package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsSelectionTools
  extends StObject
     with Object {
  
  /**
    * Indicates whether to display the `"lasso-selection"` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var `lasso-selection`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the `"rectangle-selection"` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var `rectangle-selection`: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsSelectionTools {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElementsSelectionTools = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElementsSelectionTools]
  }
  
  extension [Self <: VisibleElementsSelectionTools](x: Self) {
    
    inline def `setLasso-selection`(value: Boolean): Self = StObject.set(x, "lasso-selection", value.asInstanceOf[js.Any])
    
    inline def `setLasso-selectionUndefined`: Self = StObject.set(x, "lasso-selection", js.undefined)
    
    inline def `setRectangle-selection`(value: Boolean): Self = StObject.set(x, "rectangle-selection", value.asInstanceOf[js.Any])
    
    inline def `setRectangle-selectionUndefined`: Self = StObject.set(x, "rectangle-selection", js.undefined)
  }
}
