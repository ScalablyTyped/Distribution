package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Describes the attachment's content in detail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A string value indicating how to display an attachment.
    *
    * @default "auto"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: js.UndefOr[auto | preview | list] = js.undefined
  
  /**
    * A heading indicating what the attachment's content represents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object AttachmentsContentProperties {
  
  inline def apply(): AttachmentsContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsContentProperties]
  }
  
  extension [Self <: AttachmentsContentProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayType(value: auto | preview | list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
