package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnInit extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  def ngOnInit(): Unit = js.native
}

object OnInit {
  @scala.inline
  def apply(ngOnInit: () => Unit): OnInit = {
    val __obj = js.Dynamic.literal(ngOnInit = js.Any.fromFunction0(ngOnInit))
    __obj.asInstanceOf[OnInit]
  }
  @scala.inline
  implicit class OnInitOps[Self <: OnInit] (val x: Self) extends AnyVal {
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
    def setNgOnInit(value: () => Unit): Self = this.set("ngOnInit", js.Any.fromFunction0(value))
  }
  
}

