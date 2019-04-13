package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on synonyms
  */
trait SynonymOption extends js.Object {
  /**
    * You can forward all settings updates to the replicas of an index
    * https://github.com/algolia/algoliasearch-client-js#replica-settings
    */
  var forwardToReplicas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Replace all existing synonyms on the index with the content of the batch
    * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
    */
  var replaceExistingSynonyms: js.UndefOr[scala.Boolean] = js.undefined
}

object SynonymOption {
  @scala.inline
  def apply(
    forwardToReplicas: js.UndefOr[scala.Boolean] = js.undefined,
    replaceExistingSynonyms: js.UndefOr[scala.Boolean] = js.undefined
  ): SynonymOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardToReplicas)) __obj.updateDynamic("forwardToReplicas")(forwardToReplicas)
    if (!js.isUndefined(replaceExistingSynonyms)) __obj.updateDynamic("replaceExistingSynonyms")(replaceExistingSynonyms)
    __obj.asInstanceOf[SynonymOption]
  }
}

