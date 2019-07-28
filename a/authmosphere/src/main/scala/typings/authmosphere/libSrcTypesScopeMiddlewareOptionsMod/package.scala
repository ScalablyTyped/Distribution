package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesScopeMiddlewareOptionsMod {
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request, 
    /* resonse */ Response, 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
