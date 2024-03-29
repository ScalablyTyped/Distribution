package typings.algoliasearch.anon

import typings.algoliaClientPersonalization.mod.GetPersonalizationStrategyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-personalization.@algolia/client-personalization.GetPersonalizationStrategyResponse>> */
trait ReadonlyPromiseGetPersona extends StObject {
  
  def `catch`[TResult](): js.Promise[GetPersonalizationStrategyResponse | TResult]
  
  def `finally`(): js.Promise[GetPersonalizationStrategyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetPersona {
  
  inline def apply(
    `catch`: () => js.Promise[GetPersonalizationStrategyResponse | Any],
    `finally`: () => js.Promise[GetPersonalizationStrategyResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseGetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetPersona]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseGetPersona] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[GetPersonalizationStrategyResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[GetPersonalizationStrategyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
