package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<boolean>> */
trait ReadonlyPromiseboolean extends StObject {
  
  def `catch`[TResult](): js.Promise[Boolean | TResult]
  
  def `finally`(): js.Promise[Boolean]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseboolean {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Boolean | js.Any],
    `finally`: () => js.Promise[Boolean],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseboolean]
  }
  
  @scala.inline
  implicit class ReadonlyPromisebooleanMutableBuilder[Self <: ReadonlyPromiseboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[Boolean | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[Boolean]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
