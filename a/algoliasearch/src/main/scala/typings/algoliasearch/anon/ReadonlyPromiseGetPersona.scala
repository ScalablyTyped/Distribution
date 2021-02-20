package typings.algoliasearch.anon

import typings.algoliaClientRecommendation.mod.GetPersonalizationStrategyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>> */
@js.native
trait ReadonlyPromiseGetPersona extends StObject {
  
  def `catch`[TResult](): js.Promise[GetPersonalizationStrategyResponse | TResult] = js.native
  
  def `finally`(): js.Promise[GetPersonalizationStrategyResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseGetPersona {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetPersonalizationStrategyResponse | js.Any],
    `finally`: () => js.Promise[GetPersonalizationStrategyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetPersona]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseGetPersonaMutableBuilder[Self <: ReadonlyPromiseGetPersona] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[GetPersonalizationStrategyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[GetPersonalizationStrategyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
