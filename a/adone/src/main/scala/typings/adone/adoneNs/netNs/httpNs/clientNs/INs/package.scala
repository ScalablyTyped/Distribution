package typings.adone.adoneNs.netNs.httpNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  import typings.adone.Anon_Options
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView
  import typings.std.Partial

  type Canceller = js.Function1[/* message */ js.UndefOr[String], Unit]
  type Data = js.UndefOr[String | Buffer | ArrayBuffer | Readable | ArrayBufferView | js.Object]
  type FormValue = String | Buffer | Readable | Anon_Options
  type Options = Partial[Config]
  type Transformer = js.Function3[/* data */ Data, /* headers */ js.Object, /* config */ Options, Data]
}
