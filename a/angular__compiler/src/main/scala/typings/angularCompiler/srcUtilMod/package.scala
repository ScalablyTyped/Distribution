package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcUtilMod {
  type SyncAsync[T] = T | js.Promise[T]
}
