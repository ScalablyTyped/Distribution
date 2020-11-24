package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "google")
@js.native
object google extends js.Object {
  
  /** Namespace protobuf. */
  @js.native
  object protobuf extends js.Object {
    
    /** Represents a Timestamp. */
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp ()
      extends typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp {
      def this(properties: ITimestamp) = this()
    }
    /* static members */
    @js.native
    object Timestamp extends js.Object {
      
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      def create(): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def create(properties: ITimestamp): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: ITimestamp): Writer = js.native
      def encode(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: ITimestamp): Writer = js.native
      def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
  }
}
