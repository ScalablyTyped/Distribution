package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`interval-period`
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

trait IntervalPeriodNode
  extends StObject
     with SQLNode {
  
  /**
    * Interval node periods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalPeriodNode)
    */
  var period: day | month | hour | second | year | minute
  
  var precision: Double
  
  var secondary: number
  
  var `type`: `interval-period`
}
object IntervalPeriodNode {
  
  inline def apply(period: day | month | hour | second | year | minute, precision: Double): IntervalPeriodNode = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], secondary = "number")
    __obj.updateDynamic("type")("interval-period")
    __obj.asInstanceOf[IntervalPeriodNode]
  }
  
  extension [Self <: IntervalPeriodNode](x: Self) {
    
    inline def setPeriod(value: day | month | hour | second | year | minute): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: number): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setType(value: `interval-period`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
