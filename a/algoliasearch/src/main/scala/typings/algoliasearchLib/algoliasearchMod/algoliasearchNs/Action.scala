package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe the action object used for batch operation
  */
trait Action extends js.Object {
  /**
    * Type of the batch action
    * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
    */
  var action: algoliasearchLib.algoliasearchLibStrings.addObject | algoliasearchLib.algoliasearchLibStrings.updateObject | algoliasearchLib.algoliasearchLibStrings.partialUpdateObject | algoliasearchLib.algoliasearchLibStrings.partialUpdateObjectNoCreate | algoliasearchLib.algoliasearchLibStrings.deleteObject | algoliasearchLib.algoliasearchLibStrings.delete | algoliasearchLib.algoliasearchLibStrings.clear
  /**
    * Name of the index where the bact will be performed
    * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
    */
  var indexName: java.lang.String
}

object Action {
  @scala.inline
  def apply(
    action: algoliasearchLib.algoliasearchLibStrings.addObject | algoliasearchLib.algoliasearchLibStrings.updateObject | algoliasearchLib.algoliasearchLibStrings.partialUpdateObject | algoliasearchLib.algoliasearchLibStrings.partialUpdateObjectNoCreate | algoliasearchLib.algoliasearchLibStrings.deleteObject | algoliasearchLib.algoliasearchLibStrings.delete | algoliasearchLib.algoliasearchLibStrings.clear,
    indexName: java.lang.String
  ): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("indexName")(indexName)
    __obj.asInstanceOf[Action]
  }
}

