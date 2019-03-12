package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufDecodeDecoder extends js.Object {
  /**
    * Represents a MessagePack decoder
    */
  var Decoder: org.scalablytyped.runtime.Instantiable1[
    /* decodingTypes */ js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.DecodingType], 
    adoneLib.adoneNs.dataNs.mpakNs.Decoder
  ]
  /**
    * Represents a MessagePack encoder
    */
  var Encoder: org.scalablytyped.runtime.Instantiable1[
    /* encodingTypes */ js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.EncodingType], 
    adoneLib.adoneNs.dataNs.mpakNs.Encoder
  ]
  val INs: js.Any
  /**
    * Represents a MessagePack serializer
    */
  var Serializer: org.scalablytyped.runtime.Instantiable1[
    /* initialCapacity */ js.UndefOr[/* initialCapacity */ scala.Double], 
    adoneLib.adoneNs.dataNs.mpakNs.Serializer
  ]
  /**
    * An instance of default adone serializer with registered encoders/decoders for standard js/adone types like
    * x.Exception, Error, Date, Map, Set, math.Long
    */
  val serializer: adoneLib.adoneNs.dataNs.mpakNs.Serializer
  /**
    * Decoder the given buffer
    */
  def decode(buf: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): js.Any
  /**
    * Encodes the given object
    */
  def encode(obj: js.Any): nodeLib.Buffer
  def registerCommonTypesFor(s: adoneLib.adoneNs.dataNs.mpakNs.Serializer): scala.Unit
  def tryDecode(buf: adoneLib.adoneNs.collectionNs.ByteArray): js.Any
}

object Anon_BufDecodeDecoder {
  @scala.inline
  def apply(
    Decoder: org.scalablytyped.runtime.Instantiable1[
      /* decodingTypes */ js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.DecodingType], 
      adoneLib.adoneNs.dataNs.mpakNs.Decoder
    ],
    Encoder: org.scalablytyped.runtime.Instantiable1[
      /* encodingTypes */ js.Array[adoneLib.adoneNs.dataNs.mpakNs.INs.EncodingType], 
      adoneLib.adoneNs.dataNs.mpakNs.Encoder
    ],
    INs: js.Any,
    Serializer: org.scalablytyped.runtime.Instantiable1[
      /* initialCapacity */ js.UndefOr[/* initialCapacity */ scala.Double], 
      adoneLib.adoneNs.dataNs.mpakNs.Serializer
    ],
    decode: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable => js.Any,
    encode: js.Any => nodeLib.Buffer,
    registerCommonTypesFor: adoneLib.adoneNs.dataNs.mpakNs.Serializer => scala.Unit,
    serializer: adoneLib.adoneNs.dataNs.mpakNs.Serializer,
    tryDecode: adoneLib.adoneNs.collectionNs.ByteArray => js.Any
  ): Anon_BufDecodeDecoder = {
    val __obj = js.Dynamic.literal(Decoder = Decoder, Encoder = Encoder, INs = INs, Serializer = Serializer, decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), registerCommonTypesFor = js.Any.fromFunction1(registerCommonTypesFor), serializer = serializer, tryDecode = js.Any.fromFunction1(tryDecode))
  
    __obj.asInstanceOf[Anon_BufDecodeDecoder]
  }
}

