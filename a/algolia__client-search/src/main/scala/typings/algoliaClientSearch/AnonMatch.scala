package typings.algoliaClientSearch

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  /**
    * The explain query match.
    */
  val `match`: AnonAlternatives
  /**
    * Query parameter reporting. Parameters are reported
    * as a JSON object with one field per parameter.
    */
  val params: js.UndefOr[Record[String, _]] = js.undefined
}

object AnonMatch {
  @scala.inline
  def apply(`match`: AnonAlternatives, params: Record[String, _] = null): AnonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatch]
  }
}

