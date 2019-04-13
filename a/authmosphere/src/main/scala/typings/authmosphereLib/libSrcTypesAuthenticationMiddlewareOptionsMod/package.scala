package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesAuthenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ expressLib.expressMod.Request, 
    /* resonse */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    /* logger */ authmosphereLib.libSrcTypesLoggerMod.Logger, 
    scala.Unit
  ]
}
