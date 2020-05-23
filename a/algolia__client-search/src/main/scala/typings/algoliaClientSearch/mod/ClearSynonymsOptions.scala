package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearSynonymsOptions extends js.Object {
  /**
    * If the clear synonyms request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object ClearSynonymsOptions {
  @scala.inline
  def apply(forwardToReplicas: js.UndefOr[Boolean] = js.undefined): ClearSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSynonymsOptions]
  }
}

