package typings
package asyncDashRetryLib.asyncDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AsyncRetryNs {
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ stdLib.Error, scala.Unit], 
    /* attempt */ scala.Double, 
    A | js.Promise[A]
  ]
}
