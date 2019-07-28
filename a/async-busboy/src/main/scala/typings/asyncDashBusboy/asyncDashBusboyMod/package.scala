package typings.asyncDashBusboy

import typings.asyncDashBusboy.Anon_Fields
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashBusboyMod {
  type AsyncBusboy = js.Function2[
    /* req */ IncomingMessage, 
    /* options */ js.UndefOr[Options], 
    js.Promise[Anon_Fields]
  ]
}
