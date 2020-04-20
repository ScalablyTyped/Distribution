package typings.androiduix.java.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparator[T] extends js.Object {
  def compare(o1: T, o2: T): Double
}

object Comparator {
  @scala.inline
  def apply[T](compare: (T, T) => Double): Comparator[T] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[Comparator[T]]
  }
}

