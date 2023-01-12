package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupVisibleElements extends StObject {
  
  /**
    * Indicates whether to display a close button on the popup dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether pagination for feature navigation will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var featureNavigation: js.UndefOr[Boolean] = js.undefined
}
object PopupVisibleElements {
  
  inline def apply(): PopupVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setFeatureNavigation(value: Boolean): Self = StObject.set(x, "featureNavigation", value.asInstanceOf[js.Any])
    
    inline def setFeatureNavigationUndefined: Self = StObject.set(x, "featureNavigation", js.undefined)
  }
}
