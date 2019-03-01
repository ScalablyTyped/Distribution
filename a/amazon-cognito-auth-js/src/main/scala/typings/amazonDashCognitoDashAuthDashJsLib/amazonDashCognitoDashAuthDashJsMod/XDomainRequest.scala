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
    abort: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit],
    onload: js.Function0[scala.Unit],
    onprogress: js.Function0[scala.Unit],
    ontimeout: js.Function0[scala.Unit],
    open: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    responseText: java.lang.String,
    send: js.Function1[java.lang.String, scala.Unit],
    timeout: scala.Double
  ): XDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("onerror")(onerror)
    __obj.updateDynamic("onload")(onload)
    __obj.updateDynamic("onprogress")(onprogress)
    __obj.updateDynamic("ontimeout")(ontimeout)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("responseText")(responseText)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[XDomainRequest]
  }
}

