package typings.asyncDashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashLockMod {
  import typings.std.Error

  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* ret */ js.UndefOr[T], Unit]
}
