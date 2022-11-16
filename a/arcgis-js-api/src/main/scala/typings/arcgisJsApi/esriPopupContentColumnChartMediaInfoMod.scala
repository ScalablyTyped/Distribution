package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ChartMediaInfoValue
import typings.arcgisJsApi.esri.ColumnChartMediaInfo
import typings.arcgisJsApi.esri.ColumnChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentColumnChartMediaInfoMod {
  
  @JSImport("esri/popup/content/ColumnChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `ColumnChartMediaInfo` is a type of chart media element that represents a column chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html)
    */
  open class ^ ()
    extends StObject
       with ColumnChartMediaInfo {
    def this(properties: ColumnChartMediaInfoProperties) = this()
    
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
      * Indicates the type of chart.
      *
      * @default column-chart
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
      */
    /* CompleteClass */
    override val `type`: String = js.native
    
    /**
      * Defines the chart value.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
      */
    /* CompleteClass */
    var value: ChartMediaInfoValue = js.native
  }
  @JSImport("esri/popup/content/ColumnChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColumnChartMediaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColumnChartMediaInfo]
}
