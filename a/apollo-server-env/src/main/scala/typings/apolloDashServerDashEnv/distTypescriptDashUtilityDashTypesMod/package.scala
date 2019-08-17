package typings.apolloDashServerDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypescriptDashUtilityDashTypesMod {
  import typings.std.Pick
  import typings.std.Required

  type ValueOrPromise[T] = T | js.Promise[T]
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}
