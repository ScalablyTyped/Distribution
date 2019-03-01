package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLike extends js.Object {
  var query: java.lang.String
  var text: java.lang.String
  var values: js.Array[_]
}

object QueryLike {
  @scala.inline
  def apply(query: java.lang.String, text: java.lang.String, values: js.Array[_]): QueryLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryLike]
  }
}

