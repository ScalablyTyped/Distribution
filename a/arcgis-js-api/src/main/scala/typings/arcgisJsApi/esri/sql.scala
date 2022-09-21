package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a [WhereClause](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html) expression that adheres to standardized SQL expressions.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql.html)
  */
trait sql extends StObject {
  
  /**
    * Parses the given where clause string and returns an instance of [WhereClause](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html) when resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql.html#parseWhereClause)
    */
  def parseWhereClause(clause: String, fieldsIndex: FieldsIndex): js.Promise[WhereClause]
}
object sql {
  
  inline def apply(parseWhereClause: (String, FieldsIndex) => js.Promise[WhereClause]): sql = {
    val __obj = js.Dynamic.literal(parseWhereClause = js.Any.fromFunction2(parseWhereClause))
    __obj.asInstanceOf[sql]
  }
  
  extension [Self <: sql](x: Self) {
    
    inline def setParseWhereClause(value: (String, FieldsIndex) => js.Promise[WhereClause]): Self = StObject.set(x, "parseWhereClause", js.Any.fromFunction2(value))
  }
}
