package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSynonymOptions extends js.Object {
  /**
    * If the delete synonym request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}

object DeleteSynonymOptions {
  @scala.inline
  def apply(forwardToReplicas: js.UndefOr[Boolean] = js.undefined): DeleteSynonymOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSynonymOptions]
  }
}

