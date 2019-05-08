package typings
package apolloDashServerDashEnvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypescriptDashUtilityDashTypesMod {
  type ValueOrPromise[T] = T | js.Promise[T]
  type WithRequired[T, K /* <: java.lang.String */] = T with (stdLib.Required[stdLib.Pick[T, K]])
}
