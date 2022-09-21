package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`column-reference`
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * Column or field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#ColumnNode)
    */
  var column: string_
  
  var `type`: `column-reference`
}
object ColumnNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColumnNode = {
    val __obj = js.Dynamic.literal(column = "string", constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("column-reference")
    __obj.asInstanceOf[ColumnNode]
  }
  
  extension [Self <: ColumnNode](x: Self) {
    
    inline def setColumn(value: string_): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setType(value: `column-reference`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
