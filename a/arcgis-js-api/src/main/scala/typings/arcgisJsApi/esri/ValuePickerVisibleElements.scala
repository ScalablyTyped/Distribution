package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePickerVisibleElements extends StObject {
  
  /**
  		 * When set to `false`, the next button (or up button when vertical) is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#VisibleElements)
  		 */
  var nextButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the play/pause button is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#VisibleElements)
  		 */
  var playButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the previous button (or down button when vertical) is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#VisibleElements)
  		 */
  var previousButton: js.UndefOr[Boolean] = js.undefined
}
object ValuePickerVisibleElements {
  
  inline def apply(): ValuePickerVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuePickerVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setNextButton(value: Boolean): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setPlayButton(value: Boolean): Self = StObject.set(x, "playButton", value.asInstanceOf[js.Any])
    
    inline def setPlayButtonUndefined: Self = StObject.set(x, "playButton", js.undefined)
    
    inline def setPreviousButton(value: Boolean): Self = StObject.set(x, "previousButton", value.asInstanceOf[js.Any])
    
    inline def setPreviousButtonUndefined: Self = StObject.set(x, "previousButton", js.undefined)
  }
}
