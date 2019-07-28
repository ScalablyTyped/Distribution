package typings.androiduix.javaNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparable[T] extends js.Object {
  def compareTo(o: T): Double
}

object Comparable {
  @scala.inline
  def apply[T](compareTo: T => Double): Comparable[T] = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo))
  
    __obj.asInstanceOf[Comparable[T]]
  }
}

