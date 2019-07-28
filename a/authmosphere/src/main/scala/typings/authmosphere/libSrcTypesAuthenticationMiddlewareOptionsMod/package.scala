package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesAuthenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ Request, 
    /* resonse */ Response, 
    /* next */ NextFunction, 
    /* logger */ Logger, 
    Unit
  ]
}
