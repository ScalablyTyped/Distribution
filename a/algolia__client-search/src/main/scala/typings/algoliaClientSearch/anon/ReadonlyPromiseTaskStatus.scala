package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.TaskStatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.TaskStatusResponse>> */
@js.native
trait ReadonlyPromiseTaskStatus extends StObject {
  
  def `catch`[TResult](): js.Promise[TaskStatusResponse | TResult] = js.native
  
  def `finally`(): js.Promise[TaskStatusResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseTaskStatus {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[TaskStatusResponse | js.Any],
    `finally`: () => js.Promise[TaskStatusResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseTaskStatus]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseTaskStatusMutableBuilder[Self <: ReadonlyPromiseTaskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[TaskStatusResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[TaskStatusResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
