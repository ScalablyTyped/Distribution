package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleContentElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether to display any [AttachmentsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html) elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
    */
  var attachments: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleContentElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleContentElements]
  }
  
  @scala.inline
  implicit class VisibleContentElementsMutableBuilder[Self <: VisibleContentElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setFields(value: Boolean): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setMedia(value: Boolean): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
