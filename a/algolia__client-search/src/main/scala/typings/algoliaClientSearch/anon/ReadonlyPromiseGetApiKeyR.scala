package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.GetApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetApiKeyResponse>> */
trait ReadonlyPromiseGetApiKeyR extends js.Object {
  def `catch`[TResult](): js.Promise[GetApiKeyResponse | TResult]
  def `finally`(): js.Promise[GetApiKeyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseGetApiKeyR {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetApiKeyResponse | js.Any],
    `finally`: () => js.Promise[GetApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetApiKeyR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetApiKeyR]
  }
}

