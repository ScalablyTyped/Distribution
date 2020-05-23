package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ListIndicesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListIndicesResponse>> */
trait ReadonlyPromiseListIndice extends js.Object {
  def `catch`[TResult](): js.Promise[ListIndicesResponse | TResult]
  def `finally`(): js.Promise[ListIndicesResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseListIndice {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListIndicesResponse | js.Any],
    `finally`: () => js.Promise[ListIndicesResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListIndice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListIndice]
  }
}

