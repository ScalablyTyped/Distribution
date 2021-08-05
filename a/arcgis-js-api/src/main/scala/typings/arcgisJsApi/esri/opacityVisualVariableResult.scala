package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opacityVisualVariableResult
  extends StObject
     with Object {
  
  /**
    * Authoring information related to the creation of the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo
  
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var defaultValuesUsed: Boolean
  
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult
  
  /**
    * An opacity visual variable configured based on the statistics of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var visualVariable: OpacityVariable
}
object opacityVisualVariableResult {
  
  inline def apply(
    authoringInfo: AuthoringInfo,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    statistics: SummaryStatisticsResult,
    visualVariable: OpacityVariable
  ): opacityVisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics.asInstanceOf[js.Any], visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[opacityVisualVariableResult]
  }
  
  extension [Self <: opacityVisualVariableResult](x: Self) {
    
    inline def setAuthoringInfo(value: AuthoringInfo): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setVisualVariable(value: OpacityVariable): Self = StObject.set(x, "visualVariable", value.asInstanceOf[js.Any])
  }
}
