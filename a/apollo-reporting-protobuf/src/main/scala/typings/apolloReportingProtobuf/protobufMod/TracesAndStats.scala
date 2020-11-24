package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
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
@JSImport("apollo-reporting-protobuf/dist/protobuf", "TracesAndStats")
@js.native
object TracesAndStats extends js.Object {
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  def create(): TracesAndStats = js.native
  def create(properties: ITracesAndStats): TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TracesAndStats = js.native
  def decode(reader: Reader, length: Double): TracesAndStats = js.native
  def decode(reader: Uint8Array): TracesAndStats = js.native
  def decode(reader: Uint8Array, length: Double): TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TracesAndStats = js.native
  def decodeDelimited(reader: Uint8Array): TracesAndStats = js.native
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITracesAndStats): Writer = js.native
  def encode(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITracesAndStats): Writer = js.native
  def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a TracesAndStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesAndStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): TracesAndStats = js.native
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TracesAndStats): StringDictionary[js.Any] = js.native
  def toObject(message: TracesAndStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
