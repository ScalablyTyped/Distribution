package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an interface which can be used to call back an implementation */
@js.native
trait XRequestCallback extends js.Object {
  /**
    * adds a callback request to the implementation
    * @param aData any private data which will be provided to the callback implementation.
    * @param xCallback a reference to the callback which should be called by the implementation of this interface.
    */
  def addCallback(xCallback: XCallback, aData: js.Any): Unit = js.native
}

object XRequestCallback {
  @scala.inline
  def apply(addCallback: (XCallback, js.Any) => Unit): XRequestCallback = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction2(addCallback))
    __obj.asInstanceOf[XRequestCallback]
  }
  @scala.inline
  implicit class XRequestCallbackOps[Self <: XRequestCallback] (val x: Self) extends AnyVal {
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
    def setAddCallback(value: (XCallback, js.Any) => Unit): Self = this.set("addCallback", js.Any.fromFunction2(value))
  }
  
}

