package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $onChanges lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IOnChanges extends js.Object {
  /**
    * Called whenever one-way bindings are updated. The onChangesObj is a hash whose keys are the names of the bound
    * properties that have changed, and the values are an {@link IChangesObject} object  of the form
    * { currentValue, previousValue, isFirstChange() }. Use this hook to trigger updates within a component such as
    * cloning the bound value to prevent accidental mutation of the outer value.
    */
  @JSName("$onChanges")
  def $onChanges(onChangesObj: IOnChangesObject): Unit = js.native
}

object IOnChanges {
  @scala.inline
  def apply($onChanges: IOnChangesObject => Unit): IOnChanges = {
    val __obj = js.Dynamic.literal($onChanges = js.Any.fromFunction1($onChanges))
    __obj.asInstanceOf[IOnChanges]
  }
  @scala.inline
  implicit class IOnChangesOps[Self <: IOnChanges] (val x: Self) extends AnyVal {
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
    def set$onChanges(value: IOnChangesObject => Unit): Self = this.set("$onChanges", js.Any.fromFunction1(value))
  }
  
}

