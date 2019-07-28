package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcUtilMod {
  type SyncAsync[T] = T | js.Promise[T]
}
