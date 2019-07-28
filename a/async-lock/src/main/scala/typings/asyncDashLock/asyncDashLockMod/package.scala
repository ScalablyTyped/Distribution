package typings.asyncDashLock

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashLockMod {
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* ret */ js.UndefOr[T], Unit]
}
