package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Index of the current active media within the popup's media content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#activeMediaInfoIndex)
    */
  var activeMediaInfoIndex: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the media's content in detail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: js.UndefOr[
    BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[Any]
  ] = js.undefined
  
  /**
    * Heading indicating what the media's content represents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object MediaContentProperties {
  
  inline def apply(): MediaContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaContentProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveMediaInfoIndex(value: String): Self = StObject.set(x, "activeMediaInfoIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveMediaInfoIndexUndefined: Self = StObject.set(x, "activeMediaInfoIndex", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMediaInfos(
      value: BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[Any]
    ): Self = StObject.set(x, "mediaInfos", value.asInstanceOf[js.Any])
    
    inline def setMediaInfosUndefined: Self = StObject.set(x, "mediaInfos", js.undefined)
    
    inline def setMediaInfosVarargs(value: Any*): Self = StObject.set(x, "mediaInfos", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
