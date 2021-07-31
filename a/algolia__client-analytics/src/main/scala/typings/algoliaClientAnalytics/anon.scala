package typings.algoliaClientAnalytics

import typings.algoliaClientAnalytics.mod.AddABTestResponse
import typings.algoliaClientAnalytics.mod.DeleteABTestResponse
import typings.algoliaClientAnalytics.mod.GetABTestResponse
import typings.algoliaClientAnalytics.mod.GetABTestsResponse
import typings.algoliaClientAnalytics.mod.StopABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>> */
  trait ReadonlyPromiseAddABTestR extends StObject {
    
    def `catch`[TResult](): js.Promise[AddABTestResponse | TResult]
    
    def `finally`(): js.Promise[AddABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseAddABTestR {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[AddABTestResponse | js.Any],
      `finally`: () => js.Promise[AddABTestResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseAddABTestR = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseAddABTestR]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseAddABTestRMutableBuilder[Self <: ReadonlyPromiseAddABTestR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[AddABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[AddABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
  trait ReadonlyPromiseDeleteABTe extends StObject {
    
    def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult]
    
    def `finally`(): js.Promise[DeleteABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseDeleteABTe {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[DeleteABTestResponse | js.Any],
      `finally`: () => js.Promise[DeleteABTestResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseDeleteABTe = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseDeleteABTeMutableBuilder[Self <: ReadonlyPromiseDeleteABTe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[DeleteABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[DeleteABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>> */
  trait ReadonlyPromiseGetABTestR extends StObject {
    
    def `catch`[TResult](): js.Promise[GetABTestResponse | TResult]
    
    def `finally`(): js.Promise[GetABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseGetABTestR {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[GetABTestResponse | js.Any],
      `finally`: () => js.Promise[GetABTestResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseGetABTestR = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseGetABTestR]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseGetABTestRMutableBuilder[Self <: ReadonlyPromiseGetABTestR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[GetABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[GetABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestsResponse>> */
  trait ReadonlyPromiseGetABTests extends StObject {
    
    def `catch`[TResult](): js.Promise[GetABTestsResponse | TResult]
    
    def `finally`(): js.Promise[GetABTestsResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseGetABTests {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[GetABTestsResponse | js.Any],
      `finally`: () => js.Promise[GetABTestsResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseGetABTests = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseGetABTests]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseGetABTestsMutableBuilder[Self <: ReadonlyPromiseGetABTests] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[GetABTestsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[GetABTestsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.StopABTestResponse>> */
  trait ReadonlyPromiseStopABTest extends StObject {
    
    def `catch`[TResult](): js.Promise[StopABTestResponse | TResult]
    
    def `finally`(): js.Promise[StopABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseStopABTest {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[StopABTestResponse | js.Any],
      `finally`: () => js.Promise[StopABTestResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseStopABTest = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseStopABTest]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseStopABTestMutableBuilder[Self <: ReadonlyPromiseStopABTest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[StopABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[StopABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
}
