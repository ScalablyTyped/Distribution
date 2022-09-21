package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQLExpressionInfo
  extends StObject
     with Object {
  
  /**
    * The SQL expression used for querying the predominant category given a set of fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#SQLExpressionInfo)
    */
  var sqlExpression: String
  
  /**
    * The SQL where clause used to query the predominant value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#SQLExpressionInfo)
    */
  var sqlWhere: String
}
object SQLExpressionInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sqlExpression: String,
    sqlWhere: String
  ): SQLExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sqlExpression = sqlExpression.asInstanceOf[js.Any], sqlWhere = sqlWhere.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLExpressionInfo]
  }
  
  extension [Self <: SQLExpressionInfo](x: Self) {
    
    inline def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    inline def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
  }
}
