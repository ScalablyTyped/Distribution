package typings.algoliaClientRecommendation.anon

import typings.algoliaClientRecommendation.mod.GetPersonalizationStrategyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>> */
trait ReadonlyPromiseGetPersona extends js.Object {
  def `catch`[TResult](): js.Promise[GetPersonalizationStrategyResponse | TResult]
  def `finally`(): js.Promise[GetPersonalizationStrategyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseGetPersona {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetPersonalizationStrategyResponse | js.Any],
    `finally`: () => js.Promise[GetPersonalizationStrategyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetPersona]
  }
}

