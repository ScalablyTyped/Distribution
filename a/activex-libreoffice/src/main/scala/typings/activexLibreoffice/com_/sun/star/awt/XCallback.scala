package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface which can be used to call back an implementation */
@js.native
trait XCallback extends js.Object {
  
  /**
    * notifies the callback implementation
    * @param aData private data which was provided when the callback was requested.
    */
  def notify(aData: js.Any): Unit = js.native
}
object XCallback {
  
  @scala.inline
  def apply(notify: js.Any => Unit): XCallback = {
    val __obj = js.Dynamic.literal(notify = js.Any.fromFunction1(notify))
    __obj.asInstanceOf[XCallback]
  }
  
  @scala.inline
  implicit class XCallbackOps[Self <: XCallback] (val x: Self) extends AnyVal {
    
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
    def setNotify(value: js.Any => Unit): Self = this.set("notify", js.Any.fromFunction1(value))
  }
}
