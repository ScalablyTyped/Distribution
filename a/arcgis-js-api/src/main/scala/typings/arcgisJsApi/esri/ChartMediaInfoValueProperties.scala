package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartMediaInfoValueProperties extends StObject {
  
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A string containing the name of a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: js.UndefOr[String] = js.undefined
  
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.UndefOr[js.Array[ChartMediaInfoValueSeriesProperties]] = js.undefined
  
  /**
    * String value indicating the tooltip for a chart specified from another field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: js.UndefOr[String] = js.undefined
}
object ChartMediaInfoValueProperties {
  
  @scala.inline
  def apply(): ChartMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMediaInfoValueProperties]
  }
  
  @scala.inline
  implicit class ChartMediaInfoValuePropertiesMutableBuilder[Self <: ChartMediaInfoValueProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setNormalizeField(value: String): Self = StObject.set(x, "normalizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeFieldUndefined: Self = StObject.set(x, "normalizeField", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[ChartMediaInfoValueSeriesProperties]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartMediaInfoValueSeriesProperties*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTooltipField(value: String): Self = StObject.set(x, "tooltipField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipFieldUndefined: Self = StObject.set(x, "tooltipField", js.undefined)
  }
}
