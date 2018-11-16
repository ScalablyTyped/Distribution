package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesScopeMiddlewareOptionsMod {
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* resonse */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    /* scopes */ js.Array[java.lang.String], 
    /* logger */ authmosphereLib.libSrcTypesLoggerMod.Logger, 
    scala.Unit
  ]
}
