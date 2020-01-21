package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TimeStats")
@js.native
/**
  * Constructs a new TimeStats.
  * @param [properties] Properties to set
  */
class TimeStats () extends ITimeStats {
  def this(properties: ITimeStats) = this()
  /** TimeStats realNsDelta. */
  @JSName("realNsDelta")
  var realNsDelta_TimeStats: Double = js.native
  /** TimeStats sysNsDelta. */
  @JSName("sysNsDelta")
  var sysNsDelta_TimeStats: Double = js.native
  /** TimeStats uptimeNs. */
  @JSName("uptimeNs")
  var uptimeNs_TimeStats: Double = js.native
  /** TimeStats userNsDelta. */
  @JSName("userNsDelta")
  var userNsDelta_TimeStats: Double = js.native
  /**
    * Converts this TimeStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TimeStats")
@js.native
object TimeStats extends js.Object {
  /**
    * Creates a new TimeStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TimeStats instance
    */
  def create(): TimeStats = js.native
  def create(properties: ITimeStats): TimeStats = js.native
  /**
    * Decodes a TimeStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TimeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TimeStats = js.native
  def decode(reader: Reader, length: Double): TimeStats = js.native
  def decode(reader: Uint8Array): TimeStats = js.native
  def decode(reader: Uint8Array, length: Double): TimeStats = js.native
  /**
    * Decodes a TimeStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TimeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TimeStats = js.native
  def decodeDelimited(reader: Uint8Array): TimeStats = js.native
  /**
    * Encodes the specified TimeStats message. Does not implicitly {@link TimeStats.verify|verify} messages.
    * @param message TimeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITimeStats): Writer = js.native
  def encode(message: ITimeStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TimeStats message, length delimited. Does not implicitly {@link TimeStats.verify|verify} messages.
    * @param message TimeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITimeStats): Writer = js.native
  def encodeDelimited(message: ITimeStats, writer: Writer): Writer = js.native
  /**
    * Creates a TimeStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TimeStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): TimeStats = js.native
  /**
    * Creates a plain object from a TimeStats message. Also converts values to other types if specified.
    * @param message TimeStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TimeStats): StringDictionary[js.Any] = js.native
  def toObject(message: TimeStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TimeStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

