package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PieChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PieChartMediaInfo")
@js.native
/**
  * A `PieChartMediaInfo` is a type of chart media element that represents a pie chart displayed within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html)
  */
class PieChartMediaInfoCls ()
  extends StObject
     with typings.arcgisJsApi.esri.PieChartMediaInfo {
  def this(properties: PieChartMediaInfoProperties) = this()
  
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
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  /* CompleteClass */
  var value: typings.arcgisJsApi.esri.ChartMediaInfoValue = js.native
}
