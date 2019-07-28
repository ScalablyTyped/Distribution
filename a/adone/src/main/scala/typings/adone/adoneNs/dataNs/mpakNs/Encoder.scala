package typings.adone.adoneNs.dataNs.mpakNs

import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.dataNs.mpakNs.INs.EncodingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a MessagePack encoder
  */
@JSGlobal("adone.data.mpak.Encoder")
@js.native
class Encoder protected () extends js.Object {
  def this(encodingTypes: js.Array[EncodingType]) = this()
  /**
    * Encodes the given value
    */
  def encode[T /* <: ByteArray */](x: js.Any): T = js.native
  def encode[T /* <: ByteArray */](x: js.Any, buf: T): T = js.native
}

