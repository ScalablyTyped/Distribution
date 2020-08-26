package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $onInit lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IOnInit extends js.Object {
  /**
    * Called on each controller after all the controllers on an element have been constructed and had their bindings
    * initialized (and before the pre & post linking functions for the directives on this element). This is a good
    * place to put initialization code for your controller.
    */
  @JSName("$onInit")
  def $onInit(): Unit = js.native
}

object IOnInit {
  @scala.inline
  def apply($onInit: () => Unit): IOnInit = {
    val __obj = js.Dynamic.literal($onInit = js.Any.fromFunction0($onInit))
    __obj.asInstanceOf[IOnInit]
  }
  @scala.inline
  implicit class IOnInitOps[Self <: IOnInit] (val x: Self) extends AnyVal {
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
    def set$onInit(value: () => Unit): Self = this.set("$onInit", js.Any.fromFunction0(value))
  }
  
}

