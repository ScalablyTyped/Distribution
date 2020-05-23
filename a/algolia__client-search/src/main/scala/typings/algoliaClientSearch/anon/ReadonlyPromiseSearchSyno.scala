package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchSynonymsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>> */
trait ReadonlyPromiseSearchSyno extends js.Object {
  def `catch`[TResult](): js.Promise[SearchSynonymsResponse | TResult]
  def `finally`(): js.Promise[SearchSynonymsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSearchSyno {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SearchSynonymsResponse | js.Any],
    `finally`: () => js.Promise[SearchSynonymsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSearchSyno = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchSyno]
  }
}

