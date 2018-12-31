package typings
package adoneLib.adoneNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON5 encoder
  */
@JSGlobal("adone.data.json5")
@js.native
object json5Ns extends js.Object {
  /**
    * Decodes the given string/buffer
    */
  def decode(buf: java.lang.String): js.Any = js.native
  def decode(
    buf: java.lang.String,
    reviver: js.Function3[/* holder */ js.Object, /* key */ java.lang.String, /* value */ js.Any, _]
  ): js.Any = js.native
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decode(
    buf: nodeLib.Buffer,
    reviver: js.Function3[/* holder */ js.Object, /* key */ java.lang.String, /* value */ js.Any, _]
  ): js.Any = js.native
  /**
    * Encodes the given value
    */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  def encode(obj: js.Any, options: adoneLib.Anon_ReplacerKey): nodeLib.Buffer = js.native
}

