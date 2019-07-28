package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// AQL
trait Query extends js.Object {
  var bindVars: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[QueryOptions] = js.undefined
  var query: String
}

object Query {
  @scala.inline
  def apply(query: String, bindVars: js.Object = null, options: QueryOptions = null): Query = {
    val __obj = js.Dynamic.literal(query = query)
    if (bindVars != null) __obj.updateDynamic("bindVars")(bindVars)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Query]
  }
}

