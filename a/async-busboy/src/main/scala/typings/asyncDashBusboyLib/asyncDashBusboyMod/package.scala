package typings
package asyncDashBusboyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashBusboyMod {
  type AsyncBusboy = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* options */ js.UndefOr[Options], 
    js.Promise[asyncDashBusboyLib.Anon_Fields]
  ]
}
