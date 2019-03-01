package typings
package androiduixLib.javaNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparable[T] extends js.Object {
  def compareTo(o: T): scala.Double
}

object Comparable {
  @scala.inline
  def apply[T](compareTo: js.Function1[T, scala.Double]): Comparable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compareTo")(compareTo)
    __obj.asInstanceOf[Comparable[T]]
  }
}

