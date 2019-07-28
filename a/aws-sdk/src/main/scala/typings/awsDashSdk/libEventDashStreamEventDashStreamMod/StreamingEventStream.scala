package typings.awsDashSdk.libEventDashStreamEventDashStreamMod

import typings.awsDashSdk.awsDashSdkStrings.data
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingEventStream[Events] extends ReadableStream {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
}

