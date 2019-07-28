package typings.adone.adoneNs.collectionNs.INs.PriorityQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions[T] extends js.Object {
  /**
    * Function that compares objects.
    *
    * Must return a positive value if a > b, a negative if a < b, and zero for equal objects
    */
  var compare: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.undefined
  /**
    * Function that evaluates the priority value by the given objects,
    * if the returned value > 0, then the first argument has higher priority,
    * = 0 same priority, < 0 lower priority.
    * By default the top element is an element that has the highest priority,
    * the default priority function is equal to the compare function
    */
  var priority: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply[T](
    compare: (/* a */ T, /* b */ T) => Double = null,
    priority: (/* a */ T, /* b */ T) => Double = null
  ): ConstructorOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2(compare))
    if (priority != null) __obj.updateDynamic("priority")(js.Any.fromFunction2(priority))
    __obj.asInstanceOf[ConstructorOptions[T]]
  }
}

