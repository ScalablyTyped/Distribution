package typings
package adoneLib.adoneNs.dataNs.mpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a MessagePack serializer
  */
@JSGlobal("adone.data.mpak.Serializer")
@js.native
class Serializer () extends js.Object {
  def this(initialCapacity: scala.Double) = this()
  /**
    * Decoder instance
    */
  val decoder: Decoder = js.native
  /**
    * Encoder instance
    */
  val encoder: Encoder = js.native
  /**
    * Decodes the given buffer
    */
  def decode(buf: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): js.Any = js.native
  def decode(buf: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable, needFlip: scala.Boolean): js.Any = js.native
  /**
    * Encodes the given value
    */
  def encode[T /* <: adoneLib.adoneNs.collectionNs.ByteArray */](x: js.Any): T = js.native
  def encode[T /* <: adoneLib.adoneNs.collectionNs.ByteArray */](x: js.Any, buf: T): T = js.native
  /**
    * Registers encoder/decoder functions for the given type and constructor
    *
    * @param type type identifier
    * @param constructor type constructor, used in the predicate function (instanceof)
    * @param encode type encoder
    * @param decode type decoder
    */
  def register[T](
    `type`: adoneLib.adoneNs.dataNs.mpakNs.INs.Type,
    constructor: adoneLib.Anon_ArgsAny[T],
    encode: js.Function2[/* x */ T, /* buf */ adoneLib.adoneNs.collectionNs.ByteArray, scala.Unit],
    decode: js.Function1[/* buf */ adoneLib.adoneNs.collectionNs.ByteArray, T]
  ): this.type = js.native
  /**
    * Registers a decoder for the given type
    *
    * @param type type identifier
    * @param decode type decoder
    */
  def registerDecoder(
    `type`: adoneLib.adoneNs.dataNs.mpakNs.INs.Type,
    decode: adoneLib.adoneNs.dataNs.mpakNs.INs.DecodeFunction
  ): this.type = js.native
  /**
    * Registers an encoder for the given type
    *
    * @param type type identifier
    * @param check type predicate
    * @param encode type encoder
    */
  def registerEncoder(
    `type`: adoneLib.adoneNs.dataNs.mpakNs.INs.Type,
    check: adoneLib.adoneNs.dataNs.mpakNs.INs.EncodeCheckFunction,
    encode: adoneLib.adoneNs.dataNs.mpakNs.INs.EncodeFunction
  ): this.type = js.native
}

