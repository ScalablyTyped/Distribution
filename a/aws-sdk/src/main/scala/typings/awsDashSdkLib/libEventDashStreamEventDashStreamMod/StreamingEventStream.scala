package typings
package awsDashSdkLib.libEventDashStreamEventDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingEventStream[Events]
  extends nodeLib.NodeJSNs.ReadableStream {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_data(
    event: awsDashSdkLib.awsDashSdkLibStrings.data,
    listener: js.Function1[/* event */ Events, scala.Unit]
  ): this.type = js.native
}

