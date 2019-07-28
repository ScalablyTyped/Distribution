package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibUtilsMod {
  type ResolveAndRejectCallback[T] = js.Function2[
    /* resolve */ js.Function1[/* value */ T, Unit], 
    /* reject */ js.Function1[/* params */ js.Any, Unit], 
    Unit
  ]
}
