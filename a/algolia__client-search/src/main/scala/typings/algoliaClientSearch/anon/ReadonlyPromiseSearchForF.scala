package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchForFacetValuesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>> */
trait ReadonlyPromiseSearchForF extends js.Object {
  def `catch`[TResult](): js.Promise[SearchForFacetValuesResponse | TResult]
  def `finally`(): js.Promise[SearchForFacetValuesResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSearchForF {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SearchForFacetValuesResponse | js.Any],
    `finally`: () => js.Promise[SearchForFacetValuesResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSearchForF = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchForF]
  }
}

