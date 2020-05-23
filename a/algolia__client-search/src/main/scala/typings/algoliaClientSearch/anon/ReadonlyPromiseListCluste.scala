package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ListClustersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListClustersResponse>> */
trait ReadonlyPromiseListCluste extends js.Object {
  def `catch`[TResult](): js.Promise[ListClustersResponse | TResult]
  def `finally`(): js.Promise[ListClustersResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseListCluste {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListClustersResponse | js.Any],
    `finally`: () => js.Promise[ListClustersResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListCluste = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListCluste]
  }
}

