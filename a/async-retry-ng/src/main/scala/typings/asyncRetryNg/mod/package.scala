package typings.asyncRetryNg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ typings.std.Error, scala.Unit], 
    /* attempt */ scala.Double, 
    A | js.Promise[A]
  ]
}
