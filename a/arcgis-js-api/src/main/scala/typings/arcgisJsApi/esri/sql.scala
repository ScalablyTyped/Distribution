package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sql extends js.Object {
  /**
    * Parses the given where clause string and returns an instance of [WhereClause](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html) when resolved. The `WhereClause` object can be used repeatedly against different features, to test if they individually meet the condition. The parser does not parse a whole SQL statement (ie. `SELECT X… WHERE…`). It only parses the expression after the `where` token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql.html#parseWhereClause)
    *
    * @param clause The SQL where clause expression.
    * @param fieldsIndex The [fields index](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fieldsIndex) of the layer. The fields index is used to match the fields found in the where clause against the service, to fix casing for example.
    *
    */
  def parseWhereClause(clause: String, fieldsIndex: FieldsIndex): js.Promise[WhereClause]
}

object sql {
  @scala.inline
  def apply(parseWhereClause: (String, FieldsIndex) => js.Promise[WhereClause]): sql = {
    val __obj = js.Dynamic.literal(parseWhereClause = js.Any.fromFunction2(parseWhereClause))
    __obj.asInstanceOf[sql]
  }
}

