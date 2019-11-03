package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesScopeMiddlewareOptionsMod {
  import typings.authmosphere.libSrcTypesLoggerMod.Logger
  import typings.express.expressMod.NextFunction
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request[ParamsDictionary], 
    /* resonse */ Response, 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
