package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMediaInfoProperties
  extends StObject
     with MediaInfoProperties {
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: js.UndefOr[ImageMediaInfoValueProperties] = js.undefined
}
object ImageMediaInfoProperties {
  
  @scala.inline
  def apply(): ImageMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMediaInfoProperties]
  }
  
  @scala.inline
  implicit class ImageMediaInfoPropertiesMutableBuilder[Self <: ImageMediaInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    @scala.inline
    def setValue(value: ImageMediaInfoValueProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
