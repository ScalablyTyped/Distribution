package typings.asyncDashRetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashRetryMod {
  import typings.std.Error

  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
