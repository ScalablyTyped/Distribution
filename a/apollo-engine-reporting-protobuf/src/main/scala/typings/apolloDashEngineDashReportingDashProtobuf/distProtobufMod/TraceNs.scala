package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.fetch
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.fieldName
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.flatten
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.index
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.parallel
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.responseName
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.sequence
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicy
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Details
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Error
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTP
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.IValues
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Method
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.HTTPNs.Values
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.ICachePolicy
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IDetails
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IError
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IHTTP
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.ILocation
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.INode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IQueryPlanNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Location
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.Node
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.googleNs.protobufNs.ITimestamp
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object TraceNs extends js.Object {
  /** Represents a CachePolicy. */
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy () extends ICachePolicy {
    def this(properties: ICachePolicy) = this()
    /** CachePolicy maxAgeNs. */
    @JSName("maxAgeNs")
    var maxAgeNs_CachePolicy: Double = js.native
    /** CachePolicy scope. */
    @JSName("scope")
    var scope_CachePolicy: Scope = js.native
    /**
      * Converts this CachePolicy to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Details. */
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details () extends IDetails {
    def this(properties: IDetails) = this()
    /** Details operationName. */
    @JSName("operationName")
    var operationName_Details: String = js.native
    /** Details rawQuery. */
    @JSName("rawQuery")
    var rawQuery_Details: String = js.native
    /** Details variablesJson. */
    @JSName("variablesJson")
    var variablesJson_Details: StringDictionary[String] = js.native
    /** Details variables. */
    @JSName("variables")
    var variables_Details: StringDictionary[Uint8Array] = js.native
    /**
      * Converts this Details to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Represents an Error. */
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error () extends IError {
    def this(properties: IError) = this()
    /** Error json. */
    @JSName("json")
    var json_Error: String = js.native
    /** Error location. */
    @JSName("location")
    var location_Error: js.Array[ILocation] = js.native
    /** Error message. */
    @JSName("message")
    var message_Error: String = js.native
    /** Error timeNs. */
    @JSName("timeNs")
    var timeNs_Error: Double = js.native
    /**
      * Converts this Error to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Represents a HTTP. */
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP () extends IHTTP {
    def this(properties: IHTTP) = this()
    /** HTTP host. */
    @JSName("host")
    var host_HTTP: String = js.native
    /** HTTP method. */
    @JSName("method")
    var method_HTTP: Method = js.native
    /** HTTP path. */
    @JSName("path")
    var path_HTTP: String = js.native
    /** HTTP protocol. */
    @JSName("protocol")
    var protocol_HTTP: String = js.native
    /** HTTP requestHeaders. */
    @JSName("requestHeaders")
    var requestHeaders_HTTP: StringDictionary[IValues] = js.native
    /** HTTP responseHeaders. */
    @JSName("responseHeaders")
    var responseHeaders_HTTP: StringDictionary[IValues] = js.native
    /** HTTP secure. */
    @JSName("secure")
    var secure_HTTP: Boolean = js.native
    /** HTTP statusCode. */
    @JSName("statusCode")
    var statusCode_HTTP: Double = js.native
    /**
      * Converts this HTTP to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Properties of a CachePolicy. */
  trait ICachePolicy extends js.Object {
    /** CachePolicy maxAgeNs */
    var maxAgeNs: js.UndefOr[Double | Null] = js.undefined
    /** CachePolicy scope */
    var scope: js.UndefOr[Scope | Null] = js.undefined
  }
  
  /** Properties of a Details. */
  trait IDetails extends js.Object {
    /** Details operationName */
    var operationName: js.UndefOr[String | Null] = js.undefined
    /** Details rawQuery */
    var rawQuery: js.UndefOr[String | Null] = js.undefined
    /** Details variables */
    var variables: js.UndefOr[StringDictionary[Uint8Array] | Null] = js.undefined
    /** Details variablesJson */
    var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  
  /** Properties of an Error. */
  trait IError extends js.Object {
    /** Error json */
    var json: js.UndefOr[String | Null] = js.undefined
    /** Error location */
    var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
    /** Error message */
    var message: js.UndefOr[String | Null] = js.undefined
    /** Error timeNs */
    var timeNs: js.UndefOr[Double | Null] = js.undefined
  }
  
  /** Properties of a HTTP. */
  trait IHTTP extends js.Object {
    /** HTTP host */
    var host: js.UndefOr[String | Null] = js.undefined
    /** HTTP method */
    var method: js.UndefOr[Method | Null] = js.undefined
    /** HTTP path */
    var path: js.UndefOr[String | Null] = js.undefined
    /** HTTP protocol */
    var protocol: js.UndefOr[String | Null] = js.undefined
    /** HTTP requestHeaders */
    var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
    /** HTTP responseHeaders */
    var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
    /** HTTP secure */
    var secure: js.UndefOr[Boolean | Null] = js.undefined
    /** HTTP statusCode */
    var statusCode: js.UndefOr[Double | Null] = js.undefined
  }
  
  /** Properties of a Location. */
  trait ILocation extends js.Object {
    /** Location column */
    var column: js.UndefOr[Double | Null] = js.undefined
    /** Location line */
    var line: js.UndefOr[Double | Null] = js.undefined
  }
  
  /** Properties of a Node. */
  trait INode extends js.Object {
    /** Node cachePolicy */
    var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.undefined
    /** Node child */
    var child: js.UndefOr[js.Array[INode] | Null] = js.undefined
    /** Node endTime */
    var endTime: js.UndefOr[Double | Null] = js.undefined
    /** Node error */
    var error: js.UndefOr[js.Array[IError] | Null] = js.undefined
    /** Node index */
    var index: js.UndefOr[Double | Null] = js.undefined
    /** Node originalFieldName */
    var originalFieldName: js.UndefOr[String | Null] = js.undefined
    /** Node parentType */
    var parentType: js.UndefOr[String | Null] = js.undefined
    /** Node responseName */
    var responseName: js.UndefOr[String | Null] = js.undefined
    /** Node startTime */
    var startTime: js.UndefOr[Double | Null] = js.undefined
    /** Node type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  
  /** Properties of a QueryPlanNode. */
  trait IQueryPlanNode extends js.Object {
    /** QueryPlanNode fetch */
    var fetch: js.UndefOr[IFetchNode | Null] = js.undefined
    /** QueryPlanNode flatten */
    var flatten: js.UndefOr[IFlattenNode | Null] = js.undefined
    /** QueryPlanNode parallel */
    var parallel: js.UndefOr[IParallelNode | Null] = js.undefined
    /** QueryPlanNode sequence */
    var sequence: js.UndefOr[ISequenceNode | Null] = js.undefined
  }
  
  /** Represents a Location. */
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location () extends ILocation {
    def this(properties: ILocation) = this()
    /** Location column. */
    @JSName("column")
    var column_Location: Double = js.native
    /** Location line. */
    @JSName("line")
    var line_Location: Double = js.native
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Node. */
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  class Node () extends INode {
    def this(properties: INode) = this()
    /** Node child. */
    @JSName("child")
    var child_Node: js.Array[INode] = js.native
    /** Node endTime. */
    @JSName("endTime")
    var endTime_Node: Double = js.native
    /** Node error. */
    @JSName("error")
    var error_Node: js.Array[IError] = js.native
    /** Node id. */
    var id: js.UndefOr[responseName | index] = js.native
    /** Node index. */
    @JSName("index")
    var index_Node: Double = js.native
    /** Node originalFieldName. */
    @JSName("originalFieldName")
    var originalFieldName_Node: String = js.native
    /** Node parentType. */
    @JSName("parentType")
    var parentType_Node: String = js.native
    /** Node responseName. */
    @JSName("responseName")
    var responseName_Node: String = js.native
    /** Node startTime. */
    @JSName("startTime")
    var startTime_Node: Double = js.native
    /** Node type. */
    @JSName("type")
    var type_Node: String = js.native
    /**
      * Converts this Node to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /** Represents a QueryPlanNode. */
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode () extends IQueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
    /** QueryPlanNode node. */
    var node: js.UndefOr[sequence | parallel | fetch | flatten] = js.native
    /**
      * Converts this QueryPlanNode to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  
  /* static members */
  @js.native
  object CachePolicy extends js.Object {
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    def create(): CachePolicy = js.native
    def create(properties: ICachePolicy): CachePolicy = js.native
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): CachePolicy = js.native
    def decode(reader: Reader, length: Double): CachePolicy = js.native
    def decode(reader: Uint8Array): CachePolicy = js.native
    def decode(reader: Uint8Array, length: Double): CachePolicy = js.native
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): CachePolicy = js.native
    def decodeDelimited(reader: Uint8Array): CachePolicy = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): CachePolicy = js.native
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: CachePolicy): StringDictionary[js.Any] = js.native
    def toObject(message: CachePolicy, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    @js.native
    sealed trait Scope extends js.Object
    
    /** Scope enum. */
    @js.native
    object Scope extends js.Object {
      @js.native
      sealed trait PRIVATE extends Scope
      
      @js.native
      sealed trait PUBLIC extends Scope
      
      @js.native
      sealed trait UNKNOWN extends Scope
      
      /* 2 */ val PRIVATE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.PRIVATE with Double = js.native
      /* 1 */ val PUBLIC: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.PUBLIC with Double = js.native
      /* 0 */ val UNKNOWN: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.CachePolicyNs.Scope.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Scope with Double] = js.native
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
    def create(): Details = js.native
    def create(properties: IDetails): Details = js.native
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): Details = js.native
    def decode(reader: Reader, length: Double): Details = js.native
    def decode(reader: Uint8Array): Details = js.native
    def decode(reader: Uint8Array, length: Double): Details = js.native
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): Details = js.native
    def decodeDelimited(reader: Uint8Array): Details = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): Details = js.native
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: Details): StringDictionary[js.Any] = js.native
    def toObject(message: Details, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    def create(): Error = js.native
    def create(properties: IError): Error = js.native
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): Error = js.native
    def decode(reader: Reader, length: Double): Error = js.native
    def decode(reader: Uint8Array): Error = js.native
    def decode(reader: Uint8Array, length: Double): Error = js.native
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): Error = js.native
    def decodeDelimited(reader: Uint8Array): Error = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): Error = js.native
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: Error): StringDictionary[js.Any] = js.native
    def toObject(message: Error, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    def create(): HTTP = js.native
    def create(properties: IHTTP): HTTP = js.native
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): HTTP = js.native
    def decode(reader: Reader, length: Double): HTTP = js.native
    def decode(reader: Uint8Array): HTTP = js.native
    def decode(reader: Uint8Array, length: Double): HTTP = js.native
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): HTTP = js.native
    def decodeDelimited(reader: Uint8Array): HTTP = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): HTTP = js.native
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: HTTP): StringDictionary[js.Any] = js.native
    def toObject(message: HTTP, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    /** Properties of a Values. */
    trait IValues extends js.Object {
      /** Values value */
      var value: js.UndefOr[js.Array[String] | Null] = js.undefined
    }
    
    @js.native
    sealed trait Method extends js.Object
    
    /** Represents a Values. */
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values () extends IValues {
      def this(properties: IValues) = this()
      /** Values value. */
      @JSName("value")
      var value_Values: js.Array[String] = js.native
      /**
        * Converts this Values to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /** Method enum. */
    @js.native
    object Method extends js.Object {
      @js.native
      sealed trait CONNECT extends Method
      
      @js.native
      sealed trait DELETE extends Method
      
      @js.native
      sealed trait GET extends Method
      
      @js.native
      sealed trait HEAD extends Method
      
      @js.native
      sealed trait OPTIONS extends Method
      
      @js.native
      sealed trait PATCH extends Method
      
      @js.native
      sealed trait POST extends Method
      
      @js.native
      sealed trait PUT extends Method
      
      @js.native
      sealed trait TRACE extends Method
      
      @js.native
      sealed trait UNKNOWN extends Method
      
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
      def apply(value: Double): js.UndefOr[Method with Double] = js.native
    }
    
    /* static members */
    @js.native
    object Values extends js.Object {
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      def create(): Values = js.native
      def create(properties: IValues): Values = js.native
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): Values = js.native
      def decode(reader: Reader, length: Double): Values = js.native
      def decode(reader: Uint8Array): Values = js.native
      def decode(reader: Uint8Array, length: Double): Values = js.native
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): Values = js.native
      def decodeDelimited(reader: Uint8Array): Values = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): Values = js.native
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: Values): StringDictionary[js.Any] = js.native
      def toObject(message: Values, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    def create(): Location = js.native
    def create(properties: ILocation): Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): Location = js.native
    def decode(reader: Reader, length: Double): Location = js.native
    def decode(reader: Uint8Array): Location = js.native
    def decode(reader: Uint8Array, length: Double): Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): Location = js.native
    def decodeDelimited(reader: Uint8Array): Location = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): Location = js.native
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: Location): StringDictionary[js.Any] = js.native
    def toObject(message: Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    def create(): Node = js.native
    def create(properties: INode): Node = js.native
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): Node = js.native
    def decode(reader: Reader, length: Double): Node = js.native
    def decode(reader: Uint8Array): Node = js.native
    def decode(reader: Uint8Array, length: Double): Node = js.native
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): Node = js.native
    def decodeDelimited(reader: Uint8Array): Node = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): Node = js.native
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: Node): StringDictionary[js.Any] = js.native
    def toObject(message: Node, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    def create(): QueryPlanNode = js.native
    def create(properties: IQueryPlanNode): QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): QueryPlanNode = js.native
    def decode(reader: Reader, length: Double): QueryPlanNode = js.native
    def decode(reader: Uint8Array): QueryPlanNode = js.native
    def decode(reader: Uint8Array, length: Double): QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): QueryPlanNode = js.native
    def decodeDelimited(reader: Uint8Array): QueryPlanNode = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): QueryPlanNode = js.native
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: QueryPlanNode): StringDictionary[js.Any] = js.native
    def toObject(message: QueryPlanNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
    class FetchNode () extends IFetchNode {
      def this(properties: IFetchNode) = this()
      /** FetchNode sentTimeOffset. */
      @JSName("sentTimeOffset")
      var sentTimeOffset_FetchNode: Double = js.native
      /** FetchNode serviceName. */
      @JSName("serviceName")
      var serviceName_FetchNode: String = js.native
      /** FetchNode traceParsingFailed. */
      @JSName("traceParsingFailed")
      var traceParsingFailed_FetchNode: Boolean = js.native
      /**
        * Converts this FetchNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FlattenNode. */
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    class FlattenNode () extends IFlattenNode {
      def this(properties: IFlattenNode) = this()
      /** FlattenNode responsePath. */
      @JSName("responsePath")
      var responsePath_FlattenNode: js.Array[IResponsePathElement] = js.native
      /**
        * Converts this FlattenNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /** Properties of a FetchNode. */
    trait IFetchNode extends js.Object {
      /** FetchNode receivedTime */
      var receivedTime: js.UndefOr[ITimestamp | Null] = js.undefined
      /** FetchNode sentTime */
      var sentTime: js.UndefOr[ITimestamp | Null] = js.undefined
      /** FetchNode sentTimeOffset */
      var sentTimeOffset: js.UndefOr[Double | Null] = js.undefined
      /** FetchNode serviceName */
      var serviceName: js.UndefOr[String | Null] = js.undefined
      /** FetchNode trace */
      var trace: js.UndefOr[ITrace | Null] = js.undefined
      /** FetchNode traceParsingFailed */
      var traceParsingFailed: js.UndefOr[Boolean | Null] = js.undefined
    }
    
    /** Properties of a FlattenNode. */
    trait IFlattenNode extends js.Object {
      /** FlattenNode node */
      var node: js.UndefOr[IQueryPlanNode | Null] = js.undefined
      /** FlattenNode responsePath */
      var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.undefined
    }
    
    /** Properties of a ParallelNode. */
    trait IParallelNode extends js.Object {
      /** ParallelNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
    }
    
    /** Properties of a ResponsePathElement. */
    trait IResponsePathElement extends js.Object {
      /** ResponsePathElement fieldName */
      var fieldName: js.UndefOr[String | Null] = js.undefined
      /** ResponsePathElement index */
      var index: js.UndefOr[Double | Null] = js.undefined
    }
    
    /** Properties of a SequenceNode. */
    trait ISequenceNode extends js.Object {
      /** SequenceNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
    }
    
    /** Represents a ParallelNode. */
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode () extends IParallelNode {
      def this(properties: IParallelNode) = this()
      /** ParallelNode nodes. */
      @JSName("nodes")
      var nodes_ParallelNode: js.Array[IQueryPlanNode] = js.native
      /**
        * Converts this ParallelNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /** Represents a ResponsePathElement. */
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement () extends IResponsePathElement {
      def this(properties: IResponsePathElement) = this()
      /** ResponsePathElement fieldName. */
      @JSName("fieldName")
      var fieldName_ResponsePathElement: String = js.native
      /** ResponsePathElement id. */
      var id: js.UndefOr[fieldName | index] = js.native
      /** ResponsePathElement index. */
      @JSName("index")
      var index_ResponsePathElement: Double = js.native
      /**
        * Converts this ResponsePathElement to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /** Represents a SequenceNode. */
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode () extends ISequenceNode {
      def this(properties: ISequenceNode) = this()
      /** SequenceNode nodes. */
      @JSName("nodes")
      var nodes_SequenceNode: js.Array[IQueryPlanNode] = js.native
      /**
        * Converts this SequenceNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    
    /* static members */
    @js.native
    object FetchNode extends js.Object {
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      def create(): FetchNode = js.native
      def create(properties: IFetchNode): FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): FetchNode = js.native
      def decode(reader: Reader, length: Double): FetchNode = js.native
      def decode(reader: Uint8Array): FetchNode = js.native
      def decode(reader: Uint8Array, length: Double): FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): FetchNode = js.native
      def decodeDelimited(reader: Uint8Array): FetchNode = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): FetchNode = js.native
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: FetchNode): StringDictionary[js.Any] = js.native
      def toObject(message: FetchNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
      def create(): FlattenNode = js.native
      def create(properties: IFlattenNode): FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): FlattenNode = js.native
      def decode(reader: Reader, length: Double): FlattenNode = js.native
      def decode(reader: Uint8Array): FlattenNode = js.native
      def decode(reader: Uint8Array, length: Double): FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): FlattenNode = js.native
      def decodeDelimited(reader: Uint8Array): FlattenNode = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): FlattenNode = js.native
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: FlattenNode): StringDictionary[js.Any] = js.native
      def toObject(message: FlattenNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
      def create(): ParallelNode = js.native
      def create(properties: IParallelNode): ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): ParallelNode = js.native
      def decode(reader: Reader, length: Double): ParallelNode = js.native
      def decode(reader: Uint8Array): ParallelNode = js.native
      def decode(reader: Uint8Array, length: Double): ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): ParallelNode = js.native
      def decodeDelimited(reader: Uint8Array): ParallelNode = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): ParallelNode = js.native
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: ParallelNode): StringDictionary[js.Any] = js.native
      def toObject(message: ParallelNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
      def create(): ResponsePathElement = js.native
      def create(properties: IResponsePathElement): ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): ResponsePathElement = js.native
      def decode(reader: Reader, length: Double): ResponsePathElement = js.native
      def decode(reader: Uint8Array): ResponsePathElement = js.native
      def decode(reader: Uint8Array, length: Double): ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): ResponsePathElement = js.native
      def decodeDelimited(reader: Uint8Array): ResponsePathElement = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): ResponsePathElement = js.native
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: ResponsePathElement): StringDictionary[js.Any] = js.native
      def toObject(message: ResponsePathElement, options: IConversionOptions): StringDictionary[js.Any] = js.native
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
      def create(): SequenceNode = js.native
      def create(properties: ISequenceNode): SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): SequenceNode = js.native
      def decode(reader: Reader, length: Double): SequenceNode = js.native
      def decode(reader: Uint8Array): SequenceNode = js.native
      def decode(reader: Uint8Array, length: Double): SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): SequenceNode = js.native
      def decodeDelimited(reader: Uint8Array): SequenceNode = js.native
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
      def fromObject(`object`: StringDictionary[js.Any]): SequenceNode = js.native
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: SequenceNode): StringDictionary[js.Any] = js.native
      def toObject(message: SequenceNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
  }
  
}

