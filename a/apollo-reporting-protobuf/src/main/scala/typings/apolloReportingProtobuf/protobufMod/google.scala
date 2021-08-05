package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    class Timestamp ()
      extends StObject
         with ITimestamp {
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
      
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "google.protobuf.Timestamp")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      /* static member */
      inline def create(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Timestamp]
      inline def create(properties: ITimestamp): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      inline def decode(reader: Reader, length: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
      inline def decode(reader: Uint8Array): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      inline def decode(reader: Uint8Array, length: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
      
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      inline def decodeDelimited(reader: Uint8Array): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITimestamp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITimestamp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITimestamp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITimestamp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
      
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Timestamp): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(message: Timestamp, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Properties of a Timestamp. */
    trait ITimestamp extends StObject {
      
      /** Timestamp nanos */
      var nanos: js.UndefOr[Double | Null] = js.undefined
      
      /** Timestamp seconds */
      var seconds: js.UndefOr[Double | Null] = js.undefined
    }
    object ITimestamp {
      
      inline def apply(): ITimestamp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITimestamp]
      }
      
      extension [Self <: ITimestamp](x: Self) {
        
        inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        inline def setNanosNull: Self = StObject.set(x, "nanos", null)
        
        inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
        
        inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      }
    }
  }
}
