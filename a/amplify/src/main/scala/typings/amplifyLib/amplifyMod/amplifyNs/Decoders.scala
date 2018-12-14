package typings
package amplifyLib.amplifyMod.amplifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoders
  extends /* decoderName */ org.scalablytyped.runtime.StringDictionary[Decoder] {
  @JSName("jsSend")
  var jsSend_Original: Decoder = js.native
  def jsSend(): scala.Unit = js.native
  def jsSend(data: js.Any): scala.Unit = js.native
  def jsSend(data: js.Any, status: java.lang.String): scala.Unit = js.native
  def jsSend(data: js.Any, status: java.lang.String, xhr: jqueryLib.JQueryXHR): scala.Unit = js.native
  def jsSend(
    data: js.Any,
    status: java.lang.String,
    xhr: jqueryLib.JQueryXHR,
    success: js.Function1[/* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  def jsSend(
    data: js.Any,
    status: java.lang.String,
    xhr: jqueryLib.JQueryXHR,
    success: js.Function1[/* repeated */js.Any, scala.Unit],
    error: js.Function1[/* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
}

