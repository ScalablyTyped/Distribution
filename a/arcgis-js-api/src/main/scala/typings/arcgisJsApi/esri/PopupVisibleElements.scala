package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupVisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether to display a close button on the popup dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to the feature navigation will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var featureNavigation: js.UndefOr[Boolean] = js.undefined
}
object PopupVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupVisibleElements]
  }
  
  extension [Self <: PopupVisibleElements](x: Self) {
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setFeatureNavigation(value: Boolean): Self = StObject.set(x, "featureNavigation", value.asInstanceOf[js.Any])
    
    inline def setFeatureNavigationUndefined: Self = StObject.set(x, "featureNavigation", js.undefined)
  }
}
