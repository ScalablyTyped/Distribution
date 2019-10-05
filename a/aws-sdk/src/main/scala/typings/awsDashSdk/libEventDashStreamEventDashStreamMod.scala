package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.data
import typings.awsDashSdk.libEventDashStreamEventDashStreamMod.StreamingEventStream
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/event-stream/event-stream", JSImport.Namespace)
@js.native
object libEventDashStreamEventDashStreamMod extends js.Object {
  @js.native
  trait StreamingEventStream[Events] extends ReadableStream {
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
  }
  
  type EventStream[Events] = StreamingEventStream[Events] | js.Array[Events]
}

