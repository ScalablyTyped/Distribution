package typings.amplifier.amplifierMod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoders extends /* decoderName */ StringDictionary[Decoder] {
  @JSName("jsSend")
  var jsSend_Original: Decoder = js.native
  def jsSend(): Unit = js.native
  def jsSend(data: js.Any): Unit = js.native
  def jsSend(data: js.Any, status: String): Unit = js.native
  def jsSend(data: js.Any, status: String, xhr: JQueryXHR): Unit = js.native
  def jsSend(data: js.Any, status: String, xhr: JQueryXHR, success: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def jsSend(
    data: js.Any,
    status: String,
    xhr: JQueryXHR,
    success: js.Function1[/* repeated */ js.Any, Unit],
    error: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
}

