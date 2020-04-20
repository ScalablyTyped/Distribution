package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* resonse */ typings.express.mod.Response_[js.Any], 
    /* next */ typings.express.mod.NextFunction, 
    /* logger */ typings.authmosphere.loggerMod.Logger, 
    scala.Unit
  ]
}
