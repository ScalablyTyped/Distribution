package typings
package adoneLib.adoneNs.dataNs.jsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.json")
@js.native
object jsonNsMembers extends js.Object {
  /**
               * Decodes JSON string or buffer
               */
  def decode(buf: java.lang.String): js.Any = js.native
  /**
               * Decodes JSON string or buffer
               */
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decodeSafe(str: java.lang.String): js.Any = js.native
  /**
               * Actually, the same as JSON.stringify, but returns a buffer
               */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  /**
               * Actually, the same as JSON.stringify, but returns a buffer
               */
  def encode(obj: js.Any, options: adoneLib.Anon_Replacer): nodeLib.Buffer = js.native
  def encodeSafe(obj: js.Any): java.lang.String = js.native
  /**
               * Deterministic version of JSON.stringify() so you can get a consistent hash from stringified results
               */
  def encodeStable(obj: js.Any): java.lang.String = js.native
  /**
               * Deterministic version of JSON.stringify() so you can get a consistent hash from stringified results
               */
  def encodeStable(obj: js.Any, options: adoneLib.Anon_ReplacerCmp): java.lang.String = js.native
}

