package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats")
@js.native
/**
  * Constructs a new TracesAndStats.
  * @param [properties] Properties to set
  */
class TracesAndStats () extends ITracesAndStats {
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
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.create")
  @js.native
  def create(): TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.create")
  @js.native
  def create(properties: ITracesAndStats): TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Reader): TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Uint8Array): TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TracesAndStats = js.native
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.encode")
  @js.native
  def encode(message: ITracesAndStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.encode")
  @js.native
  def encode(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITracesAndStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a TracesAndStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesAndStats
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TracesAndStats = js.native
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.toObject")
  @js.native
  def toObject(message: TracesAndStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.toObject")
  @js.native
  def toObject(message: TracesAndStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
