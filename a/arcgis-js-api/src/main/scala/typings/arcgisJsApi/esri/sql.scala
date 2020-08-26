package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def parseWhereClause(clause: String, fieldsIndex: FieldsIndex): js.Promise[WhereClause] = js.native
}

object sql {
  @scala.inline
  def apply(parseWhereClause: (String, FieldsIndex) => js.Promise[WhereClause]): sql = {
    val __obj = js.Dynamic.literal(parseWhereClause = js.Any.fromFunction2(parseWhereClause))
    __obj.asInstanceOf[sql]
  }
  @scala.inline
  implicit class sqlOps[Self <: sql] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParseWhereClause(value: (String, FieldsIndex) => js.Promise[WhereClause]): Self = this.set("parseWhereClause", js.Any.fromFunction2(value))
  }
  
}

