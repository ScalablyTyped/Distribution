package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ContextualizedTypeStats")
@js.native
/**
  * Constructs a new ContextualizedTypeStats.
  * @param [properties] Properties to set
  */
class ContextualizedTypeStats () extends IContextualizedTypeStats {
  def this(properties: IContextualizedTypeStats) = this()
  /** ContextualizedTypeStats perTypeStat. */
  @JSName("perTypeStat")
  var perTypeStat_ContextualizedTypeStats: StringDictionary[ITypeStat] = js.native
  /**
    * Converts this ContextualizedTypeStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ContextualizedTypeStats")
@js.native
object ContextualizedTypeStats extends js.Object {
  /**
    * Creates a new ContextualizedTypeStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedTypeStats instance
    */
  def create(): ContextualizedTypeStats = js.native
  def create(properties: IContextualizedTypeStats): ContextualizedTypeStats = js.native
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ContextualizedTypeStats = js.native
  def decode(reader: Reader, length: Double): ContextualizedTypeStats = js.native
  def decode(reader: Uint8Array): ContextualizedTypeStats = js.native
  def decode(reader: Uint8Array, length: Double): ContextualizedTypeStats = js.native
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ContextualizedTypeStats = js.native
  def decodeDelimited(reader: Uint8Array): ContextualizedTypeStats = js.native
  /**
    * Encodes the specified ContextualizedTypeStats message. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IContextualizedTypeStats): Writer = js.native
  def encode(message: IContextualizedTypeStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ContextualizedTypeStats message, length delimited. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IContextualizedTypeStats): Writer = js.native
  def encodeDelimited(message: IContextualizedTypeStats, writer: Writer): Writer = js.native
  /**
    * Creates a ContextualizedTypeStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedTypeStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): ContextualizedTypeStats = js.native
  /**
    * Creates a plain object from a ContextualizedTypeStats message. Also converts values to other types if specified.
    * @param message ContextualizedTypeStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ContextualizedTypeStats): StringDictionary[js.Any] = js.native
  def toObject(message: ContextualizedTypeStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ContextualizedTypeStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

