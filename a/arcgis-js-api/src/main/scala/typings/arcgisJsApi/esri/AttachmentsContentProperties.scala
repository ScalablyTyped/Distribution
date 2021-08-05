package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.undefined
}
object AttachmentsContentProperties {
  
  inline def apply(): AttachmentsContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsContentProperties]
  }
  
  extension [Self <: AttachmentsContentProperties](x: Self) {
    
    inline def setDisplayType(value: preview | list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
  }
}
