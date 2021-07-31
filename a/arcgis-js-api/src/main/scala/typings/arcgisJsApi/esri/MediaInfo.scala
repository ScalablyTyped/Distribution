package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInfo extends StObject {
  
  /**
    * Provides an alternate text for an image if the image cannot be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#altText)
    */
  var altText: String
  
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  var caption: String
  
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  var title: String
}
object MediaInfo {
  
  @scala.inline
  def apply(altText: String, caption: String, title: String): MediaInfo = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfo]
  }
  
  @scala.inline
  implicit class MediaInfoMutableBuilder[Self <: MediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
