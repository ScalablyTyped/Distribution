package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoliasearchMod {
  import typings.algoliasearch.algoliasearchStrings.attributesToHighlight
  import typings.algoliasearch.algoliasearchStrings.attributesToSnippet
  import typings.algoliasearch.algoliasearchStrings.distinct
  import typings.algoliasearch.algoliasearchStrings.facets
  import typings.algoliasearch.algoliasearchStrings.getRankingInfo
  import typings.algoliasearch.algoliasearchStrings.typoTolerance
  import typings.std.Exclude
  import typings.std.Pick

  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ String, 
    /* apiKey */ String, 
    /* options */ js.UndefOr[ClientOptions], 
    Client
  ]
  type BrowseParameters = Omit[
    QueryParameters, 
    typoTolerance | distinct | facets | getRankingInfo | attributesToHighlight | attributesToSnippet
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
