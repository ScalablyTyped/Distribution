package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on query rules
  */
trait RuleOption extends js.Object {
  /**
    * Replace all existing query rules on the index with the content of the batch
    */
  var clearExistingRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can forward all settings updates to the replicas of an index
    * https://github.com/algolia/algoliasearch-client-js#replica-settings
    */
  var forwardToReplicas: js.UndefOr[scala.Boolean] = js.undefined
}

