package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abilities extends StObject {
  
  /**
  		 * Indicate whether the widget should query and display [attachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html) associated with the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var attachmentsContent: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicate whether the widget should display animations for charts residing in [media content elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var chartAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicate whether the widget should display any [custom content elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var customContent: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicate whether the widget should display any [fields content elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var fieldsContent: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicate whether the widget should display any [media content elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var mediaContent: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicate whether the widget should display any [text content elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities)
  		 */
  var textContent: js.UndefOr[Boolean] = js.undefined
}
object Abilities {
  
  inline def apply(): Abilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abilities] (val x: Self) extends AnyVal {
    
    inline def setAttachmentsContent(value: Boolean): Self = StObject.set(x, "attachmentsContent", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsContentUndefined: Self = StObject.set(x, "attachmentsContent", js.undefined)
    
    inline def setChartAnimation(value: Boolean): Self = StObject.set(x, "chartAnimation", value.asInstanceOf[js.Any])
    
    inline def setChartAnimationUndefined: Self = StObject.set(x, "chartAnimation", js.undefined)
    
    inline def setCustomContent(value: Boolean): Self = StObject.set(x, "customContent", value.asInstanceOf[js.Any])
    
    inline def setCustomContentUndefined: Self = StObject.set(x, "customContent", js.undefined)
    
    inline def setFieldsContent(value: Boolean): Self = StObject.set(x, "fieldsContent", value.asInstanceOf[js.Any])
    
    inline def setFieldsContentUndefined: Self = StObject.set(x, "fieldsContent", js.undefined)
    
    inline def setMediaContent(value: Boolean): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
    
    inline def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
    
    inline def setTextContent(value: Boolean): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
