package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ListApiKeysResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListApiKeysResponse>> */
trait ReadonlyPromiseListApiKey extends js.Object {
  def `catch`[TResult](): js.Promise[ListApiKeysResponse | TResult]
  def `finally`(): js.Promise[ListApiKeysResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseListApiKey {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListApiKeysResponse | js.Any],
    `finally`: () => js.Promise[ListApiKeysResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListApiKey]
  }
}

