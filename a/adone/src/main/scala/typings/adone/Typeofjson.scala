package typings.adone

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofjson extends js.Object {
  val INs: js.Any = js.native
  /**
    * Decodes JSON string or buffer
    */
  def decode(buf: String): js.Any = js.native
  def decode(buf: Buffer): js.Any = js.native
  def decodeSafe(str: String): js.Any = js.native
  /**
    * Actually, the same as JSON.stringify, but returns a buffer
    */
  def encode(obj: js.Any): Buffer = js.native
  def encode(obj: js.Any, options: Anon_Newline): Buffer = js.native
  def encodeSafe(obj: js.Any): String = js.native
  /**
    * Deterministic version of JSON.stringify() so you can get a consistent hash from stringified results
    */
  def encodeStable(obj: js.Any): String = js.native
  def encodeStable(obj: js.Any, options: Anon_Cmp): String = js.native
}

