package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Describes a query rule object
   */

trait Rule extends js.Object {
  /**
       * Condition of the rule
       */
  var condition: algoliasearchLib.Anon_Pattern
  /**
       * Consequence of the rule. At least one of the following must be used:
       */
  var consequence: algoliasearchLib.Anon_UserData
  /**
       * This field is intended for rule management purposes,
       * in particular to ease searching for rules and presenting them to human readers.
       * It is not interpreted by the API.
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ObjectID of the synonym
       * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
       */
  var objectID: java.lang.String
}

