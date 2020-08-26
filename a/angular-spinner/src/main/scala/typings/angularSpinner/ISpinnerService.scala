package typings.angularSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinnerService extends js.Object {
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit = js.native
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit = js.native
}

object ISpinnerService {
  @scala.inline
  def apply(spin: String => Unit, stop: String => Unit): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1(spin), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ISpinnerService]
  }
  @scala.inline
  implicit class ISpinnerServiceOps[Self <: ISpinnerService] (val x: Self) extends AnyVal {
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
    def setSpin(value: String => Unit): Self = this.set("spin", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: String => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
  }
  
}

