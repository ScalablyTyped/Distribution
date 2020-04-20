package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResults extends js.Object {
  var results: js.Array[js.Object]
}

object AnonResults {
  @scala.inline
  def apply(results: js.Array[js.Object]): AnonResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResults]
  }
}

