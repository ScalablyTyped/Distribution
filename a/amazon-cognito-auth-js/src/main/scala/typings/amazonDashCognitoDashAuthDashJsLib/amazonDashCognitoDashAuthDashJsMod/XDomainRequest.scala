package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainRequest extends js.Object {
  val responseText: java.lang.String
  var timeout: scala.Double
  def abort(): scala.Unit
  def onerror(): scala.Unit
  def onload(): scala.Unit
  def onprogress(): scala.Unit
  def ontimeout(): scala.Unit
  def open(method: java.lang.String, url: java.lang.String): scala.Unit
  def send(data: java.lang.String): scala.Unit
}

object XDomainRequest {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    onerror: () => scala.Unit,
    onload: () => scala.Unit,
    onprogress: () => scala.Unit,
    ontimeout: () => scala.Unit,
    open: (java.lang.String, java.lang.String) => scala.Unit,
    responseText: java.lang.String,
    send: java.lang.String => scala.Unit,
    timeout: scala.Double
  ): XDomainRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onerror = js.Any.fromFunction0(onerror), onload = js.Any.fromFunction0(onload), onprogress = js.Any.fromFunction0(onprogress), ontimeout = js.Any.fromFunction0(ontimeout), open = js.Any.fromFunction2(open), responseText = responseText, send = js.Any.fromFunction1(send), timeout = timeout)
  
    __obj.asInstanceOf[XDomainRequest]
  }
}

