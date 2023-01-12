package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateConversionVisibleElements extends StObject {
  
  /**
    * Indicates whether the capture mode button will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#VisibleElements)
    */
  var captureButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the input coordinate button will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#VisibleElements)
    */
  var editButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the expand and retract buttons will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#VisibleElements)
    */
  var expandButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the settings button will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#VisibleElements)
    */
  var settingsButton: js.UndefOr[Boolean] = js.undefined
}
object CoordinateConversionVisibleElements {
  
  inline def apply(): CoordinateConversionVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordinateConversionVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setCaptureButton(value: Boolean): Self = StObject.set(x, "captureButton", value.asInstanceOf[js.Any])
    
    inline def setCaptureButtonUndefined: Self = StObject.set(x, "captureButton", js.undefined)
    
    inline def setEditButton(value: Boolean): Self = StObject.set(x, "editButton", value.asInstanceOf[js.Any])
    
    inline def setEditButtonUndefined: Self = StObject.set(x, "editButton", js.undefined)
    
    inline def setExpandButton(value: Boolean): Self = StObject.set(x, "expandButton", value.asInstanceOf[js.Any])
    
    inline def setExpandButtonUndefined: Self = StObject.set(x, "expandButton", js.undefined)
    
    inline def setSettingsButton(value: Boolean): Self = StObject.set(x, "settingsButton", value.asInstanceOf[js.Any])
    
    inline def setSettingsButtonUndefined: Self = StObject.set(x, "settingsButton", js.undefined)
  }
}
