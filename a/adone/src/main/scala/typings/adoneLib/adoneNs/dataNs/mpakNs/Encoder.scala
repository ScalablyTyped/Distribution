package typings
package adoneLib.adoneNs.dataNs.mpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Represents a MessagePack encoder
             */
@JSGlobal("adone.data.mpak.Encoder")
@js.native
class Encoder protected () extends js.Object {
  def this(encodingTypes: js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.EncodingType]) = this()
  /**
                   * Encodes the given value
                   */
  def encode[T /* <: adoneLib.adoneNs.collectionNs.ByteArray */](x: js.Any): T = js.native
  /**
                   * Encodes the given value
                   */
  def encode[T /* <: adoneLib.adoneNs.collectionNs.ByteArray */](x: js.Any, buf: T): T = js.native
}

