package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesVisibleElements extends StObject {
  
  /**
  		 * Indicates whether to display the action bar that holds the feature's [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features-FeaturesViewModel.html#actions) will be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#VisibleElements)
  		 */
  var actionBar: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display a close button on the widget dialog.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#VisibleElements)
  		 */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether pagination for feature navigation will be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#VisibleElements)
  		 */
  var featureNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the widget heading.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#VisibleElements)
  		 */
  var heading: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the widget's loading spinner.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#VisibleElements)
  		 */
  var spinner: js.UndefOr[Boolean] = js.undefined
}
object FeaturesVisibleElements {
  
  inline def apply(): FeaturesVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturesVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setActionBar(value: Boolean): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
    
    inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setFeatureNavigation(value: Boolean): Self = StObject.set(x, "featureNavigation", value.asInstanceOf[js.Any])
    
    inline def setFeatureNavigationUndefined: Self = StObject.set(x, "featureNavigation", js.undefined)
    
    inline def setHeading(value: Boolean): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setSpinner(value: Boolean): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
    
    inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
  }
}
