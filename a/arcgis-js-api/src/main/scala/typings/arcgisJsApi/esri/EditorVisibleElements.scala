package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorVisibleElements extends StObject {
  
  /**
    * Indicates whether to display snapping controls' `Snapping layers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var layerList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether snapping controls will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var snappingControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The elements contained within the snapping controls.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var snappingControlsElements: js.UndefOr[VisibleElementsSnappingControlsElements] = js.undefined
}
object EditorVisibleElements {
  
  inline def apply(): EditorVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setLayerList(value: Boolean): Self = StObject.set(x, "layerList", value.asInstanceOf[js.Any])
    
    inline def setLayerListUndefined: Self = StObject.set(x, "layerList", js.undefined)
    
    inline def setSnappingControls(value: Boolean): Self = StObject.set(x, "snappingControls", value.asInstanceOf[js.Any])
    
    inline def setSnappingControlsElements(value: VisibleElementsSnappingControlsElements): Self = StObject.set(x, "snappingControlsElements", value.asInstanceOf[js.Any])
    
    inline def setSnappingControlsElementsUndefined: Self = StObject.set(x, "snappingControlsElements", js.undefined)
    
    inline def setSnappingControlsUndefined: Self = StObject.set(x, "snappingControls", js.undefined)
  }
}
