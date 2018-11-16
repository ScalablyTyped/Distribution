package typings
package algoliasearchLib.liteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoliasearchNs {
  type BrowseParameters = algoliasearchLib.liteMod.Omit[
    QueryParameters, 
    algoliasearchLib.algoliasearchLibStrings.typoTolerance | algoliasearchLib.algoliasearchLibStrings.distinct | algoliasearchLib.algoliasearchLibStrings.facets | algoliasearchLib.algoliasearchLibStrings.getRankingInfo | algoliasearchLib.algoliasearchLibStrings.attributesToHighlight | algoliasearchLib.algoliasearchLibStrings.attributesToSnippet
  ]
}
