package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type ResolveAndRejectCallback[T] = js.Function2[
    /* resolve */ js.Function1[/* value */ T, scala.Unit], 
    /* reject */ js.Function1[/* params */ js.Any, scala.Unit], 
    scala.Unit
  ]
}
