package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LineChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LineChartMediaInfo")
@js.native
/**
		 * A `LineChartMediaInfo` is a type of chart media element that represents a line chart displayed within a popup.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html)
		 */
open class LineChartMediaInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.LineChartMediaInfo {
  def this(properties: LineChartMediaInfoProperties) = this()
  
  /**
  		 * Provides an alternate text for an image if the image cannot be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#altText)
  		 */
  /* CompleteClass */
  var altText: String = js.native
  
  /**
  		 * Defines a caption for the media.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
  		 */
  /* CompleteClass */
  var caption: String = js.native
  
  /**
  		 * The title of the media element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
  		 */
  /* CompleteClass */
  var title: String = js.native
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
  		 * Defines the chart value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
  		 */
  /* CompleteClass */
  var value: typings.arcgisJsApi.esri.ChartMediaInfoValue = js.native
}
/* static members */
object LineChartMediaInfo {
  
  @JSGlobal("__esri.LineChartMediaInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LineChartMediaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LineChartMediaInfo]
}
