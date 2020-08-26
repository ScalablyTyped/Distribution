package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangesObject[T] extends js.Object {
  var currentValue: T = js.native
  var previousValue: T = js.native
  def isFirstChange(): Boolean = js.native
}

object IChangesObject {
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: () => Boolean, previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = js.Any.fromFunction0(isFirstChange), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
  @scala.inline
  implicit class IChangesObjectOps[Self <: IChangesObject[_], T] (val x: Self with IChangesObject[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentValue(value: T): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFirstChange(value: () => Boolean): Self = this.set("isFirstChange", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousValue(value: T): Self = this.set("previousValue", value.asInstanceOf[js.Any])
  }
  
}

