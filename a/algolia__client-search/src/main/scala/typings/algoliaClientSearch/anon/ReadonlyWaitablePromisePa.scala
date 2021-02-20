package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.PartialUpdateObjectResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.PartialUpdateObjectResponse>> */
@js.native
trait ReadonlyWaitablePromisePa extends StObject {
  
  def `catch`[TResult](): js.Promise[PartialUpdateObjectResponse | TResult] = js.native
  
  def `finally`(): js.Promise[PartialUpdateObjectResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromisePa {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[PartialUpdateObjectResponse | js.Any],
    `finally`: () => js.Promise[PartialUpdateObjectResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromisePa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromisePa]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromisePaMutableBuilder[Self <: ReadonlyWaitablePromisePa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[PartialUpdateObjectResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[PartialUpdateObjectResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
