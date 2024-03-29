package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.GetLogsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>> */
trait ReadonlyPromiseGetLogsRes extends StObject {
  
  def `catch`[TResult](): js.Promise[GetLogsResponse | TResult]
  
  def `finally`(): js.Promise[GetLogsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetLogsRes {
  
  inline def apply(
    `catch`: () => js.Promise[GetLogsResponse | Any],
    `finally`: () => js.Promise[GetLogsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseGetLogsRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetLogsRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseGetLogsRes] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[GetLogsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[GetLogsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
