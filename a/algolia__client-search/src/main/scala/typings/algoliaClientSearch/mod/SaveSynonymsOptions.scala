package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveSynonymsOptions extends js.Object {
  /**
    * If the saved synonyms should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  /**
    * If the existing synonyms should be removed.
    */
  val replaceExistingSynonyms: js.UndefOr[Boolean] = js.undefined
}

object SaveSynonymsOptions {
  @scala.inline
  def apply(
    forwardToReplicas: js.UndefOr[Boolean] = js.undefined,
    replaceExistingSynonyms: js.UndefOr[Boolean] = js.undefined
  ): SaveSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceExistingSynonyms)) __obj.updateDynamic("replaceExistingSynonyms")(replaceExistingSynonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveSynonymsOptions]
  }
}

