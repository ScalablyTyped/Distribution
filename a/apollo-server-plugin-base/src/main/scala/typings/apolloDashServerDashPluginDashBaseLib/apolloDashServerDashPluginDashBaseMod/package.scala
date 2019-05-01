package typings
package apolloDashServerDashPluginDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashServerDashPluginDashBaseMod {
  type ValueOrPromise[T] = T | js.Promise[T]
  type WithRequired[T, K /* <: java.lang.String */] = T with (stdLib.Required[stdLib.Pick[T, K]])
}
