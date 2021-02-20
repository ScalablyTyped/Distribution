package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ASC
import typings.arcgisJsApi.arcgisJsApiStrings.DESC
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticDefinitionStatisticParameters extends Object {
  
  /**
    * Specify `ASC` (ascending) or `DESC` (descending) to control the order of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var orderBy: js.UndefOr[ASC | DESC] = js.native
  
  /**
    * Percentile value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var value: Double = js.native
}
object StatisticDefinitionStatisticParameters {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double
  ): StatisticDefinitionStatisticParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionStatisticParameters]
  }
  
  @scala.inline
  implicit class StatisticDefinitionStatisticParametersMutableBuilder[Self <: StatisticDefinitionStatisticParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderBy(value: ASC | DESC): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
