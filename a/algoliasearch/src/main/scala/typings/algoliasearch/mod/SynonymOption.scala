package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on synonyms
  */
trait SynonymOption extends js.Object {
  /**
    * You can forward all settings updates to the replicas of an index
    */
  var forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  /**
    * Replace all existing synonyms on the index with the content of the batch
    */
  var replaceExistingSynonyms: js.UndefOr[Boolean] = js.undefined
}

object SynonymOption {
  @scala.inline
  def apply(
    forwardToReplicas: js.UndefOr[Boolean] = js.undefined,
    replaceExistingSynonyms: js.UndefOr[Boolean] = js.undefined
  ): SynonymOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceExistingSynonyms)) __obj.updateDynamic("replaceExistingSynonyms")(replaceExistingSynonyms.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymOption]
  }
}

