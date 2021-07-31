package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: js.UndefOr[
    BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[js.Any]
  ] = js.undefined
}
object MediaContentProperties {
  
  @scala.inline
  def apply(): MediaContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentProperties]
  }
  
  @scala.inline
  implicit class MediaContentPropertiesMutableBuilder[Self <: MediaContentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaInfos(
      value: BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[js.Any]
    ): Self = StObject.set(x, "mediaInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfosUndefined: Self = StObject.set(x, "mediaInfos", js.undefined)
    
    @scala.inline
    def setMediaInfosVarargs(value: js.Any*): Self = StObject.set(x, "mediaInfos", js.Array(value :_*))
  }
}
