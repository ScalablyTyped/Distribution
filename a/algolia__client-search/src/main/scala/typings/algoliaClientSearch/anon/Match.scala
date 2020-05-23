package typings.algoliaClientSearch.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /**
    * The explain query match.
    */
  var `match`: Alternatives
  /**
    * Query parameter reporting. Parameters are reported
    * as a JSON object with one field per parameter.
    */
  var params: js.UndefOr[Record[String, _]] = js.undefined
}

object Match {
  @scala.inline
  def apply(`match`: Alternatives, params: Record[String, _] = null): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
}

