package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>> */
trait ReadonlyPromiseSettings extends StObject {
  
  def `catch`[TResult](): js.Promise[Settings | TResult]
  
  def `finally`(): js.Promise[Settings]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSettings {
  
  inline def apply(
    `catch`: () => js.Promise[Settings | Any],
    `finally`: () => js.Promise[Settings],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSettings]
  }
  
  extension [Self <: ReadonlyPromiseSettings](x: Self) {
    
    inline def setCatch(value: () => js.Promise[Settings | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[Settings]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
