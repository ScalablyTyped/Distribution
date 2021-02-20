package typings.ava

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Complete extends StObject {
    
    def complete(): Unit = js.native
    
    def error(err: js.Any): Unit = js.native
  }
  object Complete {
    
    @scala.inline
    def apply(complete: () => Unit, error: js.Any => Unit): Complete = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[Complete]
    }
    
    @scala.inline
    implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Title[Args /* <: js.Array[_] */] extends StObject {
    
    var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.native
  }
  object Title {
    
    @scala.inline
    def apply[Args /* <: js.Array[_] */](): Title[Args] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title[Args]]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title[_], Args /* <: js.Array[_] */] (val x: Self with Title[Args]) extends AnyVal {
      
      @scala.inline
      def setTitle(value: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
