package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMediaInfoValueProperties extends StObject {
  
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: js.UndefOr[String] = js.undefined
  
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: js.UndefOr[String] = js.undefined
}
object ImageMediaInfoValueProperties {
  
  @scala.inline
  def apply(): ImageMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMediaInfoValueProperties]
  }
  
  @scala.inline
  implicit class ImageMediaInfoValuePropertiesMutableBuilder[Self <: ImageMediaInfoValueProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkURL(value: String): Self = StObject.set(x, "linkURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkURLUndefined: Self = StObject.set(x, "linkURL", js.undefined)
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
  }
}
