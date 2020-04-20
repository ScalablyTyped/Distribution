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
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
