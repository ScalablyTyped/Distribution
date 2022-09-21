package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityExpressionInfo
  extends StObject
     with Object {
  
  /**
    * The SQL expressions used for querying the histogram using the percentage the predominant value comprises among of a set of fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#OpacityExpressionInfo)
    */
  var histogramQuery: SQLExpressionInfo
  
  /**
    * The SQL expressions used for querying the percentage the predominant value comprises among of a set of fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#OpacityExpressionInfo)
    */
  var statisticsQuery: SQLExpressionInfo
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#OpacityExpressionInfo)
    */
  var valueExpression: String
}
object OpacityExpressionInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    histogramQuery: SQLExpressionInfo,
    propertyIsEnumerable: PropertyKey => Boolean,
    statisticsQuery: SQLExpressionInfo,
    valueExpression: String
  ): OpacityExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), histogramQuery = histogramQuery.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statisticsQuery = statisticsQuery.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityExpressionInfo]
  }
  
  extension [Self <: OpacityExpressionInfo](x: Self) {
    
    inline def setHistogramQuery(value: SQLExpressionInfo): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    inline def setStatisticsQuery(value: SQLExpressionInfo): Self = StObject.set(x, "statisticsQuery", value.asInstanceOf[js.Any])
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
  }
}
