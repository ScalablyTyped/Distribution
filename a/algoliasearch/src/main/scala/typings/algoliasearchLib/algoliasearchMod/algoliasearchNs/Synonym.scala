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

