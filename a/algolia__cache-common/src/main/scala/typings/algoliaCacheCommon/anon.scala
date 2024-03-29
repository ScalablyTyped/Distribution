package typings.algoliaCacheCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<any>> */
  trait ReadonlyPromiseany extends StObject {
    
    def `catch`[TResult](): js.Promise[Any | TResult]
    
    def `finally`(): js.Promise[Any]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseany {
    
    inline def apply(
      `catch`: () => js.Promise[Any | Any],
      `finally`: () => js.Promise[Any],
      `then`: () => js.Promise[Any | Any]
    ): ReadonlyPromiseany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseany]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyPromiseany] (val x: Self) extends AnyVal {
      
      inline def setCatch(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[Any]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyPromisevoid] (val x: Self) extends AnyVal {
      
      inline def setCatch(value: () => js.Promise[Unit | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[Unit]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
}
