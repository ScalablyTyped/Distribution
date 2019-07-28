package typings.apolloDashServerDashEnv

import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypescriptDashUtilityDashTypesMod {
  type ValueOrPromise[T] = T | js.Promise[T]
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}
