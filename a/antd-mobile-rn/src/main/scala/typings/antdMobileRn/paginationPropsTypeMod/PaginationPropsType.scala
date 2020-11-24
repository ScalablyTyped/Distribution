package typings.antdMobileRn.paginationPropsTypeMod

import typings.antdMobileRn.antdMobileRnStrings.button
import typings.antdMobileRn.antdMobileRnStrings.number
import typings.antdMobileRn.antdMobileRnStrings.pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationPropsType extends js.Object {
  
  var current: Double = js.native
  
  var mode: js.UndefOr[button | number | pointer] = js.native
  
  var nextText: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
  
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
  
  var prevText: js.UndefOr[String] = js.native
  
  var simple: js.UndefOr[Boolean] = js.native
  
  var total: Double = js.native
}
object PaginationPropsType {
  
  @scala.inline
  def apply(current: Double, total: Double): PaginationPropsType = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationPropsType]
  }
  
  @scala.inline
  implicit class PaginationPropsTypeOps[Self <: PaginationPropsType] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: button | number | pointer): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* current */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnNext(value: () => Unit): Self = this.set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    
    @scala.inline
    def setOnPrev(value: () => Unit): Self = this.set("onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPrev: Self = this.set("onPrev", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
  }
}
