package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.ReadonlyPromiseGetPersona
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-recommendation", "getPersonalizationStrategy")
@js.native
object getPersonalizationStrategy extends js.Object {
  def apply(base: RecommendationClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetPersona] = js.native
}

