package typings.algoliaClientRecommendation

import typings.algoliaClientRecommendation.mod.SetPersonalizationStrategyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.SetPersonalizationStrategyResponse>> */
trait ReadonlyPromiseSetPersona extends js.Object {
  def `catch`[TResult](): js.Promise[SetPersonalizationStrategyResponse | TResult]
  def `finally`(): js.Promise[SetPersonalizationStrategyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSetPersona {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SetPersonalizationStrategyResponse | js.Any],
    `finally`: () => js.Promise[SetPersonalizationStrategyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSetPersona]
  }
}

