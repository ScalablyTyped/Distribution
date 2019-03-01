package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a synonym object
  */
trait Synonym extends js.Object {
  /**
    * ObjectID of the synonym
    * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
    */
  var objectID: java.lang.String
  /**
    * Values used for the synonym
    * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
    */
  var synonyms: js.Array[java.lang.String]
  /**
    * Type of synonym
    * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
    */
  var `type`: algoliasearchLib.algoliasearchLibStrings.synonym | algoliasearchLib.algoliasearchLibStrings.oneWaySynonym
}

object Synonym {
  @scala.inline
  def apply(
    objectID: java.lang.String,
    synonyms: js.Array[java.lang.String],
    `type`: algoliasearchLib.algoliasearchLibStrings.synonym | algoliasearchLib.algoliasearchLibStrings.oneWaySynonym
  ): Synonym = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("synonyms")(synonyms)
    __obj.asInstanceOf[Synonym]
  }
}

