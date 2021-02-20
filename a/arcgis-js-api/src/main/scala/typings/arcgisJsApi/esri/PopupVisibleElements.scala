package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupVisibleElements extends Object {
  
  /**
    * Indicates whether to display a close button on the popup dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to the feature navigation will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var featureNavigation: js.UndefOr[Boolean] = js.native
}
object PopupVisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupVisibleElements]
  }
  
  @scala.inline
  implicit class PopupVisibleElementsMutableBuilder[Self <: PopupVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setFeatureNavigation(value: Boolean): Self = StObject.set(x, "featureNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNavigationUndefined: Self = StObject.set(x, "featureNavigation", js.undefined)
  }
}
