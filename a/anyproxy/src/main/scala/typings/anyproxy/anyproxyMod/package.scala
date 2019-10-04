package typings.anyproxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anyproxyMod {
  type MaybePromise[T] = T | js.Promise[T]
}
