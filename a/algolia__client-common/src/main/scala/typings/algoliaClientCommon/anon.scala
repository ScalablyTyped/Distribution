package typings.algoliaClientCommon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaTransporter.mod.HostOptions
import typings.algoliaTransporter.mod.QueryParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Headers extends StObject {
    
    /**
      * The headers used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val headers: js.UndefOr[typings.algoliaTransporter.mod.Headers] = js.native
    
    /**
      * The hosts used by the requester.
      */
    val hosts: js.UndefOr[js.Array[HostOptions]] = js.native
    
    /**
      * The query parameters used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val queryParameters: js.UndefOr[QueryParameters] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: typings.algoliaTransporter.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHosts(value: js.Array[HostOptions]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: HostOptions*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setQueryParameters(value: QueryParameters): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    }
  }
  
  @js.native
  trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */, TClient] extends StObject {
    
    val methods: js.UndefOr[TMethods] = js.native
  }
  object Methods {
    
    @scala.inline
    def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */, TClient](): Methods[TMethods, TClient] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods[TMethods, TClient]]
    }
    
    @scala.inline
    implicit class MethodsMutableBuilder[Self <: Methods[_, _], TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */, TClient] (val x: Self with (Methods[TMethods, TClient])) extends AnyVal {
      
      @scala.inline
      def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<any>> */
  @js.native
  trait ReadonlyPromiseany extends StObject {
    
    def `catch`[TResult](): js.Promise[_ | TResult] = js.native
    
    def `finally`(): js.Promise[_] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  }
  object ReadonlyPromiseany {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[_ | js.Any],
      `finally`: () => js.Promise[_],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseany]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseanyMutableBuilder[Self <: ReadonlyPromiseany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[_ | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[_]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
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
  
  @js.native
  trait Transporter extends StObject {
    
    val transporter: typings.algoliaTransporter.mod.Transporter = js.native
  }
  object Transporter {
    
    @scala.inline
    def apply(transporter: typings.algoliaTransporter.mod.Transporter): Transporter = {
      val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transporter]
    }
    
    @scala.inline
    implicit class TransporterMutableBuilder[Self <: Transporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransporter(value: typings.algoliaTransporter.mod.Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
}
