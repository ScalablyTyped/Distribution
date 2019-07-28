package typings.adone.adoneNs.dataNs.mpakNs

import typings.adone.Anon_Args
import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.adone.adoneNs.dataNs.mpakNs.INs.DecodeFunction
import typings.adone.adoneNs.dataNs.mpakNs.INs.EncodeCheckFunction
import typings.adone.adoneNs.dataNs.mpakNs.INs.EncodeFunction
import typings.adone.adoneNs.dataNs.mpakNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a MessagePack serializer
  */
@JSGlobal("adone.data.mpak.Serializer")
@js.native
class Serializer () extends js.Object {
  def this(initialCapacity: Double) = this()
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
  def decode(buf: Wrappable): js.Any = js.native
  def decode(buf: Wrappable, needFlip: Boolean): js.Any = js.native
  /**
    * Encodes the given value
    */
  def encode[T /* <: ByteArray */](x: js.Any): T = js.native
  def encode[T /* <: ByteArray */](x: js.Any, buf: T): T = js.native
  /**
    * Registers encoder/decoder functions for the given type and constructor
    *
    * @param type type identifier
    * @param constructor type constructor, used in the predicate function (instanceof)
    * @param encode type encoder
    * @param decode type decoder
    */
  def register[T](
    `type`: Type,
    constructor: Anon_Args[T],
    encode: js.Function2[/* x */ T, /* buf */ ByteArray, Unit],
    decode: js.Function1[/* buf */ ByteArray, T]
  ): this.type = js.native
  /**
    * Registers a decoder for the given type
    *
    * @param type type identifier
    * @param decode type decoder
    */
  def registerDecoder(`type`: Type, decode: DecodeFunction): this.type = js.native
  /**
    * Registers an encoder for the given type
    *
    * @param type type identifier
    * @param check type predicate
    * @param encode type encoder
    */
  def registerEncoder(`type`: Type, check: EncodeCheckFunction, encode: EncodeFunction): this.type = js.native
}

