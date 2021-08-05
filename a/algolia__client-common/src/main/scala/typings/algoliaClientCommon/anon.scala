package typings.algoliaClientCommon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaTransporter.mod.HostOptions
import typings.algoliaTransporter.mod.QueryParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    /**
      * The headers used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val headers: js.UndefOr[typings.algoliaTransporter.mod.Headers] = js.undefined
    
    /**
      * The hosts used by the requester.
      */
    val hosts: js.UndefOr[js.Array[HostOptions]] = js.undefined
    
    /**
      * The query parameters used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val queryParameters: js.UndefOr[QueryParameters] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: typings.algoliaTransporter.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHosts(value: js.Array[HostOptions]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: HostOptions*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      inline def setQueryParameters(value: QueryParameters): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    }
  }
  
  trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ js.Any, js.Any]]] */, TClient] extends StObject {
    
    val methods: js.UndefOr[TMethods] = js.undefined
  }
  object Methods {
    
    inline def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ js.Any, js.Any]]] */, TClient](): Methods[TMethods, TClient] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods[TMethods, TClient]]
    }
    
    extension [Self <: Methods[?, ?], TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ js.Any, js.Any]]] */, TClient](x: Self & (Methods[TMethods, TClient])) {
      
      inline def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<any>> */
  trait ReadonlyPromiseany extends StObject {
    
    def `catch`[TResult](): js.Promise[js.Any | TResult]
    
    def `finally`(): js.Promise[js.Any]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseany {
    
    inline def apply(
      `catch`: () => js.Promise[js.Any | js.Any],
      `finally`: () => js.Promise[js.Any],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseany]
    }
    
    extension [Self <: ReadonlyPromiseany](x: Self) {
      
      inline def setCatch(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[js.Any]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      inline def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
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
    
    extension [Self <: ReadonlyPromisevoid](x: Self) {
      
      inline def setCatch(value: () => js.Promise[Unit | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      inline def setFinally(value: () => js.Promise[Unit]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      inline def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  trait Transporter extends StObject {
    
    val transporter: typings.algoliaTransporter.mod.Transporter
  }
  object Transporter {
    
    inline def apply(transporter: typings.algoliaTransporter.mod.Transporter): Transporter = {
      val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transporter]
    }
    
    extension [Self <: Transporter](x: Self) {
      
      inline def setTransporter(value: typings.algoliaTransporter.mod.Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
}
