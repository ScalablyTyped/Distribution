package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangesObject[T] extends js.Object {
  var currentValue: T
  var previousValue: T
  def isFirstChange(): Boolean
}

object IChangesObject {
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: () => Boolean, previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = js.Any.fromFunction0(isFirstChange), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
}

