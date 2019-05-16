package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoliasearchMod {
  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ java.lang.String, 
    /* apiKey */ java.lang.String, 
    /* options */ js.UndefOr[ClientOptions], 
    Client
  ]
  type BrowseParameters = algoliasearchLib.Omit[
    QueryParameters, 
    algoliasearchLib.algoliasearchLibStrings.typoTolerance | algoliasearchLib.algoliasearchLibStrings.distinct | algoliasearchLib.algoliasearchLibStrings.facets | algoliasearchLib.algoliasearchLibStrings.getRankingInfo | algoliasearchLib.algoliasearchLibStrings.attributesToHighlight | algoliasearchLib.algoliasearchLibStrings.attributesToSnippet
  ]
}
