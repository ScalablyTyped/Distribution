package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDomainRequest extends js.Object {
  
  def abort(): Unit = js.native
  
  def onerror(): Unit = js.native
  
  def onload(): Unit = js.native
  
  def onprogress(): Unit = js.native
  
  def ontimeout(): Unit = js.native
  
  def open(method: String, url: String): Unit = js.native
  
  val responseText: String = js.native
  
  def send(data: String): Unit = js.native
  
  var timeout: Double = js.native
}
object XDomainRequest {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    onerror: () => Unit,
    onload: () => Unit,
    onprogress: () => Unit,
    ontimeout: () => Unit,
    open: (String, String) => Unit,
    responseText: String,
    send: String => Unit,
    timeout: Double
  ): XDomainRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onerror = js.Any.fromFunction0(onerror), onload = js.Any.fromFunction0(onload), onprogress = js.Any.fromFunction0(onprogress), ontimeout = js.Any.fromFunction0(ontimeout), open = js.Any.fromFunction2(open), responseText = responseText.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainRequest]
  }
  
  @scala.inline
  implicit class XDomainRequestOps[Self <: XDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnerror(value: () => Unit): Self = this.set("onerror", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnload(value: () => Unit): Self = this.set("onload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnprogress(value: () => Unit): Self = this.set("onprogress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = this.set("ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: (String, String) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: String => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
