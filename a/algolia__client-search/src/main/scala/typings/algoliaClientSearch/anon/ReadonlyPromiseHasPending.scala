package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.HasPendingMappingsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>> */
@js.native
trait ReadonlyPromiseHasPending extends js.Object {
  
  def `catch`[TResult](): js.Promise[HasPendingMappingsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[HasPendingMappingsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseHasPending {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[HasPendingMappingsResponse | js.Any],
    `finally`: () => js.Promise[HasPendingMappingsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseHasPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseHasPending]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseHasPendingOps[Self <: ReadonlyPromiseHasPending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatch(value: () => js.Promise[HasPendingMappingsResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[HasPendingMappingsResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
}
