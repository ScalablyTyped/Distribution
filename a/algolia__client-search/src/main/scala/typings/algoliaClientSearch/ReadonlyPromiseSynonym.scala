package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.Synonym
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>> */
trait ReadonlyPromiseSynonym extends js.Object {
  def `catch`[TResult](): js.Promise[Synonym | TResult]
  def `finally`(): js.Promise[Synonym]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSynonym {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Synonym | js.Any],
    `finally`: () => js.Promise[Synonym],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSynonym = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSynonym]
  }
}

