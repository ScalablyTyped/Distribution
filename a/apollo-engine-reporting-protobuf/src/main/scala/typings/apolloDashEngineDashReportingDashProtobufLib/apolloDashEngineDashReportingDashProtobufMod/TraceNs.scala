package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Trace")
@js.native
object TraceNs extends js.Object {
  /** Represents a CachePolicy. */
  @js.native
  class CachePolicy ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy {
    /**
             * Constructs a new CachePolicy.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy) = this()
  }
  
  /** Represents a Details. */
  @js.native
  class Details ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details {
    /**
             * Constructs a new Details.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails) = this()
  }
  
  /** Represents an Error. */
  @js.native
  class Error ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error {
    /**
             * Constructs a new Error.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError) = this()
  }
  
  /** Represents a HTTP. */
  @js.native
  class HTTP ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP {
    /**
             * Constructs a new HTTP.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP) = this()
  }
  
  /** Represents a Location. */
  @js.native
  class Location ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location {
    /**
             * Constructs a new Location.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation) = this()
  }
  
  /** Represents a Node. */
  @js.native
  class Node ()
    extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node {
    /**
             * Constructs a new Node.
             * @param [properties] Properties to set
             */
    def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode) = this()
  }
  
  /** Represents a CachePolicy. */
  @js.native
  object CachePolicy extends js.Object {
    /**
             * Creates a new CachePolicy instance using the specified properties.
             * @param [properties] Properties to set
             * @returns CachePolicy instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Creates a new CachePolicy instance using the specified properties.
             * @param [properties] Properties to set
             * @returns CachePolicy instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns CachePolicy
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
             * @param message CachePolicy
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
             * @param message CachePolicy
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a CachePolicy message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  @JSName("CachePolicy")
  @js.native
  object CachePolicyNs extends js.Object {
    /** Scope enum. */
    @js.native
    object Scope extends js.Object {
      /* 2 */ val PRIVATE: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope.PRIVATE with scala.Double = js.native
      /* 1 */ val PUBLIC: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope.PUBLIC with scala.Double = js.native
      /* 0 */ val UNKNOWN: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope with scala.Double
          ] = js.native
    }
    
    type Scope = apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope
  }
  
  /** Represents a Details. */
  @js.native
  object Details extends js.Object {
    /**
             * Creates a new Details instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Details instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Creates a new Details instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Details instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Details message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Details
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Creates a plain object from a Details message. Also converts values to other types if specified.
             * @param message Details
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Details message. Also converts values to other types if specified.
             * @param message Details
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Details message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents an Error. */
  @js.native
  object Error extends js.Object {
    /**
             * Creates a new Error instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Error instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Creates a new Error instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Error instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates an Error message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Error
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Creates a plain object from an Error message. Also converts values to other types if specified.
             * @param message Error
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from an Error message. Also converts values to other types if specified.
             * @param message Error
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies an Error message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents a HTTP. */
  @js.native
  object HTTP extends js.Object {
    /**
             * Creates a new HTTP instance using the specified properties.
             * @param [properties] Properties to set
             * @returns HTTP instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Creates a new HTTP instance using the specified properties.
             * @param [properties] Properties to set
             * @returns HTTP instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns HTTP
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Creates a plain object from a HTTP message. Also converts values to other types if specified.
             * @param message HTTP
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a HTTP message. Also converts values to other types if specified.
             * @param message HTTP
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a HTTP message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  @JSName("HTTP")
  @js.native
  object HTTPNs extends js.Object {
    /** Represents a Values. */
    @js.native
    class Values ()
      extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values {
      /**
                   * Constructs a new Values.
                   * @param [properties] Properties to set
                   */
      def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues) = this()
    }
    
    /** Method enum. */
    @js.native
    object Method extends js.Object {
      /* 8 */ val CONNECT: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.CONNECT with scala.Double = js.native
      /* 6 */ val DELETE: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.DELETE with scala.Double = js.native
      /* 2 */ val GET: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.GET with scala.Double = js.native
      /* 3 */ val HEAD: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.HEAD with scala.Double = js.native
      /* 1 */ val OPTIONS: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.OPTIONS with scala.Double = js.native
      /* 9 */ val PATCH: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.PATCH with scala.Double = js.native
      /* 4 */ val POST: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.POST with scala.Double = js.native
      /* 5 */ val PUT: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.PUT with scala.Double = js.native
      /* 7 */ val TRACE: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.TRACE with scala.Double = js.native
      /* 0 */ val UNKNOWN: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method with scala.Double
          ] = js.native
    }
    
    /** Represents a Values. */
    @js.native
    object Values extends js.Object {
      /**
                   * Creates a new Values instance using the specified properties.
                   * @param [properties] Properties to set
                   * @returns Values instance
                   */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Creates a new Values instance using the specified properties.
                   * @param [properties] Properties to set
                   * @returns Values instance
                   */
      def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer, length delimited.
                   * @param reader Reader or buffer to decode from
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer, length delimited.
                   * @param reader Reader or buffer to decode from
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Creates a Values message from a plain object. Also converts values to their respective internal types.
                   * @param object Plain object
                   * @returns Values
                   */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Creates a plain object from a Values message. Also converts values to other types if specified.
                   * @param message Values
                   * @param [options] Conversion options
                   * @returns Plain object
                   */
      def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
                   * Creates a plain object from a Values message. Also converts values to other types if specified.
                   * @param message Values
                   * @param [options] Conversion options
                   * @returns Plain object
                   */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
                   * Verifies a Values message.
                   * @param message Plain object to verify
                   * @returns `null` if valid, otherwise the reason why it is not
                   */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    type Method = apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
  }
  
  /** Represents a Location. */
  @js.native
  object Location extends js.Object {
    /**
             * Creates a new Location instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Location instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Creates a new Location instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Location instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Location message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Location
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Creates a plain object from a Location message. Also converts values to other types if specified.
             * @param message Location
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Location message. Also converts values to other types if specified.
             * @param message Location
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Location message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents a Node. */
  @js.native
  object Node extends js.Object {
    /**
             * Creates a new Node instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Node instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Creates a new Node instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Node instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Node message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Node
             */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Creates a plain object from a Node message. Also converts values to other types if specified.
             * @param message Node
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Node message. Also converts values to other types if specified.
             * @param message Node
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Node message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
}

