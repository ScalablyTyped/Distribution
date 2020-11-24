package typings.androiduix.androidui.AndroidUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIClient extends js.Object {
  
  var shouldShowAppClosed: js.UndefOr[js.Function1[/* androidUI */ typings.androiduix.androidui.AndroidUI, _]] = js.native
}
object UIClient {
  
  @scala.inline
  def apply(): UIClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIClient]
  }
  
  @scala.inline
  implicit class UIClientOps[Self <: UIClient] (val x: Self) extends AnyVal {
    
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
    def setShouldShowAppClosed(value: /* androidUI */ typings.androiduix.androidui.AndroidUI => _): Self = this.set("shouldShowAppClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldShowAppClosed: Self = this.set("shouldShowAppClosed", js.undefined)
  }
}
