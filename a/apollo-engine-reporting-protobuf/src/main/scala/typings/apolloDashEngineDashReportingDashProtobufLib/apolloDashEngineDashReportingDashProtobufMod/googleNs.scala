package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "google")
@js.native
object googleNs extends js.Object {
  /** Namespace protobuf. */
  @JSName("protobuf")
  @js.native
  object protobufNs extends js.Object {
    /** Represents a Timestamp. */
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp ()
      extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp {
      def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp) = this()
    }
    
    /* static members */
    @js.native
    object Timestamp extends js.Object {
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.Timestamp,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
}

