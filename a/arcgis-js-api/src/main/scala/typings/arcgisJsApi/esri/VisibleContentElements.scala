package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleContentElements extends StObject {
  
  /**
  		 * Indicates whether to display any [AttachmentsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
  		 */
  var attachments: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display any [ExpressionContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
  		 */
  var expression: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display any [FieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
  		 */
  var fields: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display any [MediaContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
  		 */
  var media: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display any [TextContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
  		 */
  var text: js.UndefOr[Boolean] = js.undefined
}
object VisibleContentElements {
  
  inline def apply(): VisibleContentElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleContentElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleContentElements] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setFields(value: Boolean): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setMedia(value: Boolean): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
