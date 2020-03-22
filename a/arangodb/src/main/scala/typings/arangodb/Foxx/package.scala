package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Foxx {
  type Handler = js.Function2[
    /* req */ typings.arangodb.Foxx.Request, 
    /* res */ typings.arangodb.Foxx.Response, 
    scala.Unit
  ]
  type Middleware = typings.arangodb.Foxx.SimpleMiddleware | typings.arangodb.Foxx.DelegateMiddleware
  type NextFunction = js.Function0[scala.Unit]
  type SimpleMiddleware = js.Function3[
    /* req */ typings.arangodb.Foxx.Request, 
    /* res */ typings.arangodb.Foxx.Response, 
    /* next */ typings.arangodb.Foxx.NextFunction, 
    scala.Unit
  ]
}
