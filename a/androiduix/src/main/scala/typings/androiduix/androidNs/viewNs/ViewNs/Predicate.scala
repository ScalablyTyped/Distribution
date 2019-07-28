package typings.androiduix.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Predicate[T] extends js.Object {
  @JSName("apply")
  def apply(t: T): Boolean
}

object Predicate {
  @scala.inline
  def apply[T](apply: T => Boolean): Predicate[T] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[Predicate[T]]
  }
}

