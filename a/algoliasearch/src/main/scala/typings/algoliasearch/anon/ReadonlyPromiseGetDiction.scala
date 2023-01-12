package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.GetDictionarySettingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetDictionarySettingsResponse>> */
trait ReadonlyPromiseGetDiction extends StObject {
  
  def `catch`[TResult](): js.Promise[GetDictionarySettingsResponse | TResult]
  
  def `finally`(): js.Promise[GetDictionarySettingsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetDiction {
  
  inline def apply(
    `catch`: () => js.Promise[GetDictionarySettingsResponse | Any],
    `finally`: () => js.Promise[GetDictionarySettingsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseGetDiction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetDiction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseGetDiction] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[GetDictionarySettingsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[GetDictionarySettingsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
