package typings
package adoneLib.adoneNs.dataNs.mpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a MessagePack decoder
  */
@JSGlobal("adone.data.mpak.Decoder")
@js.native
class Decoder protected () extends js.Object {
  def this(decodingTypes: js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.DecodingType]) = this()
  /**
    * Decodes the given buffer
    */
  def decode(buf: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): js.Any = js.native
  /**
    * Decodes the given ByteArray buffer, but does not throw IncompleteBufferError if the size is invalid
    */
  def tryDecode(buf: adoneLib.adoneNs.collectionNs.ByteArray): js.Any = js.native
}

