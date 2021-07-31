package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats")
@js.native
/**
  * Constructs a new TracesAndStats.
  * @param [properties] Properties to set
  */
class TracesAndStats ()
  extends StObject
     with ITracesAndStats {
  def this(properties: ITracesAndStats) = this()
  
  /** TracesAndStats statsWithContext. */
  @JSName("statsWithContext")
  var statsWithContext_TracesAndStats: js.Array[IContextualizedStats] = js.native
  
  /**
    * Converts this TracesAndStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** TracesAndStats trace. */
  @JSName("trace")
  var trace_TracesAndStats: js.Array[ITrace] = js.native
}
/* static members */
object TracesAndStats {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  @scala.inline
  def create(): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TracesAndStats]
  @scala.inline
  def create(properties: ITracesAndStats): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  @scala.inline
  def decode(reader: Reader, length: Double): TracesAndStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TracesAndStats]
  @scala.inline
  def decode(reader: Uint8Array): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TracesAndStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TracesAndStats]
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITracesAndStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITracesAndStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITracesAndStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TracesAndStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesAndStats
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TracesAndStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TracesAndStats]
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TracesAndStats): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TracesAndStats, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
