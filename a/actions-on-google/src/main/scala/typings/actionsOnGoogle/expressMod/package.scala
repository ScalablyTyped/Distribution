package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type ExpressHandler = js.Function2[
    /* request */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typings.express.mod.Response_[js.Any], 
    scala.Unit
  ]
}
