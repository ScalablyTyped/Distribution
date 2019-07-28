package typings.adone

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofjson5 extends js.Object {
  /**
    * Decodes the given string/buffer
    */
  def decode(buf: String): js.Any = js.native
  def decode(
    buf: String,
    reviver: js.Function3[/* holder */ js.Object, /* key */ String, /* value */ js.Any, _]
  ): js.Any = js.native
  def decode(buf: Buffer): js.Any = js.native
  def decode(
    buf: Buffer,
    reviver: js.Function3[/* holder */ js.Object, /* key */ String, /* value */ js.Any, _]
  ): js.Any = js.native
  /**
    * Encodes the given value
    */
  def encode(obj: js.Any): Buffer = js.native
  def encode(obj: js.Any, options: Anon_Key): Buffer = js.native
}

