package typings.abortableIterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
  var abortCode: js.UndefOr[String] = js.native
  
  var abortMessage: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[js.Function1[/* source */ Source_[T], Unit]] = js.native
  
  var returnOnAbort: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setAbortCode(value: String): Self = this.set("abortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortCode: Self = this.set("abortCode", js.undefined)
    
    @scala.inline
    def setAbortMessage(value: String): Self = this.set("abortMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortMessage: Self = this.set("abortMessage", js.undefined)
    
    @scala.inline
    def setOnAbort(value: /* source */ Source_[T] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setReturnOnAbort(value: Boolean): Self = this.set("returnOnAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnOnAbort: Self = this.set("returnOnAbort", js.undefined)
  }
}
