package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ java.lang.String, 
    /* apiKey */ java.lang.String, 
    /* options */ js.UndefOr[typings.algoliasearch.mod.ClientOptions], 
    typings.algoliasearch.mod.Client
  ]
  type BrowseParameters = typings.algoliasearch.mod.Omit[
    typings.algoliasearch.mod.QueryParameters, 
    typings.algoliasearch.algoliasearchStrings.typoTolerance | typings.algoliasearch.algoliasearchStrings.distinct | typings.algoliasearch.algoliasearchStrings.facets | typings.algoliasearch.algoliasearchStrings.getRankingInfo | typings.algoliasearch.algoliasearchStrings.attributesToHighlight | typings.algoliasearch.algoliasearchStrings.attributesToSnippet
  ]
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
