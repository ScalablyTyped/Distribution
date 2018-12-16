package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Context[T] = T
  type ContextFunction[T] = js.Function1[/* context */ Context[T], js.Promise[Context[T]]]
  type PluginDefinition = js.Any | js.Function0[js.Any]
}
