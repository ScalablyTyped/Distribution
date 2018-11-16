package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Describes options used when searching for query rules
   */

trait SearchRuleOptions extends js.Object {
  /**
       * When specified, restricts matches to rules with a specific anchoring type.
       * When omitted, all anchoring types may match.
       */
  var anchoring: js.UndefOr[java.lang.String] = js.undefined
  /**
       * When specified, restricts matches to contextual rules with a specific context (exact match).
       * When omitted, any generic or contextual rule (with any context) may match.
       */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Number of hits per page
       * default: 20
       */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
       * Requested page (zero-based)
       * default: 0
       */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
       * The actual search query to find synonyms
       */
  var query: js.UndefOr[java.lang.String] = js.undefined
}

