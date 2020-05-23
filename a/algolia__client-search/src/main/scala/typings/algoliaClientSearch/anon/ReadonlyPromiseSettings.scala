package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>> */
trait ReadonlyPromiseSettings extends js.Object {
  def `catch`[TResult](): js.Promise[Settings | TResult]
  def `finally`(): js.Promise[Settings]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSettings {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Settings | js.Any],
    `finally`: () => js.Promise[Settings],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSettings]
  }
}

