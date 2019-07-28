package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.IValues
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.ICachePolicy
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IDetails
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IError
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IHTTP
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.ILocation
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.INode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IQueryPlanNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Trace")
@js.native
object TraceNs extends js.Object {
  /** Represents a CachePolicy. */
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy {
    def this(properties: ICachePolicy) = this()
  }
  
  /** Represents a Details. */
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details {
    def this(properties: IDetails) = this()
  }
  
  /** Represents an Error. */
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error {
    def this(properties: IError) = this()
  }
  
  /** Represents a HTTP. */
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP {
    def this(properties: IHTTP) = this()
  }
  
  /** Represents a Location. */
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location {
    def this(properties: ILocation) = this()
  }
  
  /** Represents a Node. */
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  class Node ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node {
    def this(properties: INode) = this()
  }
  
  /** Represents a QueryPlanNode. */
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode ()
    extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
  }
  
  /* static members */
  @js.native
  object CachePolicy extends js.Object {
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    def create(properties: ICachePolicy): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: ICachePolicy): Writer = js.native
    def encode(message: ICachePolicy, writer: Writer): Writer = js.native
    /**
      * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: ICachePolicy): Writer = js.native
    def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = js.native
    /**
      * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CachePolicy
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @JSName("CachePolicy")
  @js.native
  object CachePolicyNs extends js.Object {
    /** Scope enum. */
    @js.native
    object Scope extends js.Object {
      /* 2 */ val PRIVATE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.PRIVATE with Double = js.native
      /* 1 */ val PUBLIC: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.PUBLIC with Double = js.native
      /* 0 */ val UNKNOWN: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope with Double
          ] = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Details extends js.Object {
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    def create(properties: IDetails): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IDetails): Writer = js.native
    def encode(message: IDetails, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IDetails): Writer = js.native
    def encodeDelimited(message: IDetails, writer: Writer): Writer = js.native
    /**
      * Creates a Details message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Details
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details = js.native
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object Error extends js.Object {
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    def create(properties: IError): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IError): Writer = js.native
    def encode(message: IError, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IError): Writer = js.native
    def encodeDelimited(message: IError, writer: Writer): Writer = js.native
    /**
      * Creates an Error message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Error
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error = js.native
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object HTTP extends js.Object {
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    def create(properties: IHTTP): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IHTTP): Writer = js.native
    def encode(message: IHTTP, writer: Writer): Writer = js.native
    /**
      * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IHTTP): Writer = js.native
    def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
    /**
      * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HTTP
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @JSName("HTTP")
  @js.native
  object HTTPNs extends js.Object {
    /** Represents a Values. */
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values {
      def this(properties: IValues) = this()
    }
    
    /** Method enum. */
    @js.native
    object Method extends js.Object {
      /* 8 */ val CONNECT: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.CONNECT with Double = js.native
      /* 6 */ val DELETE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.DELETE with Double = js.native
      /* 2 */ val GET: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.GET with Double = js.native
      /* 3 */ val HEAD: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.HEAD with Double = js.native
      /* 1 */ val OPTIONS: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.OPTIONS with Double = js.native
      /* 9 */ val PATCH: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.PATCH with Double = js.native
      /* 4 */ val POST: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.POST with Double = js.native
      /* 5 */ val PUT: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.PUT with Double = js.native
      /* 7 */ val TRACE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.TRACE with Double = js.native
      /* 0 */ val UNKNOWN: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method with Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object Values extends js.Object {
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def create(properties: IValues): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: IValues): Writer = js.native
      def encode(message: IValues, writer: Writer): Writer = js.native
      /**
        * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: IValues): Writer = js.native
      def encodeDelimited(message: IValues, writer: Writer): Writer = js.native
      /**
        * Creates a Values message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Values
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Location extends js.Object {
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    def create(properties: ILocation): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: ILocation): Writer = js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: ILocation): Writer = js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location = js.native
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object Node extends js.Object {
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    def create(properties: INode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: INode): Writer = js.native
    def encode(message: INode, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: INode): Writer = js.native
    def encodeDelimited(message: INode, writer: Writer): Writer = js.native
    /**
      * Creates a Node message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Node
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node = js.native
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object QueryPlanNode extends js.Object {
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def create(properties: IQueryPlanNode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IQueryPlanNode): Writer = js.native
    def encode(message: IQueryPlanNode, writer: Writer): Writer = js.native
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IQueryPlanNode): Writer = js.native
    def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = js.native
    /**
      * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryPlanNode
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @JSName("QueryPlanNode")
  @js.native
  object QueryPlanNodeNs extends js.Object {
    /** Represents a FetchNode. */
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    class FetchNode ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode {
      def this(properties: IFetchNode) = this()
    }
    
    /** Represents a FlattenNode. */
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    class FlattenNode ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode {
      def this(properties: IFlattenNode) = this()
    }
    
    /** Represents a ParallelNode. */
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode {
      def this(properties: IParallelNode) = this()
    }
    
    /** Represents a ResponsePathElement. */
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement {
      def this(properties: IResponsePathElement) = this()
    }
    
    /** Represents a SequenceNode. */
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode ()
      extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode {
      def this(properties: ISequenceNode) = this()
    }
    
    /* static members */
    @js.native
    object FetchNode extends js.Object {
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def create(properties: IFetchNode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: IFetchNode): Writer = js.native
      def encode(message: IFetchNode, writer: Writer): Writer = js.native
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: IFetchNode): Writer = js.native
      def encodeDelimited(message: IFetchNode, writer: Writer): Writer = js.native
      /**
        * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FetchNode
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode
      ): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /* static members */
    @js.native
    object FlattenNode extends js.Object {
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def create(properties: IFlattenNode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: IFlattenNode): Writer = js.native
      def encode(message: IFlattenNode, writer: Writer): Writer = js.native
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: IFlattenNode): Writer = js.native
      def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = js.native
      /**
        * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FlattenNode
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode
      ): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /* static members */
    @js.native
    object ParallelNode extends js.Object {
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def create(properties: IParallelNode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: IParallelNode): Writer = js.native
      def encode(message: IParallelNode, writer: Writer): Writer = js.native
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: IParallelNode): Writer = js.native
      def encodeDelimited(message: IParallelNode, writer: Writer): Writer = js.native
      /**
        * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ParallelNode
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode
      ): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /* static members */
    @js.native
    object ResponsePathElement extends js.Object {
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def create(properties: IResponsePathElement): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: IResponsePathElement): Writer = js.native
      def encode(message: IResponsePathElement, writer: Writer): Writer = js.native
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: IResponsePathElement): Writer = js.native
      def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = js.native
      /**
        * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ResponsePathElement
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement
      ): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /* static members */
    @js.native
    object SequenceNode extends js.Object {
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def create(properties: ISequenceNode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: ISequenceNode): Writer = js.native
      def encode(message: ISequenceNode, writer: Writer): Writer = js.native
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: ISequenceNode): Writer = js.native
      def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = js.native
      /**
        * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SequenceNode
        */
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode
      ): StringDictionary[js.Any] = js.native
      def toObject(
        message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
  }
  
}

