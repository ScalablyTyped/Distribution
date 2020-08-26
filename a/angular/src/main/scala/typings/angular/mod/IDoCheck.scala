package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $doCheck lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IDoCheck extends js.Object {
  /**
    * Called on each turn of the digest cycle. Provides an opportunity to detect and act on changes.
    * Any actions that you wish to take in response to the changes that you detect must be invoked from this hook;
    * implementing this has no effect on when `$onChanges` is called. For example, this hook could be useful if you wish
    * to perform a deep equality check, or to check a `Dat`e object, changes to which would not be detected by Angular's
    * change detector and thus not trigger `$onChanges`. This hook is invoked with no arguments; if detecting changes,
    * you must store the previous value(s) for comparison to the current values.
    */
  @JSName("$doCheck")
  def $doCheck(): Unit = js.native
}

object IDoCheck {
  @scala.inline
  def apply($doCheck: () => Unit): IDoCheck = {
    val __obj = js.Dynamic.literal($doCheck = js.Any.fromFunction0($doCheck))
    __obj.asInstanceOf[IDoCheck]
  }
  @scala.inline
  implicit class IDoCheckOps[Self <: IDoCheck] (val x: Self) extends AnyVal {
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
    def set$doCheck(value: () => Unit): Self = this.set("$doCheck", js.Any.fromFunction0(value))
  }
  
}

