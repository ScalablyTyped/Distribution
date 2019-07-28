package typings.amazonDashCognitoDashAuthDashJs.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainRequest extends js.Object {
  val responseText: String
  var timeout: Double
  def abort(): Unit
  def onerror(): Unit
  def onload(): Unit
  def onprogress(): Unit
  def ontimeout(): Unit
  def open(method: String, url: String): Unit
  def send(data: String): Unit
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
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onerror = js.Any.fromFunction0(onerror), onload = js.Any.fromFunction0(onload), onprogress = js.Any.fromFunction0(onprogress), ontimeout = js.Any.fromFunction0(ontimeout), open = js.Any.fromFunction2(open), responseText = responseText, send = js.Any.fromFunction1(send), timeout = timeout)
  
    __obj.asInstanceOf[XDomainRequest]
  }
}

