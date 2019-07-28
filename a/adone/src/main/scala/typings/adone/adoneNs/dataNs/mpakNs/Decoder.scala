package typings.adone.adoneNs.dataNs.mpakNs

import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.adone.adoneNs.dataNs.mpakNs.INs.DecodingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a MessagePack decoder
  */
@JSGlobal("adone.data.mpak.Decoder")
@js.native
class Decoder protected () extends js.Object {
  def this(decodingTypes: js.Array[DecodingType]) = this()
  /**
    * Decodes the given buffer
    */
  def decode(buf: Wrappable): js.Any = js.native
  /**
    * Decodes the given ByteArray buffer, but does not throw IncompleteBufferError if the size is invalid
    */
  def tryDecode(buf: ByteArray): js.Any = js.native
}

