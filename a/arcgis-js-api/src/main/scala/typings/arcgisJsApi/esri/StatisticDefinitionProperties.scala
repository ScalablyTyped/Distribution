package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`percentile-continuous`
import typings.arcgisJsApi.arcgisJsApiStrings.`percentile-discrete`
import typings.arcgisJsApi.arcgisJsApiStrings.`var`
import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.stddev
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticDefinitionProperties extends js.Object {
  
  /**
    * Defines the field for which statistics will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[String] = js.native
  
  /**
    * Specifies the output field name for the requested statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: js.UndefOr[String] = js.native
  
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var statisticParameters: js.UndefOr[StatisticDefinitionStatisticParameters] = js.native
  
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: js.UndefOr[
    count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete`
  ] = js.native
}
object StatisticDefinitionProperties {
  
  @scala.inline
  def apply(): StatisticDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticDefinitionProperties]
  }
  
  @scala.inline
  implicit class StatisticDefinitionPropertiesOps[Self <: StatisticDefinitionProperties] (val x: Self) extends AnyVal {
    
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
    def setOnStatisticField(value: String): Self = this.set("onStatisticField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStatisticField: Self = this.set("onStatisticField", js.undefined)
    
    @scala.inline
    def setOutStatisticFieldName(value: String): Self = this.set("outStatisticFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutStatisticFieldName: Self = this.set("outStatisticFieldName", js.undefined)
    
    @scala.inline
    def setStatisticParameters(value: StatisticDefinitionStatisticParameters): Self = this.set("statisticParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatisticParameters: Self = this.set("statisticParameters", js.undefined)
    
    @scala.inline
    def setStatisticType(
      value: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete`
    ): Self = this.set("statisticType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatisticType: Self = this.set("statisticType", js.undefined)
  }
}
