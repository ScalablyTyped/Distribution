package typings.asyncDashEventemitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashEventemitterMod {
  import org.scalablytyped.runtime.StringDictionary

  type AsyncListener[T, R] = js.Function2[/* data */ T, /* callback */ js.Function1[js.UndefOr[R], Unit], js.Promise[R] | Unit]
  type EventMap = StringDictionary[AsyncListener[js.Any, js.Any]]
}
