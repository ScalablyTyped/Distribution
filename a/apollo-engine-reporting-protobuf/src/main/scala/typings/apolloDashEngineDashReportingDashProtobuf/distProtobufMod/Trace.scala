package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace () extends ITrace {
  def this(properties: ITrace) = this()
  /** Trace clientAddress. */
  @JSName("clientAddress")
  var clientAddress_Trace: String = js.native
  /** Trace clientName. */
  @JSName("clientName")
  var clientName_Trace: String = js.native
  /** Trace clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_Trace: String = js.native
  /** Trace clientVersion. */
  @JSName("clientVersion")
  var clientVersion_Trace: String = js.native
  /** Trace durationNs. */
  @JSName("durationNs")
  var durationNs_Trace: Double = js.native
  /** Trace forbiddenOperation. */
  @JSName("forbiddenOperation")
  var forbiddenOperation_Trace: Boolean = js.native
  /** Trace fullQueryCacheHit. */
  @JSName("fullQueryCacheHit")
  var fullQueryCacheHit_Trace: Boolean = js.native
  /** Trace legacySignatureNeedsResigning. */
  @JSName("legacySignatureNeedsResigning")
  var legacySignatureNeedsResigning_Trace: String = js.native
  /** Trace originReportedDurationNs. */
  @JSName("originReportedDurationNs")
  var originReportedDurationNs_Trace: Double = js.native
  /** Trace persistedQueryHit. */
  @JSName("persistedQueryHit")
  var persistedQueryHit_Trace: Boolean = js.native
  /** Trace persistedQueryRegister. */
  @JSName("persistedQueryRegister")
  var persistedQueryRegister_Trace: Boolean = js.native
  /** Trace registeredOperation. */
  @JSName("registeredOperation")
  var registeredOperation_Trace: Boolean = js.native
  /** Trace signature. */
  @JSName("signature")
  var signature_Trace: String = js.native
  /**
    * Converts this Trace to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object Trace extends js.Object {
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  def create(): Trace = js.native
  def create(properties: ITrace): Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Trace = js.native
  def decode(reader: Reader, length: Double): Trace = js.native
  def decode(reader: Uint8Array): Trace = js.native
  def decode(reader: Uint8Array, length: Double): Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Trace = js.native
  def decodeDelimited(reader: Uint8Array): Trace = js.native
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITrace): Writer = js.native
  def encode(message: ITrace, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITrace): Writer = js.native
  def encodeDelimited(message: ITrace, writer: Writer): Writer = js.native
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  def fromObject(`object`: StringDictionary[js.Any]): Trace = js.native
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Trace): StringDictionary[js.Any] = js.native
  def toObject(message: Trace, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

