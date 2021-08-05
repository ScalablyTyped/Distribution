package typings.arangodb

import typings.arangodb.Foxx.Endpoint
import typings.arangodb.Foxx.Handler
import typings.arangodb.Foxx.SimpleMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Foxx {
    
    @JSGlobal("Foxx")
    @js.native
    val ^ : js.Any = js.native
    
    inline def route(handler: Handler): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("route")(handler.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
    inline def route(handler: Handler, name: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: String, handler: Handler): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: String, handler: Handler, name: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      middleware9: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], middleware9.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: String,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      middleware9: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], middleware9.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: String, middleware: SimpleMiddleware, handler: Handler): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: String, middleware: SimpleMiddleware, handler: Handler, name: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: SimpleMiddleware, handler: Handler): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: SimpleMiddleware, handler: Handler, name: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      middleware9: SimpleMiddleware,
      handler: Handler
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], middleware9.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(
      pathOrMiddleware: SimpleMiddleware,
      middleware1: SimpleMiddleware,
      middleware2: SimpleMiddleware,
      middleware3: SimpleMiddleware,
      middleware4: SimpleMiddleware,
      middleware5: SimpleMiddleware,
      middleware6: SimpleMiddleware,
      middleware7: SimpleMiddleware,
      middleware8: SimpleMiddleware,
      middleware9: SimpleMiddleware,
      handler: Handler,
      name: String
    ): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any], middleware6.asInstanceOf[js.Any], middleware7.asInstanceOf[js.Any], middleware8.asInstanceOf[js.Any], middleware9.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: SimpleMiddleware, middleware: SimpleMiddleware, handler: Handler): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def route(pathOrMiddleware: SimpleMiddleware, middleware: SimpleMiddleware, handler: Handler, name: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(pathOrMiddleware.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
  }
}
