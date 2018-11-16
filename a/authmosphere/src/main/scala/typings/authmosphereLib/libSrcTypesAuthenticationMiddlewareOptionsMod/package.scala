package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesAuthenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* resonse */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    /* logger */ authmosphereLib.libSrcTypesLoggerMod.Logger, 
    scala.Unit
  ]
}
