package typings.asyncDashRetry

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashRetryMod {
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
