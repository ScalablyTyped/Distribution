package typings.algoliaLoggerCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<void>> */
  @js.native
  trait ReadonlyPromisevoid extends StObject {
    
    def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
    
    def `finally`(): js.Promise[Unit] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  }
  object ReadonlyPromisevoid {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[Unit | js.Any],
      `finally`: () => js.Promise[Unit],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromisevoid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromisevoid]
    }
    
    @scala.inline
    implicit class ReadonlyPromisevoidMutableBuilder[Self <: ReadonlyPromisevoid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[Unit | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[Unit]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
}
