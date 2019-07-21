package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libModalPropsTypeMod {
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CallbackOrActions[T] = Callback | js.Array[Action[T]]
}
