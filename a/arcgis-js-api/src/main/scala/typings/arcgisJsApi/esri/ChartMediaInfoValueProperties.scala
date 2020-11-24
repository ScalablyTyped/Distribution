package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartMediaInfoValueProperties extends js.Object {
  
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A string containing the name of a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: js.UndefOr[String] = js.native
  
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.UndefOr[js.Array[ChartMediaInfoValueSeriesProperties]] = js.native
  
  /**
    * String value indicating the tooltip for a chart specified from another field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: js.UndefOr[String] = js.native
}
object ChartMediaInfoValueProperties {
  
  @scala.inline
  def apply(): ChartMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMediaInfoValueProperties]
  }
  
  @scala.inline
  implicit class ChartMediaInfoValuePropertiesOps[Self <: ChartMediaInfoValueProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setNormalizeField(value: String): Self = this.set("normalizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeField: Self = this.set("normalizeField", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartMediaInfoValueSeriesProperties*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[ChartMediaInfoValueSeriesProperties]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setTooltipField(value: String): Self = this.set("tooltipField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipField: Self = this.set("tooltipField", js.undefined)
  }
}
