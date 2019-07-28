package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esModalPropsTypeMod {
  type Callback = js.Function2[/* valueOrLogin */ String, /* password */ js.UndefOr[String], Unit]
  type CallbackOrActions[T] = Callback | js.Array[Action[T]]
}
