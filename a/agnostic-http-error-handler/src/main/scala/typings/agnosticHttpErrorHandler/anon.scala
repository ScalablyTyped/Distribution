package typings.agnosticHttpErrorHandler

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Express[Err, Req, Res, T, P] extends StObject {
    
    def express(err: Err, req: Req, res: Res, next: Any): ReturnType[
        js.Function3[
          /* err */ Err, 
          /* req */ Req, 
          /* res */ Res, 
          /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
        ]
      ]
    
    def native(err: Err, req: Req, res: Res): ReturnType[
        js.Function3[
          /* err */ Err, 
          /* req */ Req, 
          /* res */ Res, 
          /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
        ]
      ]
    
    def restana(err: Err, req: Req, res: Res): ReturnType[
        js.Function3[
          /* err */ Err, 
          /* req */ Req, 
          /* res */ Res, 
          /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
        ]
      ]
  }
  object Express {
    
    inline def apply[Err, Req, Res, T, P](
      express: (Err, Req, Res, Any) => ReturnType[
          js.Function3[
            /* err */ Err, 
            /* req */ Req, 
            /* res */ Res, 
            /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
          ]
        ],
      native: (Err, Req, Res) => ReturnType[
          js.Function3[
            /* err */ Err, 
            /* req */ Req, 
            /* res */ Res, 
            /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
          ]
        ],
      restana: (Err, Req, Res) => ReturnType[
          js.Function3[
            /* err */ Err, 
            /* req */ Req, 
            /* res */ Res, 
            /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
          ]
        ]
    ): Express[Err, Req, Res, T, P] = {
      val __obj = js.Dynamic.literal(express = js.Any.fromFunction4(express), native = js.Any.fromFunction3(native), restana = js.Any.fromFunction3(restana))
      __obj.asInstanceOf[Express[Err, Req, Res, T, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Express[?, ?, ?, ?, ?], Err, Req, Res, T, P] (val x: Self & (Express[Err, Req, Res, T, P])) extends AnyVal {
      
      inline def setExpress(
        value: (Err, Req, Res, Any) => ReturnType[
              js.Function3[
                /* err */ Err, 
                /* req */ Req, 
                /* res */ Res, 
                /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "express", js.Any.fromFunction4(value))
      
      inline def setNative(
        value: (Err, Req, Res) => ReturnType[
              js.Function3[
                /* err */ Err, 
                /* req */ Req, 
                /* res */ Res, 
                /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "native", js.Any.fromFunction3(value))
      
      inline def setRestana(
        value: (Err, Req, Res) => ReturnType[
              js.Function3[
                /* err */ Err, 
                /* req */ Req, 
                /* res */ Res, 
                /* import warning: importer.ImportType#apply Failed type conversion: T extends agnostic-http-error-handler.agnostic-http-error-handler.Falsy ? P extends agnostic-http-error-handler.agnostic-http-error-handler.Data<Res> ? std.ReturnType<(res : Res): any> : undefined : T */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "restana", js.Any.fromFunction3(value))
    }
  }
}
