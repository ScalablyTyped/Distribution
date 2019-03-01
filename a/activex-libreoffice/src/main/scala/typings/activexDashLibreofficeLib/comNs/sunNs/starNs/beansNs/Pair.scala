package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple, or pair.
  *
  * This structure allows for conveniently packing together two values of any type, and could be useful as the result type of methods.
  * @since OOo 3.0
  */
trait Pair[T, U] extends js.Object {
  var First: T
  var Second: U
}

object Pair {
  @scala.inline
  def apply[T, U](First: T, Second: U): Pair[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("First")(First.asInstanceOf[js.Any])
    __obj.updateDynamic("Second")(Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair[T, U]]
  }
}

