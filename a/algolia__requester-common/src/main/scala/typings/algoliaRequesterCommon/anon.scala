package typings.algoliaRequesterCommon

import typings.algoliaRequesterCommon.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<@algolia/requester-common.@algolia/requester-common.Response>> */
  trait ReadonlyPromiseResponse extends StObject {
    
    def `catch`[TResult](): js.Promise[Response | TResult]
    
    def `finally`(): js.Promise[Response]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseResponse {
    
    inline def apply(
      `catch`: () => js.Promise[Response | Any],
      `finally`: () => js.Promise[Response],
      `then`: () => js.Promise[Any | Any]
    ): ReadonlyPromiseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseResponse]
    }
    
    extension [Self <: ReadonlyPromiseResponse](x: Self) {
      
      inline def setCatch(value: () => js.Promise[Response | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[Response]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<void>> */
  trait ReadonlyPromisevoid extends StObject {
    
    def `catch`[TResult](): js.Promise[Unit | TResult]
    
    def `finally`(): js.Promise[Unit]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromisevoid {
    
    inline def apply(
      `catch`: () => js.Promise[Unit | Any],
      `finally`: () => js.Promise[Unit],
      `then`: () => js.Promise[Any | Any]
    ): ReadonlyPromisevoid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromisevoid]
    }
    
    extension [Self <: ReadonlyPromisevoid](x: Self) {
      
      inline def setCatch(value: () => js.Promise[Unit | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[Unit]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
}
