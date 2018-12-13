package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
class Trace () extends ITrace {
  /**
       * Constructs a new Trace.
       * @param [properties] Properties to set
       */
  def this(properties: ITrace) = this()
  /** Trace clientAddress. */
  @JSName("clientAddress")
  var clientAddress_Trace: java.lang.String = js.native
  /** Trace clientName. */
  @JSName("clientName")
  var clientName_Trace: java.lang.String = js.native
  /** Trace clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_Trace: java.lang.String = js.native
  /** Trace clientVersion. */
  @JSName("clientVersion")
  var clientVersion_Trace: java.lang.String = js.native
  /** Trace durationNs. */
  @JSName("durationNs")
  var durationNs_Trace: scala.Double = js.native
  /** Trace fullQueryCacheHit. */
  @JSName("fullQueryCacheHit")
  var fullQueryCacheHit_Trace: scala.Boolean = js.native
  /** Trace legacySignatureNeedsResigning. */
  @JSName("legacySignatureNeedsResigning")
  var legacySignatureNeedsResigning_Trace: java.lang.String = js.native
  /** Trace originReportedDurationNs. */
  @JSName("originReportedDurationNs")
  var originReportedDurationNs_Trace: scala.Double = js.native
  /** Trace persistedQueryHit. */
  @JSName("persistedQueryHit")
  var persistedQueryHit_Trace: scala.Boolean = js.native
  /** Trace persistedQueryRegister. */
  @JSName("persistedQueryRegister")
  var persistedQueryRegister_Trace: scala.Boolean = js.native
  /** Trace signature. */
  @JSName("signature")
  var signature_Trace: java.lang.String = js.native
  /**
       * Converts this Trace to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object Trace extends js.Object {
  /**
       * Creates a new Trace instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Trace instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Creates a new Trace instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Trace instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Decodes a Trace message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Trace
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
       * @param message Trace message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
       * @param message Trace message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
       * @param message Trace message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
       * @param message Trace message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a Trace message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns Trace
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
       * Creates a plain object from a Trace message. Also converts values to other types if specified.
       * @param message Trace
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a Trace message. Also converts values to other types if specified.
       * @param message Trace
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a Trace message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

