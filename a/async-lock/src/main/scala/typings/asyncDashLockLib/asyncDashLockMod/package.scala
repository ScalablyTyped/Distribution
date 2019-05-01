package typings
package asyncDashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashLockMod {
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* ret */ js.UndefOr[T], scala.Unit]
}
