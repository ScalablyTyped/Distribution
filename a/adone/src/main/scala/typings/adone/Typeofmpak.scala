package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.adone.adoneNs.dataNs.mpakNs.Decoder
import typings.adone.adoneNs.dataNs.mpakNs.Encoder
import typings.adone.adoneNs.dataNs.mpakNs.INs.DecodingType
import typings.adone.adoneNs.dataNs.mpakNs.INs.EncodingType
import typings.adone.adoneNs.dataNs.mpakNs.Serializer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmpak extends js.Object {
  /**
    * Represents a MessagePack decoder
    */
  var Decoder: Instantiable1[
    /* decodingTypes */ js.Array[DecodingType], 
    typings.adone.adoneNs.dataNs.mpakNs.Decoder
  ]
  /**
    * Represents a MessagePack encoder
    */
  var Encoder: Instantiable1[
    /* encodingTypes */ js.Array[EncodingType], 
    typings.adone.adoneNs.dataNs.mpakNs.Encoder
  ]
  val INs: js.Any
  /**
    * Represents a MessagePack serializer
    */
  var Serializer: Instantiable1[
    js.UndefOr[/* initialCapacity */ Double], 
    typings.adone.adoneNs.dataNs.mpakNs.Serializer
  ]
  /**
    * An instance of default adone serializer with registered encoders/decoders for standard js/adone types like
    * x.Exception, Error, Date, Map, Set, math.Long
    */
  val serializer: Serializer
  /**
    * Decoder the given buffer
    */
  def decode(buf: Wrappable): js.Any
  /**
    * Encodes the given object
    */
  def encode(obj: js.Any): Buffer
  def registerCommonTypesFor(s: Serializer): Unit
  def tryDecode(buf: ByteArray): js.Any
}

object Typeofmpak {
  @scala.inline
  def apply(
    Decoder: Instantiable1[/* decodingTypes */ js.Array[DecodingType], Decoder],
    Encoder: Instantiable1[/* encodingTypes */ js.Array[EncodingType], Encoder],
    INs: js.Any,
    Serializer: Instantiable1[js.UndefOr[/* initialCapacity */ Double], Serializer],
    decode: Wrappable => js.Any,
    encode: js.Any => Buffer,
    registerCommonTypesFor: Serializer => Unit,
    serializer: Serializer,
    tryDecode: ByteArray => js.Any
  ): Typeofmpak = {
    val __obj = js.Dynamic.literal(Decoder = Decoder, Encoder = Encoder, INs = INs, Serializer = Serializer, decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), registerCommonTypesFor = js.Any.fromFunction1(registerCommonTypesFor), serializer = serializer, tryDecode = js.Any.fromFunction1(tryDecode))
  
    __obj.asInstanceOf[Typeofmpak]
  }
}

