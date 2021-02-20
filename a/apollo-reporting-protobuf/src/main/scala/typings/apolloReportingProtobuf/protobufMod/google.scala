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

object google {
  
  /** Namespace protobuf. */
  object protobuf {
    
    /** Represents a Timestamp. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp")
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp () extends ITimestamp {
      def this(properties: ITimestamp) = this()
      
      /** Timestamp nanos. */
      @JSName("nanos")
      var nanos_Timestamp: Double = js.native
      
      /** Timestamp seconds. */
      @JSName("seconds")
      var seconds_Timestamp: Double = js.native
      
      /**
        * Converts this Timestamp to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Timestamp {
      
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.create")
      @js.native
      def create(): Timestamp = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.create")
      @js.native
      def create(properties: ITimestamp): Timestamp = js.native
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Reader): Timestamp = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Reader, length: Double): Timestamp = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Uint8Array): Timestamp = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Timestamp = js.native
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Timestamp = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Timestamp = js.native
      
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.encode")
      @js.native
      def encode(message: ITimestamp): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.encode")
      @js.native
      def encode(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITimestamp): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Timestamp = js.native
      
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.toObject")
      @js.native
      def toObject(message: Timestamp): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.toObject")
      @js.native
      def toObject(message: Timestamp, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Properties of a Timestamp. */
    @js.native
    trait ITimestamp extends StObject {
      
      /** Timestamp nanos */
      var nanos: js.UndefOr[Double | Null] = js.native
      
      /** Timestamp seconds */
      var seconds: js.UndefOr[Double | Null] = js.native
    }
    object ITimestamp {
      
      @scala.inline
      def apply(): ITimestamp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITimestamp]
      }
      
      @scala.inline
      implicit class ITimestampMutableBuilder[Self <: ITimestamp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNanosNull: Self = StObject.set(x, "nanos", null)
        
        @scala.inline
        def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        @scala.inline
        def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondsNull: Self = StObject.set(x, "seconds", null)
        
        @scala.inline
        def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      }
    }
  }
}
