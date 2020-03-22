package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>> */
trait ReadonlyPromiseRule extends js.Object {
  def `catch`[TResult](): js.Promise[Rule | TResult]
  def `finally`(): js.Promise[Rule]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseRule {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Rule | js.Any],
    `finally`: () => js.Promise[Rule],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRule]
  }
}

