package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type Canceller = js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]
  type Data = js.UndefOr[
    java.lang.String | nodeLib.Buffer | stdLib.ArrayBuffer | nodeLib.streamMod.Readable | stdLib.ArrayBufferView | js.Object
  ]
  type FormValue = java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | adoneLib.Anon_Options
  type Options = stdLib.Partial[Config]
  type Transformer = js.Function3[/* data */ Data, /* headers */ js.Object, /* config */ Options, Data]
}
