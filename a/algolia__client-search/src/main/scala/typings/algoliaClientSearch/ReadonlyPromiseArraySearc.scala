package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.SearchForFacetValuesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>> */
trait ReadonlyPromiseArraySearc extends js.Object {
  def `catch`[TResult](): js.Promise[js.Array[SearchForFacetValuesResponse] | TResult]
  def `finally`(): js.Promise[js.Array[SearchForFacetValuesResponse]]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseArraySearc {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[js.Array[SearchForFacetValuesResponse] | js.Any],
    `finally`: () => js.Promise[js.Array[SearchForFacetValuesResponse]],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseArraySearc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseArraySearc]
  }
}

