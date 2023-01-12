package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsSelectionTools extends StObject {
  
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
  
  inline def apply(): VisibleElementsSelectionTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElementsSelectionTools]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElementsSelectionTools] (val x: Self) extends AnyVal {
    
    inline def `setLasso-selection`(value: Boolean): Self = StObject.set(x, "lasso-selection", value.asInstanceOf[js.Any])
    
    inline def `setLasso-selectionUndefined`: Self = StObject.set(x, "lasso-selection", js.undefined)
    
    inline def `setRectangle-selection`(value: Boolean): Self = StObject.set(x, "rectangle-selection", value.asInstanceOf[js.Any])
    
    inline def `setRectangle-selectionUndefined`: Self = StObject.set(x, "rectangle-selection", js.undefined)
  }
}
