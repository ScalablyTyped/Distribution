package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsContentProperties extends ContentProperties {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.native
}
object AttachmentsContentProperties {
  
  @scala.inline
  def apply(): AttachmentsContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsContentProperties]
  }
  
  @scala.inline
  implicit class AttachmentsContentPropertiesMutableBuilder[Self <: AttachmentsContentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayType(value: preview | list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
  }
}
