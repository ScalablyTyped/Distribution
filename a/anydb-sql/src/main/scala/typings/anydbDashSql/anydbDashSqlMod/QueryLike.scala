package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLike extends js.Object {
  var query: String
  var text: String
  var values: js.Array[_]
}

object QueryLike {
  @scala.inline
  def apply(query: String, text: String, values: js.Array[_]): QueryLike = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryLike]
  }
}

