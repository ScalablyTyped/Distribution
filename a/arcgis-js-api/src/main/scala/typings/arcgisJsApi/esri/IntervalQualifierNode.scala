package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`interval-qualifier`
import typings.arcgisJsApi.arcgisJsApiStrings.day
import typings.arcgisJsApi.arcgisJsApiStrings.hour
import typings.arcgisJsApi.arcgisJsApiStrings.minute
import typings.arcgisJsApi.arcgisJsApiStrings.month
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.second
import typings.arcgisJsApi.arcgisJsApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalQualifierNode
  extends StObject
     with SQLNode {
  
  /**
    * Interval node periods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var period: day | month | hour | second | year | minute
  
  /**
    * Precision for an interval data type includes interval leading precision, interval precision, and seconds precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var precision: Double
  
  /**
    * Seconds precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var secondary: number
  
  var `type`: `interval-qualifier`
}
object IntervalQualifierNode {
  
  inline def apply(period: day | month | hour | second | year | minute, precision: Double): IntervalQualifierNode = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], secondary = "number")
    __obj.updateDynamic("type")("interval-qualifier")
    __obj.asInstanceOf[IntervalQualifierNode]
  }
  
  extension [Self <: IntervalQualifierNode](x: Self) {
    
    inline def setPeriod(value: day | month | hour | second | year | minute): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: number): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setType(value: `interval-qualifier`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
