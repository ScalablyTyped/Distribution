package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`column-reference`
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnNode
  extends StObject
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
  
  inline def apply(): ColumnNode = {
    val __obj = js.Dynamic.literal(column = "string")
    __obj.updateDynamic("type")("column-reference")
    __obj.asInstanceOf[ColumnNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnNode] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: string_): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setType(value: `column-reference`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
